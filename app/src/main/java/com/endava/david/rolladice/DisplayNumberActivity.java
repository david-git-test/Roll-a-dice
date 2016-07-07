package com.endava.david.rolladice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayNumberActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_number);

        Intent intent = getIntent();
        String num = intent.getStringExtra(MainActivity.EXTRA_NUMBER);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(num);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);




    }
}
