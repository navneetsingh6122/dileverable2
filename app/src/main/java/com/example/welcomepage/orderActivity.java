package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {
    TextView orderValue;
    float st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        orderValue = (TextView)findViewById(R.id.total);
        st = getIntent().getExtras().getFloat("value");
        float roundoff = (float)(Math.round(st*100.0)/100.0);
        orderValue.setText(Float.toString(roundoff));
    }
}
