package lv.rvt;

import java.util.Scanner;
public class CheckingTheAge {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner reader = new Scanner(System.in);

    System.out.println("How old are you?");
    int number = Integer.valueOf(reader.nextLine());

    

        if (number >= 0 && number <= 122) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}