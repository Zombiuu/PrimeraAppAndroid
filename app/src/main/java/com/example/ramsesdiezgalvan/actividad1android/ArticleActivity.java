package com.example.ramsesdiezgalvan.actividad1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class ArticleActivity extends AppCompatActivity {

    //botones

    public Button btnProfile;


    //textfields

    public EditText txtTitle;

    public EditText txtAreaText;



    //events

    private ArticleActivityEvents events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        events = new ArticleActivityEvents(this);
        initButton();
        initEditText();


    }

    private void initEditText() {
    }

    private void initButton() {

        btnProfile = this.findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(events);
        btnProfile.setText(R.string.btnProfile);

    }
}
