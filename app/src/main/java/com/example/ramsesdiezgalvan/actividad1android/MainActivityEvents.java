package com.example.ramsesdiezgalvan.actividad1android;

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
    }


    public void actionBtnNext(){




    }

    public void actionBtnEdit(){
        mainActivity.txtName.setEnabled(true);
        mainActivity.txtMail.setEnabled(true);
        mainActivity.txtPhone.setEnabled(true);
        mainActivity.txtAdd.setEnabled(true);

    }

}
