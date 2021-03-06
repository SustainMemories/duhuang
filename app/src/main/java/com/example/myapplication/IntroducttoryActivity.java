package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class IntroducttoryActivity extends AppCompatActivity {
    private ViewPager mViewPage;
    private TextView mTextView;
    private List<View> viewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducttory);
        initView();
        initAdapter();


    }


    /**
     * 适配器
     */
    private void initAdapter() {
        IntroductoryAdapter adapter=new IntroductoryAdapter(viewList);
        mViewPage.setAdapter(adapter);
    }

    /**
     * viewPager和三个引导
     */
    private void initView() {
        mViewPage=findViewById(R.id.introductory_viewPager);
        viewList=new ArrayList<>();
        viewList.add(getView(R.layout.introductory_a));
        viewList.add(getView(R.layout.introductory_b));
        viewList.add(getView(R.layout.introductory_c));

    }

    private View getView(int resId) {
        return LayoutInflater.from(this).inflate(resId,null);
    }




}
