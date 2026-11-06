public class VarArgsSum {

    static int sumAll(int... numbers) {
        int grandTotal = 0;

        for (int n : numbers) {
            int cumulative = 0;
            StringBuilder expr = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                cumulative += i;
                expr.append(i);
                if (i < n) expr.append("+");
            }

            System.out.println(n + " = (" + expr + ") = " + cumulative);
            grandTotal += cumulative;
        }

        return grandTotal;
    }

    public static void main(String[] args) {
        int total = sumAll(4, 5, 10);
        System.out.println("Total = " + total);
    }
}
