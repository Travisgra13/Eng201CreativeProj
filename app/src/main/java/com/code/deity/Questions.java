package com.code.deity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
                determineResult(1);
                advanceToNextQuestion();
            }
        });
        secondButton = findViewById(R.id.option2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determineResult(2);
                advanceToNextQuestion();
            }
        });
        thirdButton = findViewById(R.id.option3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determineResult(3);
                advanceToNextQuestion();
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
                if (optionNum == 1) {
                    data.increment(true, false, false, false);
                    illuminateDeityImages(true, false, false, false);
                }
                else if (optionNum == 2) {
                    data.increment(false, true, true, false);
                    illuminateDeityImages(false, true, true, false);

                }
                else if (optionNum == 3) {
                    data.increment(false, false, false, true);
                   illuminateDeityImages(false, false, false, true);
                }
                break;
            case 2:
                if (optionNum == 1) {
                    data.increment(true, true, false, false);
                    illuminateDeityImages(true, true, false, false);
                }
                else if (optionNum == 2) {
                    data.increment(false, false, true, true);
                    illuminateDeityImages(false, false, true, true);
                }
                else if (optionNum == 3) {
                    data.increment(true, true, false, false);
                    illuminateDeityImages(true, true, false, false);
                }
                break;
            case 3:
                if (optionNum == 1) {
                    data.increment(true, true, false, false);
                    illuminateDeityImages(true, true, false, false);

                }
                else if (optionNum == 2) {
                    data.increment(false, false, false, true);
                    illuminateDeityImages(false, false, false, true);
                }
                else if (optionNum == 3) {
                    data.increment(false, false, true, false);
                    illuminateDeityImages(false, false, true, false);
                }
                break;
            case 4:
                if (optionNum == 1) {
                    data.increment(false, false, false, true);
                   illuminateDeityImages(false, false, false, true);
                }
                else if (optionNum == 2) {
                    data.increment(false, false, true, false);
                    illuminateDeityImages(false, false, true, false);
                }
                else if (optionNum == 3) {
                    data.increment(true, true, false, false);
                    illuminateDeityImages(true, true, false, false);
                }
                break;
            case 5:
                if (optionNum == 1) {
                    data.increment(false, false, true, true);
                    illuminateDeityImages(false, false, true, true);
                }
                else if (optionNum == 2) {
                    data.increment(false, false, true, false);
                    illuminateDeityImages(false, false, true, false);
                }
                else if (optionNum == 3) {
                    data.increment(true, true, false, false);
                    illuminateDeityImages(true, true, false, false);
                }
                break;
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
            Intent intent = new Intent(Questions.this, Result.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", data);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        questionNum++;
    }

    private void illuminateDeityImages(boolean incrementedEnuma, boolean incrementedWorks, boolean incrementedGenesis, boolean incrementedPopul) {
        if (incrementedEnuma) {
            ImageView myImageView = findViewById(R.id.imageEnuma);
            Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            myImageView.startAnimation(myFadeInAnimation); //Set animation to your ImageView
        }
        if (incrementedWorks) {
            ImageView myImageView = findViewById(R.id.imageWork);
            Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            myImageView.startAnimation(myFadeInAnimation); //Set animation to your ImageView
        }
        if (incrementedGenesis) {
            ImageView myImageView = findViewById(R.id.imageGenesis);
            Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            myImageView.startAnimation(myFadeInAnimation); //Set animation to your ImageView
        }
        if (incrementedPopul) {
            ImageView myImageView = findViewById(R.id.imagePopul);
            Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            myImageView.startAnimation(myFadeInAnimation); //Set animation to your ImageView
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
