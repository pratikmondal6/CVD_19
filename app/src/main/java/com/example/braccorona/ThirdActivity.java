package com.example.braccorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button button_yes,button_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button_yes=findViewById(R.id.angry_btn_yes);
        button_no=findViewById(R.id.angry_btn_no);

        button_yes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new  Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);

            }
        });

        button_no.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new  Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);


            }
        });
    }
}
