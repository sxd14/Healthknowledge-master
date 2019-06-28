package cn.edu.gdpt.healthknowledge.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.bean.FirstBean;

public class JiankangActivity extends AppCompatActivity {
    private FirstBean.NewslistBean homebean;
    private TextView health_tv_title;
    private TextView health_tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiankang);

        initView();
        Intent intent=getIntent();
        String title = intent.getStringExtra("bean");
        String context = intent.getStringExtra("context");
        health_tv_content.setText(context);
        health_tv_title.setText(title);
    }

    private void initView() {
        health_tv_title = (TextView) findViewById(R.id.health_tv_title);
        health_tv_content = (TextView) findViewById(R.id.health_tv_content);
    }
}





