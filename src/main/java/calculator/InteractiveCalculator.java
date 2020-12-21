package calculator;

import calculator.operations.AddOperation;
import calculator.operations.DivideOperation;
import calculator.operations.MultiplyOperation;
import calculator.operations.SubtractOperation;

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
        String Operation = scanner.nextLine();

        int result = 0;
        if (Operation.equals("add")) {
            AddOperation add = new AddOperation();
            add.setA(numberA);
            add.setB(numberB);
            result = add.getResult();
        }else if (Operation.equals("subtract")){
            SubtractOperation subtract = new SubtractOperation();
            subtract.setA(numberA);
            subtract.setB(numberB);
            result = subtract.getResult();
        }else if (Operation.equals("multiply")){
            MultiplyOperation multiply = new MultiplyOperation();
            multiply.setA(numberA);
            multiply.setB(numberB);
            result = multiply.getResult();
        }else if (Operation.equals("divide")){
            DivideOperation divide = new DivideOperation();
            divide.setA(numberA);
            divide.setB(numberB);
            result = divide.getResult();
        }else{
            System.out.println("Did not understand operation");
        }

        System.out.println("The result is " + result);
    }
}
