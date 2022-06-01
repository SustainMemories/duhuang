package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorktoalAdapter extends RecyclerView.Adapter<WorktoalAdapter.ViewHolder>  {
    private List<Work> nWorklist;
    public WorktoalAdapter(List<Work> nworkList) {
        nWorklist=nworkList;
    }
    //创建ViewHolder实例，将加载出来的布局传入到构造函数中，最后将ViewHolder实例返回
    @Override
    public WorktoalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.totalitem,parent,false);
        WorktoalAdapter.ViewHolder holder=new WorktoalAdapter.ViewHolder(view);
        return holder;
    }
    //每个子项滚动到屏幕内执行，通过positon得到当前项的实例，然后显示图片和文字
    @Override
    public void onBindViewHolder( WorktoalAdapter.ViewHolder holder, int position) {
        final Work work = nWorklist.get(position);
        holder.workImage.setImageResource(work.getImageID());




    }

    //返回数据源的长度
    @Override
    public int getItemCount() {
        return nWorklist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView workImage;

        public  ViewHolder( View view)
        {
            super(view);
            workImage=(ImageView) view.findViewById(R.id.image);

        }

    }
}
