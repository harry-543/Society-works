package ru.embersoft.Clubs_Societies;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import ru.embersoft.Clubs_Societies.ui.main.SectionsPagerAdapter;
import ru.embersoft.expandabletextview.databinding.ActivityStudyMaterialsBinding;

public class studyMaterials extends AppCompatActivity {

    private ActivityStudyMaterialsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStudyMaterialsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

    }

    public void btn3(View view)
    {
        Intent link1 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1AklvGVOKwlxNiHHW3Z7vFD1LrIzakaI0"));
        startActivity(link1);
    }

    public void btn4(View view)
    {
        Intent link2 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1gRWVxpsfbQBtMqhYVOicaGZuCtrccfro"));
        startActivity(link2);
    }

    public void btn5(View view)
    {
        Intent link3 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1VCXHf244c-69fdJawiSB2yWqEz46xUQw"));
        startActivity(link3);
    }

    public void btn6(View view)
    {
        Intent link4 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1eGgWfgEKPUu-F2lc2GIuWGoCdfoGlGuW"));
        startActivity(link4);
    }

    public void btn7(View view)
    {
        Intent link5 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1O1hglgMRXRbVwfUaHJRhNSlGe4h-Yfiz"));
        startActivity(link5);
    }

    public void btn8(View view)
    {
        Intent link6 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1Cf2iWmAIRB5JbswJNWGpaZ2HJMmr1XM9"));
        startActivity(link6);
    }

    public void btn9(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1D2ATbP5ch6rH-emFejkObl-EbS2yCLvj"));
        startActivity(link7);
    }
    public void btn10(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1AklvGVOKwlxNiHHW3Z7vFD1LrIzakaI0"));
        startActivity(link7);
    }
    public void btn11(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1gXXPc_WpiYUjINbGBH4qEtdVIULefGt5"));
        startActivity(link7);
    }
    public void btn12(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1a-CWSSu-m7mkD8Xqkah2pGdvG3cQXQkG"));
        startActivity(link7);
    }
    public void btn13(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1j3XD1XMxdb07vBE84hqfMUU9wdj-wOww"));
        startActivity(link7);
    }
    public void btn14(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1Qa5oUwp1dgT_aZzsRilg0VDyro37mP2O"));
        startActivity(link7);
    }
    public void btn15(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=11p02_CZGmmPZOOVY0_MwiaeW89YbS4os"));
        startActivity(link7);
    }
    public void btn16(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1yB95BJrYHYN-8ZwVXuJM25oNqmdGQxBq"));
        startActivity(link7);
    }
    public void btn17(View view)
    {
        Intent link7 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1SHj4OsRVEbDF6s5NC6b3Dix3OMNb3q9e"));
        startActivity(link7);
    }

}



