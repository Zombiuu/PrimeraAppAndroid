package com.example.ramsesdiezgalvan.actividad1android;

import android.content.Intent;
import android.util.Log;
import android.view.View;

/**
 * Created by ramsesdiezgalvan on 13/11/17.
 */

public class ArticleActivityEvents implements View.OnClickListener{
    private ArticleActivity articleActivity;
    private int contador = 0 ;

    public ArticleActivityEvents(ArticleActivity articleActivity) {
        this.articleActivity = articleActivity;
    }



    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnProfile) {

            Intent intent = new Intent(articleActivity,MainActivity.class);
            articleActivity.startActivity(intent);
            articleActivity.finish();



        }else if (view.getId() == R.id.btnBack){


            if (contador < articleActivity.title.length) {

                if(contador == 0){

                    articleActivity.txtTitle.setText(articleActivity.title[contador]);
                    articleActivity.txtAreaText.setText(articleActivity.body[contador]);


                }else{
                    articleActivity.btnNext2.setEnabled(true);
                    contador--;
                    if (contador == 0){
                        articleActivity.btnBack.setEnabled(false);
                    }
                    articleActivity.txtTitle.setText(articleActivity.title[contador]);
                    articleActivity.txtAreaText.setText(articleActivity.body[contador]);
                }


            }else{
                Log.d("Error","Error en el array de titulos");
            }


        }else if (view.getId() == R.id.btnNext2){
            Log.d("donde estoy","boton next antes");
            if (contador <= articleActivity.title.length) {

                if (contador == articleActivity.title.length ){

                    articleActivity.txtTitle.setText(articleActivity.title[contador]);
                    articleActivity.txtAreaText.setText(articleActivity.body[contador]);

                }else{
                  articleActivity.btnBack.setEnabled(true);
                    contador++;
                    if (contador == articleActivity.title.length - 1){
                        articleActivity.btnNext2.setEnabled(false);
                    }
                    articleActivity.txtTitle.setText(articleActivity.title[contador]);
                    articleActivity.txtAreaText.setText(articleActivity.body[contador]);
                }


            }

        }

    }
}
