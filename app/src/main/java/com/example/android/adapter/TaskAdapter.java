package com.example.android.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.R;
import com.example.android.model.TaskModel;

import java.util.List;


public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    List<TaskModel> modelList;

    public TaskAdapter(List<TaskModel> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.task_card_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
        public void onBindViewHolder(@NonNull TaskAdapter.MyViewHolder holder, int position) {

        TaskModel model = modelList.get(position);
        holder.time_txt.setText(model.getTime_txt());
        holder.task_txt.setText(model.getTask_txt());
//        holder.radioButton_task.setStateDescription();

        }

        @Override
        public int getItemCount() {
            return modelList.size();
        }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView time_txt, task_txt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            time_txt = itemView.findViewById(R.id.time_txt);
            task_txt = itemView.findViewById(R.id.task_txt);

        }


    }
}
