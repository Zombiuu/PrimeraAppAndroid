package com.example.ramsesdiezgalvan.actividad1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class ArticleActivity extends AppCompatActivity {

    //botones

    public Button btnProfile;
    public Button btnNext2;
    public Button btnBack;

    //textfields

    public EditText txtTitle;

    public EditText txtAreaText;

    //events

    private ArticleActivityEvents events;


    //arrays

    public String[] title;
    public String[] body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        events = new ArticleActivityEvents(this);
        initButton();
        initArrays();
        initEditText();




    }

    private void initArrays() {

        title = this.getResources().getStringArray(R.array.title);
        body = this.getResources().getStringArray(R.array.body);

    }

    private void initEditText() {

        txtTitle = this.findViewById(R.id.txtTitle);
        txtTitle.setText(title[0]);

        txtAreaText = this.findViewById(R.id.txtAreaText);
        txtAreaText.setText(body[0]);


    }

    private void initButton() {

        btnProfile = this.findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(events);
        btnProfile.setText(R.string.btnProfile);

        btnNext2 = this.findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(events);
        btnNext2.setText(R.string.btnNext2);

        btnBack = this.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(events);
        btnBack.setText(R.string.btnBack);

    }
}
