package cn.edu.gdpt.healthknowledge.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import cn.edu.gdpt.healthknowledge.R;

public class PhotoActivity extends AppCompatActivity {
    private Integer[]  imglist;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        imglist = new Integer[]{R.drawable.sw1, R.drawable.sw2, R.drawable.sw3, R.drawable.sw4, R.drawable.sw5,
        R.drawable.sw6,R.drawable.sw7,R.drawable.sw8,R.drawable.sw9};
        ImagAdapter imagAdapter = new ImagAdapter(PhotoActivity.this);
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(imagAdapter);
        imageView = (ImageView) findViewById(R.id.img_show);
        imageView.setImageResource(imglist[0]);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                imageView.setImageResource(imglist[arg2]);
            }
        });
    }
    class ImagAdapter extends BaseAdapter{
        private Context mContext;

        public ImagAdapter(Context context) {
            mContext=context;
        }

        @Override
        public int getCount() {
            return imglist.length;
        }

        @Override
        public Object getItem(int arg0) {
            return imglist[arg0];
        }

        @Override
        public long getItemId(int arg0) {
            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            ImageView img = new ImageView(mContext);
            img.setLayoutParams(new Gallery.LayoutParams(300, 300));
            img.setScaleType(ImageView.ScaleType.FIT_CENTER);
            img.setPadding(5, 5, 5, 5);
            img.setImageResource(imglist[arg0]);
            return img;
        }
    }

    }




