package com.example.rolldice1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void on_button_click (View view) {
        TextView tv = this.findViewById(R.id.textView);
        TextView tv1 = this.findViewById(R.id.textView2);
        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));

        EditText name = this.findViewById(R.id.editText);
        TextView p = this.findViewById(R.id.textView3);
        p.setText(Integer.toString(count));
        String name1 = name.getText().toString();
        int x = Integer.parseInt(name1);
        if (x == number) {
            tv1.setText("Congratulations");
            count++;
        }


    }
    public void roll_the_dice (View view) {
        TextView tv = this.findViewById(R.id.textView);
        TextView q = this.findViewById(R.id.textView4);
        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));
        if (number == 1) {
        q.setText("If you could go anywhere in the world, where would you go?");
        }
        if (number == 2) {
            q.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }
        if (number == 3) {
            q.setText("If you could eat only one food for the rest of your life, what would that be?");
        }
        if (number == 4) {
            q.setText("If you won a million dollars, what is the first thing you would buy?");
        }
        if (number == 5) {
            q.setText("If you could spend the day with one fictional character, who would it be?");
        }
        if (number == 6) {
            q.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }
    }

}
