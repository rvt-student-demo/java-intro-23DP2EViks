package lv.rvt;

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        System.out.println("What\'s your name");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String start = "Hi ";
        System.out.println(start + message);
    }
}