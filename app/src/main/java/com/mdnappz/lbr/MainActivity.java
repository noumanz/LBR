package com.mdnappz.lbr;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.mainLayout);
    }

    public void linaToggle(View v) {
        b = (Button)findViewById(R.id.linaToggle);
        if (b.getText() == getString(R.string.showLina)) {
            linearLayout.setBackgroundResource(R.drawable.lina);
            b.setText(getString(R.string.hideLina));
        }
        else {
            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            b.setText(getString(R.string.showLina));
        }

    }
}
