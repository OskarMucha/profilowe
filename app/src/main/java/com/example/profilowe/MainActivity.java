package com.example.profilowe;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button przycisk;
    EditText name;
    EditText second_name;
    EditText login;
    EditText gmail;
    TextView mojtext;
    Button edit ;
    boolean stefan = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextText);
        second_name = findViewById(R.id.editTextText2);
        login = findViewById(R.id.editTextText3);
        gmail = findViewById(R.id.editTextTextEmailAddress);
        przycisk = findViewById(R.id.button);
        edit = findViewById(R.id.button2);
        mojtext = findViewById(R.id.textView);
        przycisk.setOnClickListener(e -> {
            String text ="IMIE:"+name.getText().toString() + " NAZWISKO:" + second_name.getText().toString() + " LOGIN:" + login.getText().toString() + " EMAIL:" + gmail.getText().toString();
            mojtext.setText(text);
        });
        edit.setOnClickListener(e -> {
            stefan = !stefan;
            name.setEnabled(stefan);
            second_name.setEnabled(stefan);
            login.setEnabled(stefan);
            gmail.setEnabled(stefan);

        });

    }
}