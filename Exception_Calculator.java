package com.company;

import java.util.Scanner;

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input should not exceed more than 100000";
    }
}
class MaxMultiReachedException extends Exception{
    @Override
    public String toString() {
        return "Input should not exceed more than 7000 for multiplication";
    }
   /*@Override
   public String getMessage() {
       return "Input should not exceed more than 7000 for multiplication" ;
   }*/

}
public class Exception_Calculator {
    static int num1, num2;

    public static int add() throws MaxInputException {
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        } else return num1 + num2;
    }

    public static int sub() throws MaxInputException {
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        } else return num1 - num2;
    }

    public static int multiply() throws MaxMultiReachedException {
        if (num1 > 7000 || num2 > 7000) {
            throw new MaxMultiReachedException();
        }
        return num1 * num2;
    }

    public static int divide() throws MaxInputException {
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        } else try {
            int c;
            return c = (num1 / num2);
        } catch (Exception e) {
            System.out.println("Zero as dividend not valid");

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations :\n For addition Enter 1\n For subtraction Enter 2\n For multiplication Enter 3\n For division Enter 4\n For exit Enter 0");
        int opr = sc.nextInt();
        System.out.println("Enter a num 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter a num 2 : ");
        num2 = sc.nextInt();
        while (opr != 0) {
            switch (opr) {
                case 1:
                    try {
                        System.out.println(add());
                    } catch (MaxInputException e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try {
                        System.out.println(sub());
                    } catch (MaxInputException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    try {
                        System.out.println(multiply());
                    } catch (MaxMultiReachedException e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try {
                        System.out.println(divide());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                }
            System.out.println("Operations :\n For addition Enter 1\n For subtraction Enter 2\n For multiplication Enter 3\n For division Enter 4\n For exit Enter 0");
            opr = sc.nextInt();
            if (opr ==0){
                break;
            }
            System.out.println("Enter a num 1 : ");
            num1 = sc.nextInt();
            System.out.println("Enter a num 2 : ");
            num2 = sc.nextInt();
        }
        System.out.println("Exited");
    }
}
