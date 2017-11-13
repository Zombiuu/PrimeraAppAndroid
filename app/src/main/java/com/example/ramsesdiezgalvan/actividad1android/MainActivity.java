package com.example.ramsesdiezgalvan.actividad1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public LinearLayout ventanaUno;

    //botones

    public Button btnNext;
    public Button btnEditSave;

    //textfields

    public EditText txtName;
    public EditText txtMail;
    public EditText txtPhone;
    public EditText txtAdd;

    //date picker

    public DatePicker datePicker;

    //events

    private MainActivityEvents events;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);
        initButton();
        initEditText();
        getEditText();

    }


    private void initEditText() {

        txtName = this.findViewById(R.id.txtName);
        txtName.setHint(R.string.txtName);

        txtMail = this.findViewById(R.id.txtMail);
        txtMail.setHint(R.string.txtMail);

        txtPhone = this.findViewById(R.id.txtPhone);
        txtPhone.setHint(R.string.txtPhone);

        txtAdd = this.findViewById(R.id.txtAdd);
        txtAdd.setHint(R.string.txtAdd);


    }

    private void initButton() {

        btnNext = this.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(events);
        btnNext.setText(R.string.btnNext);

        btnEditSave = this.findViewById(R.id.btnEditSave);
        btnEditSave.setOnClickListener(events);
        btnEditSave.setText(R.string.btnEdit);

    }
    private void getEditText() {

        txtName.setText(DataHolder.instance.name.toString());
        txtMail.setText(DataHolder.instance.email.toString());
        txtPhone.setText(DataHolder.instance.phone.toString());
        txtAdd.setText(DataHolder.instance.add.toString());

    }



}
