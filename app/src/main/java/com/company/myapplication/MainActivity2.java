package com.company.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }







        {

            setContentView(R.layout.activity_main2);
            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMainActivity3();
                }
            });
        }




    private void openMainActivity3() { Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void onButton2click(View view) {


        EditText edtTxtNickName = findViewById(R.id.editTextNickname);
        EditText edtTxtEmail = findViewById(R.id.editTextEmailAddress);
        EditText edtTxtPhoneNumber = findViewById(R.id.editTextPhone);


    }
}
