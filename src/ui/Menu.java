package ui;
import java.util.Scanner;
public class Menu {
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("welcom to the To do App CLI");
        System.out.println("1 . add task ");
        System.out.println("2 . delete task ");
        System.out.println("3 . list tasks ");
        System.out.println("4 . mark completed ");
        System.out.print(":: ");
    }
}