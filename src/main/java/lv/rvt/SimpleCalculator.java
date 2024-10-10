package lv.rvt;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        
        int summa1 = first + second;
        int summa2 = first - second;
        int summa3 = first * second;
        double summa4 = (double) first / second;
        System.out.println(first + "+" + second + "=" + summa1);
        System.out.println(first + "-" + second + "=" + summa2);
        System.out.println(first + "*" + second + "=" + summa3);
        System.out.println(first + "/" + second + "=" + summa4);
    }
}