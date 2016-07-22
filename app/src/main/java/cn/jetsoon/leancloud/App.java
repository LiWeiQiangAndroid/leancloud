package cn.jetsoon.leancloud;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.orhanobut.logger.Logger;

/**
 * author：LiWeiQiang
 * time：2016/7/22
 * description：
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("调试");
        //初始化参数依次为this,AppId,Appkey
        AVOSCloud.initialize(this,"D0RpAEf8dKUNWPaze1dblFbN-gzGzoHsz","S2qzn1BOoS92zwdRdyLkXCOB");

    }
}
