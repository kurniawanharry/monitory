package com.example.boolang;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Text_form extends AppCompatActivity {

    TextView mytv;
    Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_form);

        mytv = (TextView)findViewById(R.id.textview);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        Intent intent = getIntent();
        String text = intent.getStringExtra(Biodata_form.EXTRA_TEXT);
        //int number = intent.getIntExtra(Biodata_form.EXTRA_NUMBER, 0);

        TextView textView = (TextView) findViewById(R.id.textview);

        textView.setText("Beres! Sekarang "+text+" udah bisa ngecek penggunaan HP "+text+" tiap hari, buat bantu "+text+" ngatur waktu :) ");
    }
}
