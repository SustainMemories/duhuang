package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class secondfirstActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondfirst);
//第二步：绑定控件
        //第二步：绑定控件
        recyclerView=findViewById(R.id.recyclerView);
        button1=findViewById(R.id.button1);
        //第三步：准备数据
        List<Work> worklist=new ArrayList<>();
        Work m7 = new Work(R.drawable.m11, "计算器","2022.3.29");
        worklist.add(m7);
        Work m1 = new Work(R.drawable.m22, "通讯录","2022.4.19");
        worklist.add(m1);
        Work m4 = new Work(R.drawable.m33, "ListView","2022.4.28");
        worklist.add(m4);
        Work m2 = new Work(R.drawable.m44, "BindService","2022.5.5");
        worklist.add(m2);
        Work m6 = new Work(R.drawable.m55, "音乐播放器","2022.5.5");
        worklist.add(m6);



        //第四步：设计每一行的子布局item.xml
        //第五步：创建适配器
        WorkAdapter adapter=new WorkAdapter(worklist);
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
