package com.example.boolang;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Biodata_form extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.boolang.EXTRA_TEXT";
    //public static final String EXTRA_NUMBER = "com.example.bolang.EXTRA_NUMBER";

    private static final String TAG = "Biodata_form";

    TextView mytv;
    Typeface myfont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_form);
        Log.d(TAG, "onCreate: Starting. ");

        mytv = (TextView)findViewById(R.id.textv5);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.textv6);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.editx3);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.editx4);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.btnTxt);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        Button btnNavTxt = (Button) findViewById(R.id.btnTxt);

        btnNavTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnNavTxt. ");

                EditText editText1 = (EditText) findViewById(R.id.editx3);
                String text = editText1.getText().toString();

                //EditText editText2 = (EditText) findViewById(R.id.editx4);
                //int number = Integer.parseInt(editText2.getText().toString());


                if(editText1.getText().toString().length()==0){
                    editText1.setError("Masukan nama");
                }else {
                    Intent intent = new Intent(Biodata_form.this, Text_form.class);
                    intent.putExtra(EXTRA_TEXT, text);
                    //intent.putExtra(EXTRA_NUMBER, number);

                    startActivity(intent);
                }


            }
        });
    }
}
