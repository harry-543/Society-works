package ru.embersoft.Clubs_Societies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ru.embersoft.expandabletextview.R;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //i am prepare strings for this project
        items.add(new Item(R.drawable.one,getString(R.string.one_title),getString(R.string.one_desc)));
        items.add(new Item(R.drawable.two,getString(R.string.two_title),getString(R.string.two_desc)));
        items.add(new Item(R.drawable.three,getString(R.string.three_title),getString(R.string.three_desc)));
        items.add(new Item(R.drawable.four,getString(R.string.four_title),getString(R.string.four_desc)));
        items.add(new Item(R.drawable.five,getString(R.string.five_title),getString(R.string.five_desc)));
        items.add(new Item(R.drawable.six,getString(R.string.six_title),getString(R.string.six_desc)));
        items.add(new Item(R.drawable.seven,getString(R.string.seven_title),getString(R.string.seven_desc)));
        items.add(new Item(R.drawable.eight,getString(R.string.eight_title),getString(R.string.eight_desc)));
        items.add(new Item(R.drawable.nine,getString(R.string.nine_title),getString(R.string.nine_desc)));
        items.add(new Item(R.drawable.ten,getString(R.string.ten_title),getString(R.string.ten_desc)));
        items.add(new Item(R.drawable.eleven,getString(R.string.eleven_title),getString(R.string.eleven_desc)));
        items.add(new Item(R.drawable.twelve,getString(R.string.twelve_title),getString(R.string.twelve_desc)));
        items.add(new Item(R.drawable.thirteen,getString(R.string.thirteen_title),getString(R.string.thirteen_desc)));
        items.add(new Item(R.drawable.fourteen,getString(R.string.fourteen_title),getString(R.string.fourteen_desc)));
        items.add(new Item(R.drawable.fifteen,getString(R.string.fifteen_title),getString(R.string.fifteen_desc)));
        items.add(new Item(R.drawable.sixteen,getString(R.string.sixteen_title),getString(R.string.sixteen_desc)));
        items.add(new Item(R.drawable.seventeen,getString(R.string.seventeen_title),getString(R.string.seventeen_desc)));
        items.add(new Item(R.drawable.eighteen,getString(R.string.eighteen_title),getString(R.string.eighteen_desc)));
        items.add(new Item(R.drawable.nineteen,getString(R.string.nineteen_title),getString(R.string.nineteen_desc)));
    }
}
