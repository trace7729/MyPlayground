package com.example.hole1.myplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudyActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonUCSD, buttonUCSDExt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
        buttonUCSDExt = (Button) findViewById(R.id.buttonUCSDExt);
        buttonUCSDExt.setOnClickListener(this);
    }

        @Override
        public void onClick(View v){
            switch(v.getId())
            {
                case R.id.buttonUCSD:
                    Intent u;
                    u = new Intent(this, UCSDActivity.class);
                    startActivity(u);
                    break;
                case R.id.buttonUCSDExt:
                    Intent ue;
                    ue = new Intent(this,UCSDExtActivity.class);
                    startActivity(ue);
                    break;
        }
    }
}