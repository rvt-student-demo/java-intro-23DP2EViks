package lv.rvt;

import java.util.Scanner;
public class Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int first = Integer.valueOf(scanner.nextLine());
        if (first >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}