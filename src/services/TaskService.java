package services;

import models.Task;
//import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {
    public void addTask () {
        System.out.println("add ur task ;) ");

        Scanner scan = new Scanner(System.in);
        System.out.println("task title : ");
        String title = scan.nextLine();

        Task task = new Task(title);
        FileService file = new FileService();
        file.store(task.getTitle(), task.getIsComplete(), task.getTime());
    }

    public void listTasks(){
        System.out.println("----------- task list -----------");

        FileService file = new FileService();
        file.list();
    }
}