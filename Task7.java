import java.util.Scanner;

public class Task7{

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Input num1: ");
        double num1 = user.nextInt();
        System.out.print("Input num2: ");
        double num2 = user.nextInt();

        System.out.printf("Addition: %.2f\nSubtraction: %.2f\nMultiplication: %.2f\nDivision: %.2f\n5",
            addition(num1,num2),subtraction(num1,num2),multiplication(num1,num2),division(num1,num2)
        );
    }

    public static  double addition(double a, double b){
        return a+b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
}
