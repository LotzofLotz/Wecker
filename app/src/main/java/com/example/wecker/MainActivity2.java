package com.example.wecker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        //lets go
     final ProgressBar pBar = findViewById(R.id.bar);
      final TextView header = findViewById(R.id.header);
      final TextView congrats = findViewById(R.id.congrats);
     final Button button = (Button) findViewById(R.id.button);






        CheckBox box1 = findViewById(R.id.checkBox1);
        CheckBox box2 = findViewById(R.id.checkBox2);
        CheckBox box3 = findViewById(R.id.checkBox3);
        CheckBox box4 = findViewById(R.id.checkBox4);

        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked && pBar.getProgress()==75)  {
                    congrats.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    pBar.setProgress(pBar.getProgress()+25);
                }
                if(isChecked) pBar.setProgress(pBar.getProgress()+25);
                else { pBar.setProgress(pBar.getProgress()-25);}
            }
        });

        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked && pBar.getProgress()==75)  {
                    congrats.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    pBar.setProgress(pBar.getProgress()+25);
                }
                if(isChecked) pBar.setProgress(pBar.getProgress()+25);
                else { pBar.setProgress(pBar.getProgress()-25);}
            }
        });

        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked && pBar.getProgress()==75)  {
                    congrats.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    pBar.setProgress(pBar.getProgress()+25);
                }
                if(isChecked) pBar.setProgress(pBar.getProgress()+25);
                else { pBar.setProgress(pBar.getProgress()-25);}
            }
        });



        box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked && pBar.getProgress()==75)  {
                    congrats.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    pBar.setProgress(pBar.getProgress()+25);
               }
                if(isChecked) {pBar.setProgress(pBar.getProgress()+25);}

               else { pBar.setProgress(pBar.getProgress()-25);}
            }
        });

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivity2();
        }
    });


        /*
        box4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                pBar.setProgress(pBar.getProgress()+25);
            }
        }); */


    }
    public void openActivity2() {
        Intent i = new Intent(this, HabitAppSeite2.class);
        startActivity(i);

    }
}
