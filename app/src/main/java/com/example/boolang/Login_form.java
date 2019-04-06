package com.example.boolang;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_form extends AppCompatActivity {

    private static final String TAG = "Login_form";

    TextView mytv;
    Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        Log.d(TAG, "onCreate: Starting. ");

        mytv = (TextView)findViewById(R.id.textv);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.textv2);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.textv3);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.textv4);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.editx);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.btnBio);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.btncd);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);



        Button btnNavBio =  (Button) findViewById(R.id.btnBio);

        btnNavBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnNavBio. ");

                Intent intent = new Intent(Login_form.this, Biodata_form.class);
                startActivity(intent);
            }
        });
    }
}
