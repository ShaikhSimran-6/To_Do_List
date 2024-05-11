package com.example.android.model;

import android.widget.RadioButton;

public class TaskModel {

    String time_txt;
    String task_txt;
    Boolean radioButton_task;

    public TaskModel() {
    }

    public TaskModel(String time_txt, String task_txt, Boolean radioButton_task) {
        this.time_txt = time_txt;
        this.task_txt = task_txt;
        this.radioButton_task = radioButton_task;
    }

    public String getTime_txt() {
        return time_txt;
    }

    public void setTime_txt(String time_txt) {
        this.time_txt = time_txt;
    }

    public String getTask_txt() {
        return task_txt;
    }

    public void setTask_txt(String task_txt) {
        this.task_txt = task_txt;
    }

    public Boolean getRadioButton_task() {
        return radioButton_task;
    }

    public void setRadioButton_task(Boolean radioButton_task) {
        this.radioButton_task = radioButton_task;
    }
}
