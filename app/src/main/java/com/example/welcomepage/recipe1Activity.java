package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recipe1Activity extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe1);
        back = (Button)findViewById(R.id.recipe1_back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPreviousActivity();
            }
        });
    }
    public void startPreviousActivity(){
        Intent intent = new Intent(recipe1Activity.this, Activity2.class);
        startActivity(intent);
        finish();
    }
}
