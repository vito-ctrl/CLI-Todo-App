package ui;
import java.util.Scanner;
import services.TaskService;

public class Menu {

    private void menu(){
        System.out.println("welcom to the To do App CLI");
        System.out.println("1 . add task ");
        System.out.println("2 . delete task ");
        System.out.println("3 . list tasks ");
        System.out.println("4 . mark completed ");
    }

    private int choise () {
        Scanner scan = new Scanner(System.in);
        System.out.print(":: ");
        int choise = scan.nextInt();
        return choise;
    }
    public void start(){
        menu();
        TaskService task = new TaskService();
        switch (choise()) {
            case 1 :
                task.addTask();
                break;
            case 2 :
                task.deleteTask();
                break;
        }
    }
}