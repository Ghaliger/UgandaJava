package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setting Background Color to RED to begin.
        RelativeLayout bgElement = (RelativeLayout)findViewById(R.id.activity_main1);
        bgElement.setBackgroundColor(Color.RED);
        //setButtonText();
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod() {
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout bgElement = (RelativeLayout)findViewById(R.id.activity_main1);
                int color = ((ColorDrawable)bgElement.getBackground()).getColor();

                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                    button.setText(R.string.set_to_red);
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                    button.setText(R.string.set_to_blue);
                }
            }
        });
    }
 /*   public void setButtonText(){
        RelativeLayout bgElement = (RelativeLayout)findViewById(R.id.activity_main1);
        int color = ((ColorDrawable)bgElement.getBackground()).getColor();
        if (color == Color.RED){
            button.setText("Convert to blue!");
        } else {
            button.setText("Convert to red!");
        }
    }*/
}