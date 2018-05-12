package com.example.artemis.dndartemis;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SwipeActivity extends FragmentActivity{

    private ViewPager _viewPager;
    private SwipeAdapter _swipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_layout);

        _viewPager = findViewById(R.id.swiper);
        _swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        _viewPager.setAdapter(_swipeAdapter);
    }
}
