package com.example.ex6_year2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    /**
     * @author		ziv ankri address: za6200@bs.amalnet.k12.il
     * @version	    2022.3.1
     * @since       25/10/2023
     * class will credit my parents
     */
    TextView credit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        credit1 = findViewById(R.id.credit1);
        credit1.setText("thanks for my parents for getting me to where i am and always help me to follow my dreams :)");
    }
}