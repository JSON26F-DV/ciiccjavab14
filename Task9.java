import static java.lang.Math.*;

public class Task9{

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.divideExact(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Math.addExact(10,25) = " + add(10, 25));
        System.out.println("Math.subtractExact(98, 48) = " + subtract(98, 48));
        System.out.println("Math.multiplyExact(12, 16) = " + multiply(12, 16));
        System.out.println("Math.divideExact(15, 2) = " + divide(15, 2));
    }
}
