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