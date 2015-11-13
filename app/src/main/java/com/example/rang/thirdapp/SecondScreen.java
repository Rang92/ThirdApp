package com.example.rang.thirdapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activity = getIntent();
        

    }

    public void OnSendUsersName (View view){

        EditText usersNameET = (EditText)
                findViewById(R.id.user_name_edittext);

        String usersName = String.valueOf(usersNameET.getText());

        Intent goingBack = new Intent();

        goingBack.putExtra("Username", usersName);

        setResult(RESULT_OK, goingBack);

        finish();
    }
}

