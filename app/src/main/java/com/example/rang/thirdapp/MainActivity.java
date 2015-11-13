package com.example.rang.thirdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getNameClick(View view) {

        Intent newScreen = new Intent(this, SecondScreen.class);

        final int result = 1;

        newScreen.putExtra("callingActivity", "MainActivity");

        startActivityForResult(newScreen, result);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView usersNameMessage = (TextView)
                findViewById(R.id.user_name_message);

        String nameSentBack = data.getStringExtra("Username");

        String message = "The username was: ";
        usersNameMessage.setText(message + nameSentBack);

    }
}
