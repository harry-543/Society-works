package ru.embersoft.Clubs_Societies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ru.embersoft.expandabletextview.R;

public class Opening extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
    }

    public void gotostudyMaterials()
    {
        Intent intent = new Intent(Opening.this, studyMaterials.class);
        startActivity(intent);
    }

    public void gotoMain()
    {
        Intent intent = new Intent(Opening.this,MainActivity.class);
        startActivity(intent);
    }

    public void btn1(View view)
    {
        gotoMain();
    }

    public void btn2(View view)
    {
        gotostudyMaterials();
    }

}
