package com.example.jeonjin_il.myviewpagerlistview;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview ;
    ArrayList<ListViewItem> datas = new ArrayList<ListViewItem>();
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //처음 뷰페이저
        pager=(ViewPager)findViewById(R.id.pager);
        ViewPagerAdapter viewpager_adapter = new ViewPagerAdapter(getLayoutInflater());
        pager.setAdapter(viewpager_adapter);




        //다음 리스트뷰
        datas.add(new ListViewItem("1","2",R.drawable.food_01));
        datas.add(new ListViewItem("1","2",R.drawable.food_02));
        datas.add(new ListViewItem("1","2",R.drawable.food_03));

        listview = (ListView)findViewById(R.id.listview1);

        ListViewAdapter list_adapter = new ListViewAdapter(getLayoutInflater(),datas);
        listview.setAdapter(list_adapter);

    }
}
