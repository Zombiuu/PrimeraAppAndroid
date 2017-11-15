package com.example.ramsesdiezgalvan.actividad1android;


import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by ramsesdiezgalvan on 13/11/17.
 */

public class MainActivityEvents implements View.OnClickListener {
    private MainActivity mainActivity;


    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void  onClick(View view){

        if (view.getId() == R.id.btnNext){

            actionBtnNext();

        }else if(view.getId() == R.id.btnEditSave){

            if (((Button) view).getText().equals("EDITAR") ) {
                Log.d("msg","Dentro "+((Button) view).getText());
            actionBtnEdit();
            mainActivity.btnEditSave.setText(R.string.btnSave);

            }else if (((Button) view).getText().equals("GUARDAR")){

                actionBtnSave();

            }
        }

    }

    private void actionBtnSave() {

       DataHolder.instance.name = mainActivity.txtName.getText().toString();
       DataHolder.instance.email = mainActivity.txtMail.getText().toString();
       DataHolder.instance.phone = mainActivity.txtPhone.getText().toString();
       DataHolder.instance.add = mainActivity.txtAdd.getText().toString();


       DataHolder.instance.dd = mainActivity.datePicker.getDayOfMonth();
       DataHolder.instance.mm = mainActivity.datePicker.getMonth();
       DataHolder.instance.yy = mainActivity.datePicker.getYear();


        mainActivity.btnEditSave.setText(R.string.btnEdit);

        mainActivity.txtName.setEnabled(false);
        mainActivity.txtMail.setEnabled(false);
        mainActivity.txtPhone.setEnabled(false);
        mainActivity.txtAdd.setEnabled(false);

    }


    public void actionBtnNext(){

        Intent intent = new Intent(mainActivity,ArticleActivity.class);
        mainActivity.startActivity(intent);
        mainActivity.finish();


    }

    public void actionBtnEdit(){
        mainActivity.txtName.setEnabled(true);
        mainActivity.txtMail.setEnabled(true);
        mainActivity.txtPhone.setEnabled(true);
        mainActivity.txtAdd.setEnabled(true);

    }

}
