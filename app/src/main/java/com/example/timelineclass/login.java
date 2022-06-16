package com.example.timelineclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText nameEdit;
    EditText numberEdit;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameEdit = findViewById(R.id.loginEdit);
        numberEdit = findViewById(R.id.loginpassword);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User.name = nameEdit.getText().toString();
                User.number = numberEdit.getText().toString();
                Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}