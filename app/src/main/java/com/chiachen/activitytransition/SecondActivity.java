package com.chiachen.activitytransition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_bottom: {
                    finish();
                    overridePendingTransition(R.anim.bottom_in, R.anim.bottom_out);
                    break;
                }
                case R.id.btn_top: {
                    finish();
                    overridePendingTransition(R.anim.top_in, R.anim.top_out);
                    break;
                }

                case R.id.btn_left: {
                    finish();
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    break;
                }
                case R.id.btn_right: {
                    finish();
                    overridePendingTransition(R.anim.right_in, R.anim.right_out);
                    break;
                }
                case R.id.btn_fade: {
                    finish();
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
                }
                case R.id.btn_scale: {
                    finish();
                    overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
                    break;
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Second");

        findViewById(R.id.btn_bottom).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_top).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_left).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_right).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_fade).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_scale).setOnClickListener(mOnClickListener);
    }
}
