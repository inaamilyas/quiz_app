package com.example.simplequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java is person", "Java was introduced in 1834", "Java is an Object Oriented Programming Language"};
    private boolean[] ans = {false, false, true};
    private TextView ques;
    private Button yes;
    private Button no;
    private int score = 0;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques = findViewById(R.id.ques);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        ques.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1){
                    if (ans[index] == true){
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        ques.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is "+ score+ "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1){
                    if (ans[index] == false){
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        ques.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
//    public void
}