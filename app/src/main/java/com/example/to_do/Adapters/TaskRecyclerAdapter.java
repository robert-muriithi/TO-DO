package com.example.to_do.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.example.to_do.MainActivity;
import com.example.to_do.Models.TaskModel;
import com.example.to_do.R;

import java.util.List;

public class TaskRecyclerAdapter extends RecyclerView.Adapter<TaskRecyclerAdapter.ViewHolder> {
    private List<TaskModel> list;
    private MainActivity mainActivity;

    public TaskRecyclerAdapter(MainActivity activity) {
        this.mainActivity = activity;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        TaskModel taskModel = list.get(position);
        holder.task.setText(taskModel.getTask());
        holder.task.setChecked(toBoolean(taskModel.getStatus()));
    }
    public void setTask(List<TaskModel> taskModelList){
        this.list = taskModelList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return list.size();
    }

    public boolean toBoolean(int n) {
        return n != 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox task;

        ViewHolder(View view) {
            super(view);
            task = view.findViewById(R.id.checkbox);
        }
    }
}
