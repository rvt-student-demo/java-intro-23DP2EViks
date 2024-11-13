package lv.rvt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();
        
        
        System.out.println("Enter numbers");
        
        while (true){
        int number = scanner.nextInt();
        if (number == -1) {
            break;
        }
        allNumbers.addNumber(number);
        if (number % 2 == 0) {
            evenNumber.addNumber(number);
        } else {
            oddNumber.addNumber(number);
        }
        
    }
    System.out.println("Sum: " + allNumbers.sum());
    System.out.println("Sum of even numbers: " + evenNumber.sum());
    System.out.println("Sum of odd numbers: " + oddNumber.sum());
    scanner.close();
    }
}
