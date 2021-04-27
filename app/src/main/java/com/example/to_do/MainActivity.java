package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.to_do.Adapters.TaskRecyclerAdapter;
import com.example.to_do.Models.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TaskRecyclerAdapter taskRecyclerAdapter;
    private List<TaskModel> taskModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        taskModelList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        taskRecyclerAdapter = new TaskRecyclerAdapter(this);
        recyclerView.setAdapter(taskRecyclerAdapter);

        TaskModel taskModel = new TaskModel();
        taskModel.setTask("Sample");
        taskModel.setId(1);
        taskModel.setStatus(0);

        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);
        taskModelList.add(taskModel);


        taskRecyclerAdapter.setTask(taskModelList);
    }
}