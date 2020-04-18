package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button recipe1_twoP;
    Button recipe1_fourP;

    Button recipe2_twoP;
    Button recipe2_fourP;

    Button recipe3_twoP;
    Button recipe3_fourP;

    Button recipe4_twoP;
    Button recipe4_fourP;

    TextView recipe1_textview;
    TextView recipe2_textview;
    TextView recipe3_textview;
    TextView recipe4_textview;

    float recipe1_total;
    float recipe2_total;
    float recipe3_total;
    float recipe4_total;

    Button order;
    Button Info1;
    Button Info2;
    Button Info3;
    Button Info4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // for recipe 1
        recipe1_twoP = (Button) findViewById(R.id.recipe1_2p);
        recipe1_fourP = (Button) findViewById(R.id.recipe1_4p);
        // for recipe 2

        recipe2_twoP = (Button) findViewById(R.id.recipe2_2p);
        recipe2_fourP = (Button) findViewById(R.id.recipe2_4p);

        //for recipe 3

        recipe3_twoP = (Button) findViewById(R.id.recipe3_2p);
        recipe3_fourP = (Button) findViewById(R.id.recipe3_4p);

        //for recipe 4

        recipe4_twoP = (Button) findViewById(R.id.recipe4_2p);
        recipe4_fourP = (Button) findViewById(R.id.recipe4_4p);

        order = (Button) findViewById(R.id.order_button);

        Info1 = (Button)findViewById(R.id.recipe1_button);
        Info2 = (Button)findViewById(R.id.recipe2_button);
        Info3 = (Button)findViewById(R.id.recipe3_button);
        Info4 = (Button)findViewById(R.id.recipe4_button);

        recipe1_textview = (TextView) findViewById(R.id.recipe1_price);
        recipe2_textview = (TextView) findViewById(R.id.recipe2_price);
        recipe3_textview = (TextView) findViewById(R.id.recipe3_price);
        recipe4_textview = (TextView) findViewById(R.id.recipe4_price);


        recipe1_twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe1Price_2p = (float) (9.99);
                recipe1_textview.setText(Float.toString(recipe1Price_2p));
                recipe1_total = (float) (9.99);
            }

        });

        recipe1_fourP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe1Price_4p = (float) (16.99);
                recipe1_textview.setText(Float.toString(recipe1Price_4p));
                recipe1_total = (float) (16.99);
            }
        });

// for recipe 2
        recipe2_twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe2Price_2p = (float) (24.85);
                recipe2_textview.setText(Float.toString(recipe2Price_2p));
                recipe2_total = (float) (24.85);

            }
        });

        recipe2_fourP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe2Price_4p = (float) (50.49);
                recipe2_textview.setText(Float.toString(recipe2Price_4p));
                recipe2_total = (float) (50.49);

            }
        });

// for recipe 3


        recipe3_twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe3Price_2p = (float) (12.59);
                recipe3_textview.setText(Float.toString(recipe3Price_2p));
                recipe3_total = (float) (12.59);

            }
        });

        recipe3_fourP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe3Price_4p = (float) (21.99);
                recipe3_textview.setText(Float.toString(recipe3Price_4p));
                recipe3_total = (float) (21.99);

            }
        });

// for recipe 4
        recipe4_twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe4Price_2p = (float) (15.99);
                recipe4_textview.setText(Float.toString(recipe4Price_2p));
                recipe4_total = (float) (15.99);

            }
        });

        recipe4_fourP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float recipe4Price_4p = (float) (32.99);
                recipe4_textview.setText(Float.toString(recipe4Price_4p));
                recipe4_total = (float) (32.99);

            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float total;
                total = recipe1_total + recipe2_total + recipe3_total + recipe4_total;
                if (total == 0) {



                } else if (total > 0) {
                    Intent i = new Intent(Activity2.this, orderActivity.class);
                    i.putExtra("value", total);
                    startActivity(i);
                    finish();
                }
            }
        });

        Info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfo1();
            }
        });
        Info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfo2();
            }
        });
        Info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfo3();
            }
        });
        Info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfo4();
            }
        });
    }

    /*public void startOrderActivity(){
        float total;
        total = recipe1_total + recipe2_total + recipe3_total + recipe4_total;
        Intent intent = new Intent(this,orderActivity.class);
        startActivity(intent);
        finish();
    }*/
    public void startInfo1(){
        Intent info = new Intent(this,recipe1Activity.class);
        startActivity(info);
        finish();
    }
    public void startInfo2(){
        Intent info2 = new Intent(this, recipe2Activity.class);
        startActivity(info2);
        finish();
    }
    public void startInfo3(){
        Intent info3 = new Intent(this, recipe3Activity.class);
        startActivity(info3);
        finish();
    }
    public void startInfo4(){
        Intent info4 = new Intent(this, recipe4Activity.class);
        startActivity(info4);
        finish();
    }
}
