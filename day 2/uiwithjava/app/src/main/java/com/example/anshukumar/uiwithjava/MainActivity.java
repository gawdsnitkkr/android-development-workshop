package com.example.anshukumar.uiwithjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout gawds=new RelativeLayout(this);
        gawds.setBackgroundColor(Color.GREEN);
        RelativeLayout.LayoutParams buttonDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Button button1=new Button(this);
        button1.setText("Click ME");
        button1.setBackgroundColor(Color.RED);

        gawds.addView(button1);
        setContentView(button1,buttonDetails);
    }
}
