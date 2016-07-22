package cn.jetsoon.leancloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试Sdk是否正常工作的代码
        AVObject avObject=new AVObject("testAVSDK");
        avObject.put("words","helloworld");
        avObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if (e==null){
                    Logger.v("Main","连接成功！");
                    Logger.i("Main","连接成功！");
                    Logger.d("Main","连接成功！");
                    Logger.w("Main","连接成功！");
                    Logger.e("Main","连接成功！");
                }else {
                    Logger.i("Main","连接失败！");
                }
            }
        });

    }
}
