package com.example.dell.framepratice.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public abstract class CommonAdapter<T, V extends ViewDataBinding> extends RecyclerView.Adapter<CommonViewHolder> {

    //item点击事件
    public OnItemClickListener mOnItemClickListener;
    //item长按事件
    public OnItemLongClickListener mOnItemLongClickListener;
    private boolean isReClick = true;
    private Timer mTimer;
    private int timerDelay = 400;

    public List<T> mData;
    public Context mContext;
    public LayoutInflater mInflater;

    public V binding;

    public CommonAdapter(Context context, List<T> data) {
        mData = data == null ? new ArrayList<>() : data;
        mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @NonNull
    @Override
    public CommonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(mInflater, getLayoutRes(), parent, false);
        return CommonViewHolder.create(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull CommonViewHolder holder, final int position) {
        binding = DataBindingUtil.getBinding(holder.itemView);
        //item点击事件
        holder.itemView.setOnClickListener(v -> {
            if (mOnItemClickListener != null) {
                if (isReClick) {
                    isReClick = false;
                    mOnItemClickListener.onItemClick(holder, position);
                    if (mTimer != null) {
                        mTimer.cancel();
                    }
                    mTimer = new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            isReClick = true;
                        }
                    };
                    mTimer.schedule(timerTask, timerDelay);
                }
            }
        });
        //item长按事件
        holder.itemView.setOnLongClickListener(v -> {
            if (mOnItemLongClickListener != null) {
                mOnItemLongClickListener.onItemLongClick(holder, position);
            }
            return true;
        });

        setData(holder, mData, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public abstract int getLayoutRes();

    public abstract void setData(CommonViewHolder holder, List<T> mData, int position);

    /**
     * item中子view的点击事件（回调）
     */
    public interface OnViewClickListener {
        /**
         * @param position item position
         * @param viewtype 点击的view的类型，调用时根据不同的view传入不同的值加以区分
         */
        void onViewClick(int position, int viewtype);
    }

    /**
     * item点击事件
     */
    public interface OnItemClickListener {
        void onItemClick(RecyclerView.ViewHolder viewHolder, int position);
    }

    /**
     * item长按事件
     */
    public interface OnItemLongClickListener {
        void onItemLongClick(RecyclerView.ViewHolder viewHolder, int position);
    }

    /**
     * 设置item点击事件
     *
     * @param onItemClickListener
     */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    /**
     * 设置item长按事件
     *
     * @param onItemLongClickListener
     */
    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public void setDelay(int delay) {
        timerDelay = delay;
    }

}
