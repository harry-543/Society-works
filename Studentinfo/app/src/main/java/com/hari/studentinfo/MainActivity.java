package com.hari.studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText inputname, inputroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputname = findViewById(R.id.inputname);
        inputroll = findViewById(R.id.inputroll);
    }

    public void gotoinformation()
    {
        Intent intent = new Intent(MainActivity.this,information.class);
        intent.putExtra("from_main1",inputname.getText().toString());
        intent.putExtra("from_main2",inputroll.getText().toString());
        startActivity(intent);
    }




    public void showToastmessage(View view)
    {
        String Name = inputname.getText().toString();
        String rollnumber = inputroll.getText().toString();
        if(Name.equals("") || rollnumber.equals(""))
        {
            Toast.makeText(MainActivity.this,"Please give correct input",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"hey " + Name +", you are successfully enrolled!!",Toast.LENGTH_SHORT).show();

            gotoinformation();
        }

    }


}

