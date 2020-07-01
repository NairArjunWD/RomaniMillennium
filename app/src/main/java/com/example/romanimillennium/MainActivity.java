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

    int questionThree = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void correct(View view) {
//        if (score == 0 ) {
//            Toast.makeText(this, "Point!", Toast.LENGTH_LONG).show();
//            return;
//        }
//        score = score + 1;
//        displayScore (score);
//
//        RadioGroup group = (RadioGroup) findViewById(R.id.questionOne);
//        group.setEnabled(false);
//    }

    private void displayScore(int totalScore) {
        TextView score = (TextView) findViewById(R.id.score);
        score.setText("" + totalScore);
    }

    private void displayScoreTwo(int checkThree) {
        TextView scoreTwo = (TextView) findViewById(R.id.scoreTwo);
        scoreTwo.setText("" + checkThree);
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


//        RadioButton qOne = (RadioButton) findViewById(R.id.q1_b);
//        boolean qOneAnswer = qOne.isChecked();
//
//        if (qOneAnswer) {
//            score = score + 1;
//        }
//
//        return  score;
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

//    public void questionThreeAnsOne(View view) {
//        CheckBox julius = (CheckBox) findViewById(R.id.q3_a);
//        boolean questionThreeA = julius.isChecked();
//
//        CheckBox pompey = (CheckBox) findViewById(R.id.q3_d);
//        boolean questionThreeD = pompey.isChecked();
//
//        CheckBox crassus = (CheckBox) findViewById(R.id.q3_f);
//        boolean questionThreeF = crassus.isChecked();
//
//        if (questionThreeA && questionThreeD && questionThreeF == true) {
//            score++;
//        }
//    }

//    public void questionThree(View view) {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.q3_a:
//                if (checked)
//                // Add 1
//                    score ++;
//            else
//                // Nothing
//                break;
//            case R.id.q3_d:
//                if (checked)
//                // Add 1
//                    score ++;
//            else
//                // Nothing
//                break;
//            case R.id.q3_f:
//                if (checked)
//                    // Add 1
//                    score ++;
////                    if (questionThree == 3) {
////                        score ++;
////                    }
//                else
//                // Nothing
//                break;
//        }
//    }

    public void questionThree(View view) {
        CheckBox choiceOne = (CheckBox) findViewById(R.id.q3_a);
        boolean choiceOneChecked = choiceOne.isChecked();

        CheckBox choiceTwo = (CheckBox) findViewById(R.id.q3_d);
        boolean choiceTwoChecked = choiceTwo.isChecked();

        CheckBox choiceThree = (CheckBox) findViewById(R.id.q3_f);
        boolean choiceThreeChecked = choiceThree.isChecked();

        int checkThree = questionThreeCheck(choiceOneChecked, choiceTwoChecked, choiceThreeChecked);

        displayScoreTwo(score + checkThree);
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

    private boolean questionThreeAns(){
        CheckBox choiceOne = (CheckBox) findViewById(R.id.q3_a);

        CheckBox choiceTwo = (CheckBox) findViewById(R.id.q3_d);

        CheckBox choiceThree = (CheckBox) findViewById(R.id.q3_f);

        if(choiceOne.isChecked() && choiceTwo.isChecked() && choiceThree.isChecked()) {
            return true;
        }

        return false;
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
        if (questionThreeAns()) {
            score++;
            TextView quizScore = (TextView) findViewById(R.id.score);
            quizScore.setText("FinalScore: " + score +"/5");
        } else  {
            TextView quizScore = (TextView) findViewById(R.id.score);
            quizScore.setText("FinalScore: " + score +"/5");
        }
    }
//
////    public void submit(int score) {
////        TextView quizScore = (TextView) findViewById(R.id.score);
////        quizScore.setText("" + score);
////    }
//
//    public  void submit(View view) {
////        is radio clicked
//        boolean checked = ((RadioButton) view).isChecked();
//
////        Check which radio was clicked
//        switch (view.getId()) {
//            case R.id.q1_b:
//                if (checked)
//                    score++;
//                TextView quizScore = (TextView) findViewById(R.id.score);
//                quizScore.setText("" + score);
//                break;
//            case R.id.q1_a:
//                if (checked)
//                    // Nothing
//                break;
//        }
//
//
//    }





}