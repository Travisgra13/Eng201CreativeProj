package com.code.deity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Result extends AppCompatActivity {
    private TextView resultText;
    private Button restartButton;
    private ImageView resultImage;
    private DataStorage data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultText = findViewById(R.id.resultText);
        resultImage = findViewById(R.id.resultImage);
        restartButton = findViewById(R.id.restartButton);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                int mPendingIntentId = 0;
                PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), mPendingIntentId, intent, PendingIntent.FLAG_CANCEL_CURRENT);
                AlarmManager mgr = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
                System.exit(0);
            }
        });
        Intent intent = this.getIntent();
        Bundle extras = intent.getExtras();
        data = (DataStorage) extras.getSerializable("data");
        determineResult();
    }

    private void determineResult() {
        ArrayList<Integer> results = new ArrayList<>();
        results.add(data.getEnumaElish());
        results.add(data.getGenesis());
        results.add(data.getPopulVuh());
        results.add(data.getWorksAndDays());
        Integer max = Collections.max(results);
        int index = 0;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == max) {
                index = i;
            }
        }
        if (index == 0) {
            showResult("Enuma Elish Deity");
        }
        else if (index == 1) {
            showResult("Genesis Deity");

        }
        else if (index == 2) {
            showResult("Popul Vuh Deity");
        }
        else if (index == 3) {
            showResult("Works and Days Deity");

        }
    }

    private void showResult(String godType) {
        switch (godType) {
            case "Enuma Elish Deity":
                resultImage.setImageResource(R.mipmap.ic_enuma);
                break;
            case "Genesis Deity":
                resultImage.setImageResource(R.mipmap.ic_genesis);
                break;
            case "Popul Vuh Deity":
                resultImage.setImageResource(R.mipmap.ic_popul);
                break;
            case "Works and Days Deity":
                resultImage.setImageResource(R.mipmap.ic_works);
                break;
        }
        String result = "You are the\n" + godType;
        resultText.setText(result);
    }
}
