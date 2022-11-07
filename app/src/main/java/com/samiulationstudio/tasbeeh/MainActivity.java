package com.samiulationstudio.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counterView, saveCount, resetCount, touch2count;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touch2count = findViewById(R.id.touch2count);
        counterView = findViewById(R.id.counterView);
        saveCount = findViewById(R.id.saveCount);
        resetCount = findViewById(R.id.resetCount);


        touch2count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                counterView.setText("" + count);
            }
        });


        counterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                counterView.setText("" + count);
            }
        });

        resetCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                counterView.setText("" + count);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}