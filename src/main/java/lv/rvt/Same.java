package lv.rvt;

import java.util.Scanner;
public class Same {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = reader.nextLine();
        System.out.println("Enter the second string:");
        String second = reader.nextLine();
        
        if (first.equals(second)) {
            System.out.println("same!");
        } else {
            System.out.println("Different");
        }
    }
}