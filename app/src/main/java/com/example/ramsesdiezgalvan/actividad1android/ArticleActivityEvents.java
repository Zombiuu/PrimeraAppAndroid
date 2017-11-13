package com.example.ramsesdiezgalvan.actividad1android;

import android.content.Intent;
import android.view.View;

/**
 * Created by ramsesdiezgalvan on 13/11/17.
 */

public class ArticleActivityEvents implements View.OnClickListener{
    private ArticleActivity articleActivity;


    public ArticleActivityEvents(ArticleActivity articleActivity) {
        this.articleActivity = articleActivity;
    }



    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnProfile) {

            Intent intent = new Intent(articleActivity,MainActivity.class);
            articleActivity.startActivity(intent);
            articleActivity.finish();



        }

    }
}
