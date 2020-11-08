package com.company.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onButton2click(View view) {


        TextView edtTxtNickName = findViewById(R.id.editTextNickname);
        TextView edtTxtEmail = findViewById(R.id.editTextEmailAddress);
        TextView edtTxtPhoneNumber = findViewById(R.id.editTextPhone);
        TextView txtInfo = findViewById(R.id.linearlayout_info);
        TextView txtMenu = findViewById(R.id.linearlayout_menu);

        EditText edtTxtVaha = findViewById(R.id.editTextVaha);
        EditText edtTxtVyska = findViewById(R.id.editTextVyska);
        EditText edtTxtVek = findViewById(R.id.editTextVek);
    }
}


