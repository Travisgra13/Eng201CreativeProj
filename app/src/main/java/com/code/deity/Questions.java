package com.code.deity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {
    private TextView question;
    private ImageView popul;
    private ImageView works;
    private ImageView genesis;
    private ImageView enuma;
    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private DataStorage data;
    private int questionNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        question = findViewById(R.id.question);
        data = new DataStorage();
        firstButton = findViewById(R.id.option1);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        secondButton = findViewById(R.id.option2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        thirdButton = findViewById(R.id.option3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        popul = findViewById(R.id.imagePopul);
        popul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "Popul Vuh", Toast.LENGTH_SHORT).show();
            }
        });
        works = findViewById(R.id.imageWork);
        works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "Works and Days", Toast.LENGTH_SHORT).show();
            }
        });
        genesis = findViewById(R.id.imageGenesis);
        genesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "Genesis", Toast.LENGTH_SHORT).show();
            }
        });
        enuma = findViewById(R.id.imageEnuma);
        enuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "Enuma Elish", Toast.LENGTH_SHORT).show();
            }
        });
        questionNum = 1;
        startQuestion1();
    }

    private void startQuestion1() {
        question.setText(getResources().getString(R.string.question1));
        firstButton.setText(getResources().getString(R.string.ans1Ques1));
        secondButton.setText(getResources().getString(R.string.ans2Ques1));
        thirdButton.setText(getResources().getString(R.string.ans3Ques1));

    }

    private void startQuestion2() {
        question.setText(getResources().getString(R.string.question2));
        firstButton.setText(getResources().getString(R.string.ans1Ques2));
        secondButton.setText(getResources().getString(R.string.ans2Ques2));
        thirdButton.setText(getResources().getString(R.string.ans3Ques2));
    }
    private void startQuestion3() {
        question.setText(getResources().getString(R.string.question3));
        firstButton.setText(getResources().getString(R.string.ans1Ques3));
        secondButton.setText(getResources().getString(R.string.ans2Ques3));
        thirdButton.setText(getResources().getString(R.string.ans3Ques3));
    }
    private void startQuestion4() {
        question.setText(getResources().getString(R.string.question4));
        firstButton.setText(getResources().getString(R.string.ans1Ques4));
        secondButton.setText(getResources().getString(R.string.ans2Ques4));
        thirdButton.setText(getResources().getString(R.string.ans3Ques4));
    }
    private void startQuestion5() {
        question.setText(getResources().getString(R.string.question5));
        firstButton.setText(getResources().getString(R.string.ans1Ques5));
        secondButton.setText(getResources().getString(R.string.ans2Ques5));
        thirdButton.setText(getResources().getString(R.string.ans3Ques5));
    }

    private void determineResult(int optionNum) {
        switch (questionNum) {
            case 1:

        }
    }

    private void advanceToNextQuestion() {
        if (this.questionNum == 1) {
            startQuestion2();
        }
        if (this.questionNum == 2) {
            startQuestion3();
        }
        if (this.questionNum == 3) {
            startQuestion4();
        }
        if (this.questionNum == 4) {
            startQuestion5();
        }
        if (this.questionNum == 5) {
            //finish
        }
    }

    @Override
    public void onBackPressed()
    {
        if (this.questionNum == 1) {

        }
        else if (this.questionNum == 2) {
            startQuestion1();
            questionNum--;
        }
        else if (this.questionNum == 3) {
            startQuestion2();
            questionNum--;
        }
        else if (this.questionNum == 4) {
            startQuestion3();
            questionNum--;
        }
        else if (this.questionNum == 5) {
            startQuestion4();
            questionNum--;
        }
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }


}
