package com.example.jeonjin_il.myviewpagerlistview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jeonjin-il on 2016. 11. 5..
 */
public class viewpager_main extends AppCompatActivity {
    ViewPager pager;
    viewpager_main() {
    pager=(ViewPager)findViewById(R.id.pager);

    ViewPagerAdapter adapter = new ViewPagerAdapter(getLayoutInflater());

    pager.setAdapter(adapter);
}
}
