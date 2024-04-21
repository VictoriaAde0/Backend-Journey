package Studentpractice;
import java.util.Scanner;
public class Studentpractice {
    public static void main(String[] args) {

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }
    }

    public class Greetings {
        public static void main(String[] args)
            System.out.println("Hello, World!");
        }


    public class Main {
        public static void main(String[] args) {

            int a = 5, b = 10, c = 15;
            System.out.println(a < b && a > c);

            int n = -7;
            if (n >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
            int y;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            y = sc.nextInt();
            if (y % 4 == 0) {
                System.out.println("This number is Even");
            } else {
                System.out.println("This number is Odd");
            }
        }

        public class pract {
            public static void Loop(String[] args) {
//            int i = 1;
//            while (i < 100) {
//                System.out.println(i);
//                i = i * 2;
//            }
                for (int i=0;i>=10;i++);
                {
                    System.out.println();
                }
                int A[]=new int[10];
                int B[]={1,2,3,4,5,6,7,8,9,10};
                int C[];
                C=new int[10];
                B [2]=15;
                for(int i=0;i<A.length;i++)
                {
                    System.out.println(A[i]);
                }
                for(int x:B)
                {
                    System.out.println(x++);
                }
                for (int x:B)
                {
                    System.out.println(x);
                }
            }
            public class Array
            {
                public static  void  Array(String[]args)
            }
                {
                    int A[][]=new int[5][5];
                    int B[][]={{1,2,3},{2,4,6},{1,3,5}};
                    int C[][];
                    C=new int[5][5];
                }
            }
        }
    public class ArithmeticOperations{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter next number: ");
            double number2 = scanner.nextDouble();
            scanner.close();
            System.out.println("Addition result: " + addition(number1, number2));
            System.out.println("Subtraction result: " + subtraction(number1, number2));
            System.out.println("Multiplication result: " + multiplication(number1, number2));
            System.out.println("Division result: " + division(number1, number2));
        }
        public static double Addition(double A, double B) {
        return A + B;
        }
        public static double Subtraction(double A, double B) {
        return A - B;
        }
        public static double Multiplication(double A, double B) {
        return A * B;
        }
        public static double Division(double A, double B) {
        if (B == 0) {
            System.out.println("Number can't be divided by zero");
            return Double.Nil
        }
        return A / B;
        }
}

