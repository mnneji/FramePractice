package com.example.dell.framepratice.base;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

public class CommonViewHolder extends RecyclerView.ViewHolder {
    /**
     * 私有构造方法
     *
     * @param itemView
     */
    private CommonViewHolder(View itemView) {
        super(itemView);
    }

    public static CommonViewHolder create(View itemView) {
        return new CommonViewHolder(itemView);
    }

}
