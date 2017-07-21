package com.example.qthjen.drawable;

import android.graphics.drawable.ClipDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Q.ThjeN on 7/21/2017.
 */

public class ClipImage extends AppCompatActivity {

    ImageView clipIv;
    Button btClick4;
    Button btClick5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clip_image);

        clipIv = (ImageView) findViewById(R.id.clipIv);
        btClick4 = (Button) findViewById(R.id.btClick4);
        btClick5 = (Button) findViewById(R.id.btClick5);

        clipIv.setImageLevel(1000); // 7/10 ảnh

        final ClipDrawable clipDrawable = (ClipDrawable) clipIv.getDrawable();

        btClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( clipDrawable.getLevel() >= 10000) {
                    clipDrawable.setLevel(1000);
                }


            }
        });

        btClick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Handler handler = new Handler();    // giống CountDownTimer để lặp đi lặp lại 1 công việc
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        if ( clipDrawable.getLevel() >= 10000) {
                            clipDrawable.setLevel(1000);
                        }
                        clipIv.setImageLevel(clipDrawable.getLevel() + 1000);
                        /** nó tự gọi lại hàm runnable = từ khóa this để tự chạy liên tục hàm runnable ở ngoài (gần giống như đệ quy) **/
                        handler.postDelayed(this, 1000);

                    }

                }, 1000);   // 2000 = 2 giây là thời gian nó chạy

            }
        });
    }
}
