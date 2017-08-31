package com.example.labexer1;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //TextView quiz1, quiz2, seat, lab, exam;
    EditText q1, q2, sws, le, me;
    Button compute;
    /*double quiz1, quiz2, seatwork, lab, exam, perQuiz1, perQuiz2, perSeat, perLE, perME, RA;
    String finalRA;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        sws = (EditText) findViewById(R.id.sws);
        le = (EditText) findViewById(R.id.le);
        me = (EditText) findViewById(R.id.me);

        compute = (Button) findViewById(R.id.compute);

        /*quiz1 = Double.parseDouble(q1.getText().toString());
        quiz2 = Double.parseDouble(q2.getText().toString());
        seatwork = Double.parseDouble(sws.getText().toString());
        lab = Double.parseDouble(le.getText().toString());
        exam = Double.parseDouble(me.getText().toString());

        RA = (quiz1 * 0.1) + (quiz2 * 0.1) + (seatwork * 0.1) + (lab * 0.4) + (exam * 0.3);
        finalRA = String.valueOf(RA);*/

    }

    public void computeRA(View view) {



        Intent intent = new Intent(this, SecondMain.class);
        intent.putExtra("quiz1", q1.getText().toString());
        intent.putExtra("quiz2", q2.getText().toString());
        intent.putExtra("seatwork", sws.getText().toString());
        intent.putExtra("lab", le.getText().toString());
        intent.putExtra("exam", me.getText().toString());
        startActivity(intent);

    }
}
