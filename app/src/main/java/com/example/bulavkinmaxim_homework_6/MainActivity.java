package com.example.bulavkinmaxim_homework_6;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_enter, tv_welcome, tv_registr;
    EditText et_email, et_password;
    Button btn_enter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_enter = findViewById(R.id.tv_vhod);
        tv_welcome = findViewById(R.id.text);
        tv_registr = findViewById(R.id.registr);
        et_email = findViewById(R.id.email);
        et_password = findViewById(R.id.password);
        btn_enter = findViewById(R.id.enter_btn);

        et_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_email.getText().toString().equals("")) {
                    btn_enter.setBackgroundColor(Color.GRAY);
                } else {
                    btn_enter.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_email.getText().toString().equals("")) {
                    btn_enter.setBackgroundColor(Color.GRAY);
                } else {
                    btn_enter.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_email.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")) {
                    tv_enter.setVisibility(View.GONE);
                    tv_registr.setVisibility(View.GONE);
                    et_email.setVisibility(View.GONE);
                    et_password.setVisibility(View.GONE);
                    btn_enter.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}