package cn.edu.gdpt.healthknowledge.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.activity.Kn1Activity;
import cn.edu.gdpt.healthknowledge.activity.Kn2Activity;
import cn.edu.gdpt.healthknowledge.activity.ShowActivity;
import cn.edu.gdpt.healthknowledge.utils.BuilderManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class KnowledgeFragment extends Fragment {
    private BoomMenuButton bmb;
    private WebView webView;
    private Context context;
    public KnowledgeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge, container, false);
        bmb = (BoomMenuButton) view.findViewById(R.id.bmb);
        assert bmb != null;
        bmb.setButtonEnum(ButtonEnum.TextInsideCircle);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_9_1);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_9_1);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            addBuilder();
        }
        return view;
    }

    private void addBuilder() {
        bmb.addBuilder(new TextInsideCircleButton.Builder()
                .normalImageRes(BuilderManager.getImageResource())
                .normalTextRes(BuilderManager.getTextResource())
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        switch (index) {
                            case 0:
                                Intent android = new Intent(getActivity(), Kn1Activity.class);
                                startActivity(android);
                                break;
                            case 1:
                                Intent java = new Intent(getActivity(), Kn2Activity.class);
                                startActivity(java);
                                break;
                            case 2:
                                Intent intent3 = new Intent(getActivity(), ShowActivity.class);
                                intent3.putExtra("URL", "https://baike.baidu.com/item/%E5%BF%83%E7%90%86%E5%81%A5%E5%BA%B7/5593?fr=aladdin");
                                startActivity(intent3);
                                break;
                            case 3:
                                Intent intent4 = new Intent(getActivity(), ShowActivity.class);
                                intent4.putExtra("URL", "https://jingyan.baidu.com/article/0bc808fc884fe11bd485b90e.html");
                                startActivity(intent4);
                                break;
                            case 4:
                                Intent intent5 = new Intent(getActivity(), ShowActivity.class);
                                intent5.putExtra("URL", "http://dy.163.com/v2/article/detail/DJIBOECA0514OC4E.html");
                                startActivity(intent5);
                                break;
                            case 5:
                                Intent intent6 = new Intent(getActivity(), ShowActivity.class);
                                intent6.putExtra("URL", "https://iask.sina.com.cn/b/1SZMK0EmoKYZ.html");
                                startActivity(intent6);
                                break;
                            case 6:
                                Intent intent7 = new Intent(getActivity(), ShowActivity.class);
                                intent7.putExtra("URL", "https://baike.baidu.com/item/%E5%81%A5%E5%BA%B7%E8%A1%8C%E4%B8%BA/3369522?fr=aladdin");
                                startActivity(intent7);
                                break;
                            case 7:
                                Intent intent8 = new Intent(getActivity(), ShowActivity.class);
                                intent8.putExtra("URL", "https://baike.baidu.com/item/%E5%85%BB%E7%94%9F/198060?fr=aladdin");
                                startActivity(intent8);
                                break;
                            case 8:
                                Intent intent9 = new Intent(getActivity(), ShowActivity.class);
                                intent9.putExtra("URL", "https://baike.baidu.com/item/%E5%87%8F%E8%82%A5/151598");
                                startActivity(intent9);
                                break;

                        }
                    }
                }));
    }
}
