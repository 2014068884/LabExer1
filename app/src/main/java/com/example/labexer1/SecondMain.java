package com.example.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondMain extends AppCompatActivity {

    TextView RA, FG;
    Button back;
    double quiz1, quiz2, seatwork, lab, exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        RA = (TextView) findViewById(R.id.ra);
        FG = (TextView) findViewById(R.id.fg);
        back = (Button) findViewById(R.id.back);

        quiz1 = Double.parseDouble(getIntent().getStringExtra("quiz1"));
        quiz2 = Double.parseDouble(getIntent().getStringExtra("quiz2"));
        seatwork = Double.parseDouble(getIntent().getStringExtra("seatwork"));
        lab = Double.parseDouble(getIntent().getStringExtra("lab"));
        exam = Double.parseDouble(getIntent().getStringExtra("exam"));

        double raw = (quiz1 * 0.1) + (quiz2 *0.1) + (seatwork * 0.1) + (lab * 0.4) + (exam * 0.3);
       /* String rawAve = String.valueOf(raw);
        RA.setText("Your RA is " + rawAve);*/

        if(raw < 60) {
            String rawAve = "Failed";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 60 && raw < 65) {
            String rawAve = "3.0";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 65 && raw < 70) {
            String rawAve = "2.75";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 70 && raw < 75) {
            String rawAve = "2.5";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 75 && raw < 80) {
            String rawAve = "2.25";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 80 && raw < 85) {
            String rawAve = "2.0";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 85 && raw < 90) {
            String rawAve = "1.75";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 90 && raw < 92) {
            String rawAve = "1.5";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 92 && raw < 94) {
            String rawAve = "1.25";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        } else if ( raw > 94 && raw < 100) {
            String rawAve = "1.0";
            RA.setText("Your RA is " + rawAve);
            FG.setText("Your final grade is " + raw);
        }
    }

    public void goBack(Intent intent) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
