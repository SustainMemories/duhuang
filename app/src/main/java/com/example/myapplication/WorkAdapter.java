package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.ViewHolder> {
    private List<Work> mWorklist;
    public WorkAdapter(List<Work> workList) {
        mWorklist=workList;
    }
    //创建ViewHolder实例，将加载出来的布局传入到构造函数中，最后将ViewHolder实例返回
    @Override
    public WorkAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    //每个子项滚动到屏幕内执行，通过positon得到当前项的实例，然后显示图片和文字
    @Override
    public void onBindViewHolder( WorkAdapter.ViewHolder holder, int position) {
        final Work work = mWorklist.get(position);
        holder.workImage.setImageResource(work.getImageID());
        holder.workName.setText(work.getName());
        holder.workContent.setText(work.getContent());



    }

    //返回数据源的长度
    @Override
    public int getItemCount() {
        return mWorklist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView workImage;
        TextView workName;
        TextView workContent;
        public  ViewHolder( View view)
        {
            super(view);
            workImage=(ImageView) view.findViewById(R.id.image);
            workName=(TextView) view.findViewById(R.id.name);
            workContent=(TextView) view.findViewById(R.id.content);
        }

    }
}
