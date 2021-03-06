package com.chiachen.activitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_bottom: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    overridePendingTransition(R.anim.bottom_in, R.anim.bottom_out);
                    break;
                }
                case R.id.btn_top: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    overridePendingTransition(R.anim.top_in, R.anim.top_out);
                    break;
                }

                case R.id.btn_left: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    break;
                }
                case R.id.btn_right: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    overridePendingTransition(R.anim.right_in, R.anim.right_out);
                    break;
                }
                case R.id.btn_fade: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
                }
                case R.id.btn_scale: {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
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
        setTitle("First");

        findViewById(R.id.btn_bottom).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_top).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_left).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_right).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_fade).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_scale).setOnClickListener(mOnClickListener);
    }

}
