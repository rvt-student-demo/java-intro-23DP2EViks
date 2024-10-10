package lv.rvt;

import java.util.Scanner;
public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int first = Integer.valueOf(scanner.nextLine());
        if (first == 1984) {
            System.out.println("Orwell");
        }
    }
}