package models;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private boolean isComplete;
    private LocalDate createdAt;

    public Task(String t){
        this.id++;
        this.title = t;
        this.isComplete = false;
        this.createdAt = LocalDate.now();
    }
    public int getId(){
        return this.id;
    }
    public String getTitle() {
            return this.title;
    }

    public boolean getIsComplete () {
        return this.isComplete;
    }

    public LocalDate getTime(){
        return this.createdAt;
    }
    public void setIsComplete (boolean c) {
        this.isComplete = c;
    }
}