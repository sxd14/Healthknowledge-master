package cn.edu.gdpt.healthknowledge.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.SwipeBackLayout;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.PieChartView;

public class Kn1Activity extends AppCompatActivity {
    private TextView tv_main_title, tv_back, tv_intro;
    private RelativeLayout rl_title_bar;
    private SwipeBackLayout layout;
    private PieChartView chart;
    private PieChartData data;
    private boolean hasLabels = false;
    private boolean hasLabelsOutside = false;
    private boolean isExploded = false;
    private boolean hasLabelForSelected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = (SwipeBackLayout) LayoutInflater.from(this).inflate(
                R.layout.base, null);
        layout.attachToActivity(this);
        setContentView(R.layout.activity_kn1);
        init();
    }
    private void init() {
        tv_main_title = (TextView) findViewById(R.id.tv_main_title);
        tv_main_title.setText("学生对健康知识的重视程度");
        rl_title_bar = (RelativeLayout) findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(getResources().getColor(R.color.
                rdTextColorPress));
        tv_back = (TextView) findViewById(R.id.tv_back);
        tv_back.setVisibility(View.VISIBLE);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kn1Activity.this.finish();
            }
        });
        tv_intro = (TextView) findViewById(R.id.tv_intro);
        tv_intro.setText(getResources().getString(R.string.android_count_text));
        chart = (PieChartView) findViewById(R.id.chart);
        toggleLabels();
        chart.startDataAnimation();
    }
    private void generateData() {
        int numValues = 4;
        List<SliceValue> values = new ArrayList<SliceValue>();
        for (int i = 0; i < numValues; ++i) {
            switch (i+1) {
                case 1:
                    SliceValue sliceValue1 = new SliceValue(i + 1, ChartUtils.COLOR_GREEN);
                    sliceValue1.setTarget(4);            //扇形的大小
                    sliceValue1.setLabel("小学生");  //扇形中的文本
                    values.add(sliceValue1);
                    break;
                case 2:
                    SliceValue sliceValue2 = new SliceValue(i + 1,ChartUtils.COLOR_VIOLET);
                    sliceValue2.setTarget(3);
                    sliceValue2.setLabel("初中生");
                    values.add(sliceValue2);
                    break;
                case 3:
                    SliceValue sliceValue3 = new SliceValue(i + 1,ChartUtils.COLOR_BLUE);
                    sliceValue3.setTarget(2);
                    sliceValue3.setLabel("高中生");
                    values.add(sliceValue3);
                    break;
                case 4:
                    SliceValue sliceValue4 = new SliceValue(i + 1,ChartUtils.COLOR_ORANGE);
                    sliceValue4.setTarget(1);
                    sliceValue4.setLabel("大学生");
                    values.add(sliceValue4);
                    break;
            }
        }
        data = new PieChartData(values);
        data.setHasLabels(hasLabels);
        data.setHasLabelsOnlyForSelected(hasLabelForSelected);
        data.setHasLabelsOutside(hasLabelsOutside);
        if (isExploded) {
            data.setSlicesSpacing(24);
        }
        chart.setPieChartData(data);
    }
    private void toggleLabels() {
        hasLabels = !hasLabels;
        if (hasLabels) {
            hasLabelForSelected = false;
            chart.setValueSelectionEnabled(hasLabelForSelected);
            if (hasLabelsOutside) {
                chart.setCircleFillRatio(0.7f);
            } else {
                chart.setCircleFillRatio(1.0f);
            }
        }
        generateData();
    }
}

