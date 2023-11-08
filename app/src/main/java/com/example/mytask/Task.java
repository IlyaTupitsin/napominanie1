package com.example.mytask;
//класс с полями название задачи и её датой
public class Task {  private int id;
    private String title;
    private String date;

    public Task() {
    }

    public Task(int id, String title, String date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setDate(String date) {
        this.date = date;
    }
}
