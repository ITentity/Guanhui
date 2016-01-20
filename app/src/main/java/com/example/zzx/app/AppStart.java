package com.example.zzx.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.example.zzx.guanhui.R;

/**
 * Created by 我 on 2016/1/19.
 */
public class AppStart extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final  View view = View.inflate(this,R.layout.app_start_layout,null);
        setContentView(view);
        //渐变展示启动屏
        //设置渐变范围
        AlphaAnimation aa = new AlphaAnimation(0.4f,0.9f);
        //设置渐变时间
        aa.setDuration(800);
        //开启
        view.startAnimation(aa);
        aa.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                redirectTo();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    public void redirectTo(){
        Intent intent = new Intent(this,AppLogin.class);
        startActivity(intent);
    }
}
