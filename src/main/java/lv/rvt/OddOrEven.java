package lv.rvt;

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner reader = new Scanner(System.in);

int number = Integer.valueOf(reader.nextLine());

if (number % 2 == 0) {
    System.out.println("The number " + number + " is even");
} else {
    System.out.println("The number " + number + " is odd.");
}
    }
}