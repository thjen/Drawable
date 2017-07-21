package com.example.qthjen.drawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btClick;
    Button btClick2;
    Button btClick3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btClick = (Button) findViewById(R.id.btClick);
        btClick2 = (Button) findViewById(R.id.btClick2);
        btClick3 = (Button) findViewById(R.id.btClick3);

        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Custom.class);
                startActivity(intent);

            }
        });

        btClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LayerList.class);
                startActivity(intent1);
            }
        });

        btClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ClipImage.class);
                startActivity(intent2);
            }
        });

    }
}
