package com.rahulkapoor.cookieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeValue(View view) {
        String str = "i am so full now!";
        ImageView imageEdit = (ImageView) findViewById(R.id.image_edit);//casting od view to textview;
        //casting made to image view;
        imageEdit.setImageResource(R.drawable.after_cookie);
        displayText(str);

    }



    private void displayText(String str)
    {
       TextView textEdit = (TextView) findViewById(R.id.text_edit);//casting od view to textview;
        textEdit.setText(str);

    }


}