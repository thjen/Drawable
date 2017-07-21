package com.example.qthjen.drawable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Q.ThjeN on 7/21/2017.
 */

public class Custom extends AppCompatActivity {

    Button btClick1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);

        btClick1 = (Button) findViewById(R.id.btCLick1);

        btClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Custom.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
