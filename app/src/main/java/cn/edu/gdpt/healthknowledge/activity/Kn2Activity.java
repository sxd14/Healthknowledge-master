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
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.ColumnChartView;
import lecho.lib.hellocharts.view.LineChartView;

public class Kn2Activity extends AppCompatActivity {
    private TextView tv_main_title, tv_back;
    private RelativeLayout rl_title_bar;
    private SwipeBackLayout layout;
    public final static String[] years = new String[]{"排球", "篮球", "羽毛球", "足球", "乒乓球", "毽球", "网球"};
    private LineChartView chartTop;
    private ColumnChartView chartBottom;
    private LineChartData lineData;
    private ColumnChartData columnData;
    private int[] columnY = {0, 20, 40, 60, 80, 100, 120, 140, 160,
            180, 200};
    private TextView tv_intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = (SwipeBackLayout) LayoutInflater.from(this).inflate(
                R.layout.base, null);
        layout.attachToActivity(this);
        setContentView(R.layout.activity_kn2);
        init();
    }
    private void init() {
        tv_main_title = (TextView) findViewById(R.id.tv_main_title);
        tv_main_title.setText("体育爱好统计");
        rl_title_bar = (RelativeLayout) findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(getResources().getColor(R.color.
                rdTextColorPress));
        tv_intro = (TextView) findViewById(R.id.tv_intro);
        tv_intro.setText(getResources().getString(R.string.java_count_text));
        tv_back = (TextView) findViewById(R.id.tv_back);
        tv_back.setVisibility(View.VISIBLE);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kn2Activity.this.finish();
            }
        });
        chartTop = (LineChartView) findViewById(R.id.chart_top);
        generateInitialLineData();
        chartBottom = (ColumnChartView) findViewById(R.id.chart_bottom);
        generateColumnData();
    }
    private void generateColumnData() {
        int numColumns = years.length;
        List<AxisValue> axisValues = new ArrayList<AxisValue>();
        List<AxisValue> axisYValues = new ArrayList<AxisValue>();
        List<Column> columns = new ArrayList<Column>();
        List<SubcolumnValue> values;
        for (int k = 0; k < columnY.length; k++) {
            axisYValues.add(new AxisValue(k).setValue(columnY[k]));
        }
        for (int i = 0; i < numColumns; ++i) {
            values = new ArrayList<SubcolumnValue>();
            switch (i) {
                case 0:
                    values.add(new SubcolumnValue((float) 20, ChartUtils.COLOR_GREEN));
                    break;
                case 1:
                    values.add(new SubcolumnValue((float) 50, ChartUtils.
                            COLOR_ORANGE));
                    break;
                case 2:
                    values.add(new SubcolumnValue((float) 75, ChartUtils.COLOR_BLUE));
                    break;
                case 3:
                    values.add(new SubcolumnValue((float) 80, ChartUtils.COLOR_RED));
                    break;
                case 4:
                    values.add(new SubcolumnValue((float) 90, ChartUtils.
                            COLOR_VIOLET));
                    break;
                case 5:
                    values.add(new SubcolumnValue((float) 100, ChartUtils.
                            COLOR_ORANGE));
                    break;
                case 6:
                    values.add(new SubcolumnValue((float) 110, ChartUtils.COLOR_BLUE));
                    break;
            }
            axisValues.add(new AxisValue(i).setLabel(years[i]));
            columns.add(new Column(values).setHasLabelsOnlyForSelected(true));
        }
        columnData = new ColumnChartData(columns);
        columnData.setAxisXBottom(new Axis(axisValues).setHasLines(true));
        columnData.setAxisYLeft(new Axis(axisYValues).setHasLines(true).
                setMaxLabelChars(6));
        chartBottom.setColumnChartData(columnData);
        chartBottom.setValueSelectionEnabled(true);
        chartBottom.setZoomType(ZoomType.HORIZONTAL);
    }
    private void generateInitialLineData() {
        int numValues = 7;
        List<AxisValue> axisValues = new ArrayList<AxisValue>();
        List<PointValue> values = new ArrayList<PointValue>();
        for (int i = 0; i < numValues; ++i) {
            values.add(new PointValue(i, 0));
            axisValues.add(new AxisValue(i).setLabel(years[i]));
        }
        Line line = new Line(values);
        line.setColor(ChartUtils.COLOR_GREEN).setCubic(true);
        List<Line> lines = new ArrayList<Line>();
        lines.add(line);
        lineData = new LineChartData(lines);
        lineData.setAxisXBottom(new Axis(axisValues).setHasLines(true));
        lineData.setAxisYLeft(new Axis().setHasLines(true).setMaxLabelChars(6));
        chartTop.setLineChartData(lineData);
        chartTop.setViewportCalculationEnabled(false);
        Viewport v = new Viewport(0, 200, 6, 0);
        chartTop.setMaximumViewport(v);
        chartTop.setCurrentViewport(v);
        chartTop.setZoomType(ZoomType.HORIZONTAL);
        generateLineData();
    }
    private void generateLineData() {
        Line line = lineData.getLines().get(0);
        for (int i = 0; i < line.getValues().size(); i++) {
            PointValue value = line.getValues().get(i);
            switch (i) {
                case 0:
                    value.setTarget(value.getX(), (float) 20);
                    break;
                case 1:
                    value.setTarget(value.getX(), (float) 50);
                    break;
                case 2:
                    value.setTarget(value.getX(), (float) 75);
                    break;
                case 3:
                    value.setTarget(value.getX(), (float) 80);
                    break;
                case 4:
                    value.setTarget(value.getX(), (float) 90);
                    break;
                case 5:
                    value.setTarget(value.getX(), (float) 100);
                    break;
                case 6:
                    value.setTarget(value.getX(), (float) 110);
                    break;
            }
        }
        chartTop.startDataAnimation(300);
    }
}
