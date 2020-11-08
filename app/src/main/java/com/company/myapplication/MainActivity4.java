package com.company.myapplication;

import android.annotation.SuppressLint;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.company.myapplication.R.id.ic_person;

public class MainActivity4 extends AppCompatActivity {

    private Button icPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }







    {

        setContentView(R.layout.activity_main4);
        icPerson = (Button) findViewById(ic_person);
        icPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });
    }

    private void openMainActivity5() {
    }


}

