package com.endava.david.rolladice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.endava.rolladice.NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNumber(View view){
        Intent intent = new Intent(this, DisplayNumberActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit);
        String num = editText.getText().toString();
        Integer finalNum = Integer.parseInt(num);

        Random random = new Random();
        finalNum = random.nextInt(finalNum - 0) + 0;

        intent.putExtra(EXTRA_NUMBER, finalNum.toString());
        startActivity(intent);


    }
}
