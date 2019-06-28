package cn.edu.gdpt.healthknowledge.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import cn.edu.gdpt.healthknowledge.LoginActivity;
import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.activity.GuanyuActivity;
import cn.edu.gdpt.healthknowledge.activity.PhotoActivity;
import cn.edu.gdpt.healthknowledge.activity.ShowActivity;
import cn.edu.gdpt.healthknowledge.activity.YangshengActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private View view;
    private ImageButton yonghu;
    private Button btn_xiangce;
    private Button btn_guanyu;
    private Button btn_yangsheng;
    private WebView webView;
    private ImageView sc;
    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_me, container, false);

        webView = (WebView) view.findViewById(R.id.webview);
        yonghu=(ImageButton)view.findViewById(R.id.yonghu);
        yonghu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_xiangce=(Button)view.findViewById(R.id.btn_xiangce);
        btn_xiangce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), PhotoActivity.class);
                startActivity(intent);
            }
        });
        btn_guanyu=(Button)view.findViewById(R.id.btn_guanyu);
        btn_guanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), GuanyuActivity.class);
                startActivity(intent);
            }
        });
        btn_yangsheng=(Button)view.findViewById(R.id.btn_yangsheng);
        btn_yangsheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), YangshengActivity.class);
                intent.putExtra("URL", "https://jingyan.baidu.com/article/c35dbcb0b1e3848916fcbc19.html");
                startActivity(intent);
            }
        });
        sc=(ImageView)view.findViewById(R.id.sc);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ShowActivity.class);
                intent.putExtra("URL", "http://www.360doc.com/content/18/0328/09/13964870_740797999.shtml");
                startActivity(intent);
            }
        });
       return view;
    }
}