package com.example.dell.framepratice.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AirBean {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * error_code : 0
     * result : [{"citynow":{"city":"suzhou","AQI":"77","quality":"良","date":"2014-05-09 14:00"},"lastTwoWeeks":{"1":{"city":"suzhou","AQI":"100","quality":"良","date":"2014-05-08"},"2":{"city":"suzhou","AQI":"99","quality":"良","date":"2014-05-07"},"3":{"city":"suzhou","AQI":"77","quality":"良","date":"2014-05-06"},"4":{"city":"suzhou","AQI":"75","quality":"良","date":"2014-05-05"},"5":{"city":"suzhou","AQI":"78","quality":"良","date":"2014-05-04"},"6":{"city":"suzhou","AQI":"84","quality":"良","date":"2014-05-03"},"7":{"city":"suzhou","AQI":"135","quality":"轻度污染","date":"2014-05-02"},"8":{"city":"suzhou","AQI":"126","quality":"轻度污染","date":"2014-05-01"},"9":{"city":"suzhou","AQI":"87","quality":"良","date":"2014-04-30"},"10":{"city":"suzhou","AQI":"97","quality":"良","date":"2014-04-29"},"11":{"city":"suzhou","AQI":"77","quality":"良","date":"2014-04-28"},"12":{"city":"suzhou","AQI":"84","quality":"良","date":"2014-04-27"},"13":{"city":"suzhou","AQI":"45","quality":"优","date":"2014-04-26"},"14":{"city":"suzhou","AQI":"56","quality":"良","date":"2014-04-25"},"15":{"city":"suzhou","AQI":"83","quality":"良","date":"2014-04-24"},"16":{"city":"suzhou","AQI":"95","quality":"良","date":"2014-04-23"},"17":{"city":"suzhou","AQI":"101","quality":"轻度污染","date":"2014-04-22"}},"lastMoniData":{"1":{"city":"上方山","AQI":"77","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"104μg/m³","lat":"31.247222","lon":"120.561389"},"2":{"city":"南门","AQI":"112","quality":"轻度污染","PM2.5Hour":"84μg/m³","PM2.5Day":"84μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.286389","lon":"120.6275"},"3":{"city":"彩香","AQI":"76","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"101μg/m³","lat":"31.301944","lon":"120.590833"},"4":{"city":"轧钢厂","AQI":"68","quality":"良","PM2.5Hour":"41μg/m³","PM2.5Day":"41μg/m³","PM10Hour":"85μg/m³","lat":"31.326389","lon":"120.595556"},"5":{"city":"吴中区","AQI":"64","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.270278","lon":"120.612778"},"6":{"city":"苏州新区","AQI":"72","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"93μg/m³","lat":"31.299444","lon":"120.543333"},"7":{"city":"苏州工业园区","AQI":"82","quality":"良","PM2.5Hour":"60μg/m³","PM2.5Day":"60μg/m³","PM10Hour":"88μg/m³","lat":"31.309722","lon":"120.669167"}}}]
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * citynow : {"city":"suzhou","AQI":"77","quality":"良","date":"2014-05-09 14:00"}
         * lastTwoWeeks : {"1":{"city":"suzhou","AQI":"100","quality":"良","date":"2014-05-08"},"2":{"city":"suzhou","AQI":"99","quality":"良","date":"2014-05-07"},"3":{"city":"suzhou","AQI":"77","quality":"良","date":"2014-05-06"},"4":{"city":"suzhou","AQI":"75","quality":"良","date":"2014-05-05"},"5":{"city":"suzhou","AQI":"78","quality":"良","date":"2014-05-04"},"6":{"city":"suzhou","AQI":"84","quality":"良","date":"2014-05-03"},"7":{"city":"suzhou","AQI":"135","quality":"轻度污染","date":"2014-05-02"},"8":{"city":"suzhou","AQI":"126","quality":"轻度污染","date":"2014-05-01"},"9":{"city":"suzhou","AQI":"87","quality":"良","date":"2014-04-30"},"10":{"city":"suzhou","AQI":"97","quality":"良","date":"2014-04-29"},"11":{"city":"suzhou","AQI":"77","quality":"良","date":"2014-04-28"},"12":{"city":"suzhou","AQI":"84","quality":"良","date":"2014-04-27"},"13":{"city":"suzhou","AQI":"45","quality":"优","date":"2014-04-26"},"14":{"city":"suzhou","AQI":"56","quality":"良","date":"2014-04-25"},"15":{"city":"suzhou","AQI":"83","quality":"良","date":"2014-04-24"},"16":{"city":"suzhou","AQI":"95","quality":"良","date":"2014-04-23"},"17":{"city":"suzhou","AQI":"101","quality":"轻度污染","date":"2014-04-22"}}
         * lastMoniData : {"1":{"city":"上方山","AQI":"77","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"104μg/m³","lat":"31.247222","lon":"120.561389"},"2":{"city":"南门","AQI":"112","quality":"轻度污染","PM2.5Hour":"84μg/m³","PM2.5Day":"84μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.286389","lon":"120.6275"},"3":{"city":"彩香","AQI":"76","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"101μg/m³","lat":"31.301944","lon":"120.590833"},"4":{"city":"轧钢厂","AQI":"68","quality":"良","PM2.5Hour":"41μg/m³","PM2.5Day":"41μg/m³","PM10Hour":"85μg/m³","lat":"31.326389","lon":"120.595556"},"5":{"city":"吴中区","AQI":"64","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.270278","lon":"120.612778"},"6":{"city":"苏州新区","AQI":"72","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"93μg/m³","lat":"31.299444","lon":"120.543333"},"7":{"city":"苏州工业园区","AQI":"82","quality":"良","PM2.5Hour":"60μg/m³","PM2.5Day":"60μg/m³","PM10Hour":"88μg/m³","lat":"31.309722","lon":"120.669167"}}
         */

        private CitynowBean citynow;
        private LastTwoWeeksBean lastTwoWeeks;
        private LastMoniDataBean lastMoniData;

        public CitynowBean getCitynow() {
            return citynow;
        }

        public void setCitynow(CitynowBean citynow) {
            this.citynow = citynow;
        }

        public LastTwoWeeksBean getLastTwoWeeks() {
            return lastTwoWeeks;
        }

        public void setLastTwoWeeks(LastTwoWeeksBean lastTwoWeeks) {
            this.lastTwoWeeks = lastTwoWeeks;
        }

        public LastMoniDataBean getLastMoniData() {
            return lastMoniData;
        }

        public void setLastMoniData(LastMoniDataBean lastMoniData) {
            this.lastMoniData = lastMoniData;
        }

        public static class CitynowBean {
            /**
             * city : suzhou
             * AQI : 77
             * quality : 良
             * date : 2014-05-09 14:00
             */

            private String city;
            private String AQI;
            private String quality;
            private String date;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAQI() {
                return AQI;
            }

            public void setAQI(String AQI) {
                this.AQI = AQI;
            }

            public String getQuality() {
                return quality;
            }

            public void setQuality(String quality) {
                this.quality = quality;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            @Override
            public String toString() {
                return "CitynowBean{" +
                        "city='" + city + '\'' +
                        ", AQI='" + AQI + '\'' +
                        ", quality='" + quality + '\'' +
                        ", date='" + date + '\'' +
                        '}';
            }
        }

        public static class LastTwoWeeksBean {
            /**
             * 1 : {"city":"suzhou","AQI":"100","quality":"良","date":"2014-05-08"}
             * 2 : {"city":"suzhou","AQI":"99","quality":"良","date":"2014-05-07"}
             * 3 : {"city":"suzhou","AQI":"77","quality":"良","date":"2014-05-06"}
             * 4 : {"city":"suzhou","AQI":"75","quality":"良","date":"2014-05-05"}
             * 5 : {"city":"suzhou","AQI":"78","quality":"良","date":"2014-05-04"}
             * 6 : {"city":"suzhou","AQI":"84","quality":"良","date":"2014-05-03"}
             * 7 : {"city":"suzhou","AQI":"135","quality":"轻度污染","date":"2014-05-02"}
             * 8 : {"city":"suzhou","AQI":"126","quality":"轻度污染","date":"2014-05-01"}
             * 9 : {"city":"suzhou","AQI":"87","quality":"良","date":"2014-04-30"}
             * 10 : {"city":"suzhou","AQI":"97","quality":"良","date":"2014-04-29"}
             * 11 : {"city":"suzhou","AQI":"77","quality":"良","date":"2014-04-28"}
             * 12 : {"city":"suzhou","AQI":"84","quality":"良","date":"2014-04-27"}
             * 13 : {"city":"suzhou","AQI":"45","quality":"优","date":"2014-04-26"}
             * 14 : {"city":"suzhou","AQI":"56","quality":"良","date":"2014-04-25"}
             * 15 : {"city":"suzhou","AQI":"83","quality":"良","date":"2014-04-24"}
             * 16 : {"city":"suzhou","AQI":"95","quality":"良","date":"2014-04-23"}
             * 17 : {"city":"suzhou","AQI":"101","quality":"轻度污染","date":"2014-04-22"}
             */

            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;
            @SerializedName("10")
            private _$10Bean _$10;
            @SerializedName("11")
            private _$11Bean _$11;
            @SerializedName("12")
            private _$12Bean _$12;
            @SerializedName("13")
            private _$13Bean _$13;
            @SerializedName("14")
            private _$14Bean _$14;
            @SerializedName("15")
            private _$15Bean _$15;
            @SerializedName("16")
            private _$16Bean _$16;
            @SerializedName("17")
            private _$17Bean _$17;

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            public _$11Bean get_$11() {
                return _$11;
            }

            public void set_$11(_$11Bean _$11) {
                this._$11 = _$11;
            }

            public _$12Bean get_$12() {
                return _$12;
            }

            public void set_$12(_$12Bean _$12) {
                this._$12 = _$12;
            }

            public _$13Bean get_$13() {
                return _$13;
            }

            public void set_$13(_$13Bean _$13) {
                this._$13 = _$13;
            }

            public _$14Bean get_$14() {
                return _$14;
            }

            public void set_$14(_$14Bean _$14) {
                this._$14 = _$14;
            }

            public _$15Bean get_$15() {
                return _$15;
            }

            public void set_$15(_$15Bean _$15) {
                this._$15 = _$15;
            }

            public _$16Bean get_$16() {
                return _$16;
            }

            public void set_$16(_$16Bean _$16) {
                this._$16 = _$16;
            }

            public _$17Bean get_$17() {
                return _$17;
            }

            public void set_$17(_$17Bean _$17) {
                this._$17 = _$17;
            }

            public static class _$1Bean {
                /**
                 * city : suzhou
                 * AQI : 100
                 * quality : 良
                 * date : 2014-05-08
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$2Bean {
                /**
                 * city : suzhou
                 * AQI : 99
                 * quality : 良
                 * date : 2014-05-07
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$3Bean {
                /**
                 * city : suzhou
                 * AQI : 77
                 * quality : 良
                 * date : 2014-05-06
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$4Bean {
                /**
                 * city : suzhou
                 * AQI : 75
                 * quality : 良
                 * date : 2014-05-05
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$5Bean {
                /**
                 * city : suzhou
                 * AQI : 78
                 * quality : 良
                 * date : 2014-05-04
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$6Bean {
                /**
                 * city : suzhou
                 * AQI : 84
                 * quality : 良
                 * date : 2014-05-03
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$7Bean {
                /**
                 * city : suzhou
                 * AQI : 135
                 * quality : 轻度污染
                 * date : 2014-05-02
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$8Bean {
                /**
                 * city : suzhou
                 * AQI : 126
                 * quality : 轻度污染
                 * date : 2014-05-01
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$9Bean {
                /**
                 * city : suzhou
                 * AQI : 87
                 * quality : 良
                 * date : 2014-04-30
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$10Bean {
                /**
                 * city : suzhou
                 * AQI : 97
                 * quality : 良
                 * date : 2014-04-29
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$11Bean {
                /**
                 * city : suzhou
                 * AQI : 77
                 * quality : 良
                 * date : 2014-04-28
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$12Bean {
                /**
                 * city : suzhou
                 * AQI : 84
                 * quality : 良
                 * date : 2014-04-27
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$13Bean {
                /**
                 * city : suzhou
                 * AQI : 45
                 * quality : 优
                 * date : 2014-04-26
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$14Bean {
                /**
                 * city : suzhou
                 * AQI : 56
                 * quality : 良
                 * date : 2014-04-25
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$15Bean {
                /**
                 * city : suzhou
                 * AQI : 83
                 * quality : 良
                 * date : 2014-04-24
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$16Bean {
                /**
                 * city : suzhou
                 * AQI : 95
                 * quality : 良
                 * date : 2014-04-23
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class _$17Bean {
                /**
                 * city : suzhou
                 * AQI : 101
                 * quality : 轻度污染
                 * date : 2014-04-22
                 */

                private String city;
                private String AQI;
                private String quality;
                private String date;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }
        }

        public static class LastMoniDataBean {
            /**
             * 1 : {"city":"上方山","AQI":"77","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"104μg/m³","lat":"31.247222","lon":"120.561389"}
             * 2 : {"city":"南门","AQI":"112","quality":"轻度污染","PM2.5Hour":"84μg/m³","PM2.5Day":"84μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.286389","lon":"120.6275"}
             * 3 : {"city":"彩香","AQI":"76","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"101μg/m³","lat":"31.301944","lon":"120.590833"}
             * 4 : {"city":"轧钢厂","AQI":"68","quality":"良","PM2.5Hour":"41μg/m³","PM2.5Day":"41μg/m³","PM10Hour":"85μg/m³","lat":"31.326389","lon":"120.595556"}
             * 5 : {"city":"吴中区","AQI":"64","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"\u2014μg/m³","lat":"31.270278","lon":"120.612778"}
             * 6 : {"city":"苏州新区","AQI":"72","quality":"良","PM2.5Hour":"46μg/m³","PM2.5Day":"46μg/m³","PM10Hour":"93μg/m³","lat":"31.299444","lon":"120.543333"}
             * 7 : {"city":"苏州工业园区","AQI":"82","quality":"良","PM2.5Hour":"60μg/m³","PM2.5Day":"60μg/m³","PM10Hour":"88μg/m³","lat":"31.309722","lon":"120.669167"}
             */

            @SerializedName("1")
            private _$1BeanX _$1;
            @SerializedName("2")
            private _$2BeanX _$2;
            @SerializedName("3")
            private _$3BeanX _$3;
            @SerializedName("4")
            private _$4BeanX _$4;
            @SerializedName("5")
            private _$5BeanX _$5;
            @SerializedName("6")
            private _$6BeanX _$6;
            @SerializedName("7")
            private _$7BeanX _$7;

            public _$1BeanX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanX _$1) {
                this._$1 = _$1;
            }

            public _$2BeanX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanX _$7) {
                this._$7 = _$7;
            }

            public static class _$1BeanX {
                /**
                 * city : 上方山
                 * AQI : 77
                 * quality : 良
                 * PM2.5Hour : 46μg/m³
                 * PM2.5Day : 46μg/m³
                 * PM10Hour : 104μg/m³
                 * lat : 31.247222
                 * lon : 120.561389
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour92; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day328; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour92() {
                    return _$PM25Hour92;
                }

                public void set_$PM25Hour92(String _$PM25Hour92) {
                    this._$PM25Hour92 = _$PM25Hour92;
                }

                public String get_$PM25Day328() {
                    return _$PM25Day328;
                }

                public void set_$PM25Day328(String _$PM25Day328) {
                    this._$PM25Day328 = _$PM25Day328;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$2BeanX {
                /**
                 * city : 南门
                 * AQI : 112
                 * quality : 轻度污染
                 * PM2.5Hour : 84μg/m³
                 * PM2.5Day : 84μg/m³
                 * PM10Hour : —μg/m³
                 * lat : 31.286389
                 * lon : 120.6275
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour318; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day226; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour318() {
                    return _$PM25Hour318;
                }

                public void set_$PM25Hour318(String _$PM25Hour318) {
                    this._$PM25Hour318 = _$PM25Hour318;
                }

                public String get_$PM25Day226() {
                    return _$PM25Day226;
                }

                public void set_$PM25Day226(String _$PM25Day226) {
                    this._$PM25Day226 = _$PM25Day226;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$3BeanX {
                /**
                 * city : 彩香
                 * AQI : 76
                 * quality : 良
                 * PM2.5Hour : 46μg/m³
                 * PM2.5Day : 46μg/m³
                 * PM10Hour : 101μg/m³
                 * lat : 31.301944
                 * lon : 120.590833
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour294; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day206; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour294() {
                    return _$PM25Hour294;
                }

                public void set_$PM25Hour294(String _$PM25Hour294) {
                    this._$PM25Hour294 = _$PM25Hour294;
                }

                public String get_$PM25Day206() {
                    return _$PM25Day206;
                }

                public void set_$PM25Day206(String _$PM25Day206) {
                    this._$PM25Day206 = _$PM25Day206;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$4BeanX {
                /**
                 * city : 轧钢厂
                 * AQI : 68
                 * quality : 良
                 * PM2.5Hour : 41μg/m³
                 * PM2.5Day : 41μg/m³
                 * PM10Hour : 85μg/m³
                 * lat : 31.326389
                 * lon : 120.595556
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour253; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day84; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour253() {
                    return _$PM25Hour253;
                }

                public void set_$PM25Hour253(String _$PM25Hour253) {
                    this._$PM25Hour253 = _$PM25Hour253;
                }

                public String get_$PM25Day84() {
                    return _$PM25Day84;
                }

                public void set_$PM25Day84(String _$PM25Day84) {
                    this._$PM25Day84 = _$PM25Day84;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$5BeanX {
                /**
                 * city : 吴中区
                 * AQI : 64
                 * quality : 良
                 * PM2.5Hour : 46μg/m³
                 * PM2.5Day : 46μg/m³
                 * PM10Hour : —μg/m³
                 * lat : 31.270278
                 * lon : 120.612778
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour288; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day76; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour288() {
                    return _$PM25Hour288;
                }

                public void set_$PM25Hour288(String _$PM25Hour288) {
                    this._$PM25Hour288 = _$PM25Hour288;
                }

                public String get_$PM25Day76() {
                    return _$PM25Day76;
                }

                public void set_$PM25Day76(String _$PM25Day76) {
                    this._$PM25Day76 = _$PM25Day76;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$6BeanX {
                /**
                 * city : 苏州新区
                 * AQI : 72
                 * quality : 良
                 * PM2.5Hour : 46μg/m³
                 * PM2.5Day : 46μg/m³
                 * PM10Hour : 93μg/m³
                 * lat : 31.299444
                 * lon : 120.543333
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour3; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day81; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour3() {
                    return _$PM25Hour3;
                }

                public void set_$PM25Hour3(String _$PM25Hour3) {
                    this._$PM25Hour3 = _$PM25Hour3;
                }

                public String get_$PM25Day81() {
                    return _$PM25Day81;
                }

                public void set_$PM25Day81(String _$PM25Day81) {
                    this._$PM25Day81 = _$PM25Day81;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class _$7BeanX {
                /**
                 * city : 苏州工业园区
                 * AQI : 82
                 * quality : 良
                 * PM2.5Hour : 60μg/m³
                 * PM2.5Day : 60μg/m³
                 * PM10Hour : 88μg/m³
                 * lat : 31.309722
                 * lon : 120.669167
                 */

                private String city;
                private String AQI;
                private String quality;
                @SerializedName("PM2.5Hour")
                private String _$PM25Hour257; // FIXME check this code
                @SerializedName("PM2.5Day")
                private String _$PM25Day153; // FIXME check this code
                private String PM10Hour;
                private String lat;
                private String lon;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAQI() {
                    return AQI;
                }

                public void setAQI(String AQI) {
                    this.AQI = AQI;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String get_$PM25Hour257() {
                    return _$PM25Hour257;
                }

                public void set_$PM25Hour257(String _$PM25Hour257) {
                    this._$PM25Hour257 = _$PM25Hour257;
                }

                public String get_$PM25Day153() {
                    return _$PM25Day153;
                }

                public void set_$PM25Day153(String _$PM25Day153) {
                    this._$PM25Day153 = _$PM25Day153;
                }

                public String getPM10Hour() {
                    return PM10Hour;
                }

                public void setPM10Hour(String PM10Hour) {
                    this.PM10Hour = PM10Hour;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }
        }
    }
}
