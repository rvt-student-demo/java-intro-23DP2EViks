package lv.rvt;

import java.util.Scanner;
public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String text = scanner.nextLine();
        

        System.out.println("Give an integer: ");
        int intel = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double: ");
        double double1 = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + intel);
        System.out.println("You gave the double " + double1);
        System.out.println("You gave the boolean " + value);
    }
}