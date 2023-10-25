package com.example.ex6_year2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * @author		ziv ankri address: za6200@bs.amalnet.k12.il
     * @version	    2022.3.1
     * @since       25/10/2023
     * class will get the user's name and if click count the counter will go up in 1 and if clicked reset it will reset the counter
     * and if clicked exit it will exit the app and save the name and the counter for the next time
     */

    EditText Name;
    TextView counter;
    Button count;
    Button reset;
    Button exit;

    SharedPreferences save;
    SharedPreferences.Editor editor;
    int counter1 = 0;
    String name;
    Intent credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        counter = findViewById(R.id.counter);
        count = findViewById(R.id.count);
        reset = findViewById(R.id.reset);
        exit = findViewById(R.id.exit);

        save = getSharedPreferences("saved_data", MODE_PRIVATE);
        editor = save.edit();

        counter1 = save.getInt("counter", 0);
        name = save.getString("Name", "");

        Name.setText(name);
        counter.setText(String.valueOf(counter1));
        credits = new Intent(this, credits.class);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
        * function will make the option menu
         * param menu: the menu
         */
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        /**
         * function will check if the user clicked the credit button and if he did it will get him to the credits screen
         * param item: the item clicked
         */
        String st = item.getTitle().toString();
        if(st.equals("credit"))
        {
            startActivity(credits);
        }
        return super.onOptionsItemSelected(item);
    }


    public void count(View view) {
        /**
         * function will count how many times the user clicked the button count
         * param view: when button clicked
         */
        counter1++;
        counter.setText(String.valueOf(counter1));
    }

    public void reset(View view) {
        /**
         * function will reset the counter to 0
         * param view: when button clicked
         */
        counter1 = 0;
        counter.setText(String.valueOf(counter1));
    }

    public void exit(View view) {
        /**
         * function will exit the application and save the user data for next time
         * param view: when button clicked
         */
        name = Name.getText().toString();
        editor.putInt("counter", counter1);
        editor.putString("Name", name);
        editor.commit();
        finish();
    }

}
