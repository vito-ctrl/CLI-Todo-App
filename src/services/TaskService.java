package services;

import models.Task;
//import java.util.ArrayList;
import java.util.Scanner;
//import services.FileService;

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
}