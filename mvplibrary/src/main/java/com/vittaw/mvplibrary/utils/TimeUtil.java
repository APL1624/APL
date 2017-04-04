package com.vittaw.mvplibrary.utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/27 0027.
 */

public class TimeUtil {

    /**
     * 上映时间的转化工具类
     * @param releaseTime
     * @return
     */
    public static String converseReleaseTime(String releaseTime){
        return releaseTime.replace("-","/");
    }

}
