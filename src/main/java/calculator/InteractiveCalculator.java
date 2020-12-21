package calculator;

import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number A please");
        int numberA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me number B please");
        int numberB = scanner.nextInt();
        System.out.println("Give me a operation please");
        scanner.nextLine();
        String Operation = Scanner.nextLine();
        System.out.println(scanner.nextInt());
    }
}
