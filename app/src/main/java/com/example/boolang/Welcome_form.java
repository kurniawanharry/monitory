package com.example.boolang;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome_form extends AppCompatActivity {

    private static final String TAG = "Welcome_form";

    TextView mytv;
    Typeface myfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_form);
        Log.d(TAG, "onCreate: Starting. ");

        mytv = (TextView)findViewById(R.id.textk);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        mytv = (TextView)findViewById(R.id.btnlogin);
        myfont = Typeface.createFromAsset(this.getAssets(), "fonts/nunito_bold.ttf");
        mytv.setTypeface(myfont);

        Button btnNavLog = (Button) findViewById(R.id.btnlogin);

        btnNavLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnNavLog. ");

                Intent intent = new Intent(Welcome_form.this, Login_form.class);
                startActivity(intent);
            }
        });

    }
}
