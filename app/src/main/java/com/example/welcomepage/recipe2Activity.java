package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recipe2Activity extends AppCompatActivity {
    Button back2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);
        back2 = (Button)findViewById(R.id.recipe2_back);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLastActivity();
            }
        });
    }
public void startLastActivity(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        finish();
}

}
