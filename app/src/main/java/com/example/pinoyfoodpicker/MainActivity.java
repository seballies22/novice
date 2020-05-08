package com.example.pinoyfoodpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    CheckBox cook,order,bfast,lunch,dinner,snack;
    Button btnMain;
    TextView txtMain;

    Random r;

    String[] cook1 = {"Sinigang" , "Adobo" , "Bulalo"};
    String[] order1 = {"Chicken" , "Burger" , "fries"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = findViewById(R.id.pick);
        txtMain = findViewById(R.id.result);
        cook = findViewById(R.id.cook);
        order = findViewById(R.id.order);
        bfast = findViewById(R.id.bfast);
        lunch = findViewById(R.id.lunch);
        dinner = findViewById(R.id.dinner);
        snack = findViewById(R.id.snack);


        r = new Random();

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cook.isChecked()){
                }
                    txtMain.setText("" + cook1[r.nextInt(cook1.length)]);
                if (order.isChecked()){
                    txtMain.setText(""+ order1[r.nextInt(order1.length)]);
                }
            }
        });


            }

    }




