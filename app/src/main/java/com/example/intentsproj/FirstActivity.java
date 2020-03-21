package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button button1;
    private EditText txt1;
    private EditText txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        button1 = (Button) findViewById(R.id.button1);
        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){

        Intent intent = new Intent(this, SecondActivity.class);
        String data1 = txt1.getText().toString();
        String data2 = txt2.getText().toString();

        intent.putExtra("A", data1);
        intent.putExtra("B", data2);
        startActivity(intent);
        finish();

        Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 270, 1400);
        toast.show();



    }

}
