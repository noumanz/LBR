package com.mdnappz.lbr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button toggleLina, button1, button2, button3, button4, button5, button6;
    TextView textHelloWorld, secondHelloWorld, testString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.mainLayout);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        testString = (TextView)findViewById(R.id.testString);
        textHelloWorld = (TextView)findViewById(R.id.textHelloWorld);
        secondHelloWorld = (TextView)findViewById(R.id.secondHelloWorld);
        toggleLina = (Button)findViewById(R.id.linaToggle);
    }

    public void linaToggle(View v) {

        if (toggleLina.getText() == getString(R.string.showLina)) {
            linearLayout.setBackgroundResource(R.drawable.lina);
            toggleLina.setText(getString(R.string.hideLina));
            button1.setTextColor(Color.parseColor("#ffffff"));
            button2.setTextColor(Color.parseColor("#ffffff"));
            button3.setTextColor(Color.parseColor("#ffffff"));
            button4.setTextColor(Color.parseColor("#ffffff"));
            button5.setTextColor(Color.parseColor("#ffffff"));
            button6.setTextColor(Color.parseColor("#ffffff"));
            textHelloWorld.setTextColor(Color.parseColor("#ffffff"));
            secondHelloWorld.setTextColor(Color.parseColor("#ffffff"));
            testString.setTextColor(Color.parseColor("#ffffff"));
        }
        else {
            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            toggleLina.setText(getString(R.string.showLina));
            button1.setTextColor(Color.parseColor("#000000"));
            button2.setTextColor(Color.parseColor("#000000"));
            button3.setTextColor(Color.parseColor("#000000"));
            button4.setTextColor(Color.parseColor("#000000"));
            button5.setTextColor(Color.parseColor("#000000"));
            button6.setTextColor(Color.parseColor("#000000"));
            textHelloWorld.setTextColor(Color.parseColor("#000000"));
            secondHelloWorld.setTextColor(Color.parseColor("#000000"));
            testString.setTextColor(Color.parseColor("#000000"));
        }

    }

    public void b1press(View v) {
        testString.setText(getString(R.string.blueAndBlack1));
    }
    public void b2press(View v) {
        testString.setText(getString(R.string.blueAndBlack2));
    }
    public void b3press(View v) {
        testString.setText(getString(R.string.blueAndBlack3));
    }
    public void b4press(View v) {
        testString.setText(getString(R.string.blueAndBlack4));
    }
    public void b5press(View v) {
        testString.setText(getString(R.string.blueAndBlack5));
    }
    public void b6press(View v) {
        testString.setText(getString(R.string.blueAndBlack6));
    }

}
