package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recipe4Activity extends AppCompatActivity {
Button back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe4);

        back4=(Button)findViewById(R.id.recipe4_back);

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPreviousActivity();
            }
        });
    }
    public void startPreviousActivity(){
            Intent itent = new Intent(this,Activity2.class);
            startActivity(itent);
            finish();
    }
}
