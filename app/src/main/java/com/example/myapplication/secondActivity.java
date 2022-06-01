package com.example.myapplication;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class secondActivity extends AppCompatActivity {
  RecyclerView recyclerView;
  Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //第二步：绑定控件
        //第二步：绑定控件
        recyclerView=findViewById(R.id.recyclerView);
        button1=findViewById(R.id.button1);
        //第三步：准备数据
        List<Work> nworkList=new ArrayList<>();
        Work shuanglong = new Work(R.drawable.panjing, "1","1");
        nworkList.add(shuanglong);
        Work m1 = new Work(R.drawable.shuanglong, "2","2");
        nworkList.add(m1);
        Work m4 = new Work(R.drawable.feitian, "3","3");
        nworkList.add(m4);
        Work m2 = new Work(R.drawable.fangjing, "4","4");
        nworkList.add(m2);
        Work m6 = new Work(R.drawable.dalianhua, "5","5");
        nworkList.add(m6);



        //第四步：设计每一行的子布局item.xml
        //第五步：创建适配器
        WorktoalAdapter adapter=new WorktoalAdapter(nworkList);
        //第六步：将数据以垂直线性布局的方式显示出来
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//让布局横向排列
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

