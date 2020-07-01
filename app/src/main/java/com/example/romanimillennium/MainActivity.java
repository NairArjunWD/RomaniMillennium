package com.example.romanimillennium;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void questionOneAns(View view) {

        boolean checked = ((RadioButton) view).isChecked();

//        Check which radio was clicked
        switch (view.getId()) {
            case R.id.q1_b:
                if (checked)
                    score++;
                TextView quizScore = (TextView) findViewById(R.id.score);
                quizScore.setText("" + score);
                break;
        }

    }

    public void questionTwoAns(View view) {

        boolean checked = ((RadioButton) view).isChecked();

//        Check which radio was clicked
        switch (view.getId()) {
            case R.id.q2_a:
                if (checked)
                    score++;
                TextView quizScore = (TextView) findViewById(R.id.score);
                quizScore.setText("" + score);
                break;
        }
    }

    private int questionThreeCheck(boolean julius, boolean pompey, boolean crassus) {
        int point = 0;

        if(julius) {
            point = point +1;
        }

        if(pompey) {
            point = point +1;
        }

        if(crassus) {
            point = point +1;
        }

        return score + (3 / point);
    }

    public boolean questionThreeAns(){
        CheckBox choiceOne = (CheckBox) findViewById(R.id.q3_a);
        CheckBox choiceTwo = (CheckBox) findViewById(R.id.q3_b);
        CheckBox choiceThree = (CheckBox) findViewById(R.id.q3_c);
        CheckBox choiceFour = (CheckBox) findViewById(R.id.q3_d);
        CheckBox choiceFive = (CheckBox) findViewById(R.id.q3_e);
        CheckBox choiceSix = (CheckBox) findViewById(R.id.q3_f);
        CheckBox choiceSeven = (CheckBox) findViewById(R.id.q3_g);

        return choiceOne.isChecked() && !choiceTwo.isChecked() && !choiceThree.isChecked() && choiceFour.isChecked() &&
                !choiceFive.isChecked() && choiceSix.isChecked() && !choiceSeven.isChecked();
    }

    String last = "Last Roman";

    private boolean questionFourAns() {
        EditText roman = (EditText)findViewById(R.id.q4_a);

        return roman.getText().toString().equalsIgnoreCase(last);
    }


    public void questionFiveAns(View view) {

        boolean checked = ((RadioButton) view).isChecked();

//        Check which radio was clicked
        switch (view.getId()) {
            case R.id.q5_c:
                if (checked)
                    score++;
                TextView quizScore = (TextView) findViewById(R.id.score);
                quizScore.setText("" + score);
                break;
        }
    }

    public void finalScore(View view) {
        if (questionThreeAns() && questionFourAns()) {
            score += 2;
            TextView quizScore = (TextView) findViewById(R.id.score);
            quizScore.setText("FinalScore: " + score +"/5");
            quizScore.setVisibility(View.VISIBLE);
        } else if (questionThreeAns() || questionFourAns()){
            score ++;
            TextView quizScore = (TextView) findViewById(R.id.score);
            quizScore.setText("FinalScore: " + score +"/5");
            quizScore.setVisibility(View.VISIBLE);
        } else {
            TextView quizScore = (TextView) findViewById(R.id.score);
            quizScore.setText("FinalScore: " + score +"/5");
            quizScore.setVisibility(View.VISIBLE);
        }
    }

}