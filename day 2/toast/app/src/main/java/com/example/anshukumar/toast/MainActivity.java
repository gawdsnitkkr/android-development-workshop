package com.example.anshukumar.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buxy=(Button)findViewById(R.id.buxy);

        buxy.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView message=(TextView)findViewById(R.id.messsage);
                        message.setText("Hey!! You sucessfully clicked me!");
                        Toast.makeText(getApplicationContext(),"Toast Generated",Toast.LENGTH_SHORT).show();
                    }
                }
        );

        buxy.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView message=(TextView)findViewById(R.id.messsage);
                        message.setText("That was a long one!");
                        return true;
                    }
                }
        );
    }
}
