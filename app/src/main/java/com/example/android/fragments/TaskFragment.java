package com.example.android.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.R;
import com.example.android.adapter.TaskAdapter;
import com.example.android.model.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class TaskFragment extends Fragment {

    RecyclerView recyclerView;
    List<TaskModel> taskModelList;
    TaskAdapter adapter;


    public TaskFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_task, container, false);
        recyclerView = rootView.findViewById(R.id.task_rv);
        taskModelList = new ArrayList<>();
        taskModelList.add(new TaskModel("1:13 PM", "Make a to-do list", false));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new TaskAdapter(taskModelList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }


}