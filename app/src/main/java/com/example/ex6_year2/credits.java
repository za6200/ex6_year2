package com.example.ex6_year2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    /**
     * @author ziv ankri address: za6200@bs.amalnet.k12.il
     * @version 2022.3.1
     * @since 25/10/2023
     * class will credit my parents
     */
    TextView credit1;
    Intent backActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        credit1 = findViewById(R.id.credit1);
        credit1.setText("thanks for my parents for getting me to where i am and always help me to follow my dreams :)");
        backActivity = new Intent(this, MainActivity.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("credit")) {

        } else if (st.equals("mainActivity")) {
            startActivity(backActivity);
        }
        return true;
    }
}