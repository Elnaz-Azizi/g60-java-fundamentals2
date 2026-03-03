package se.lexicon;

public class MathOperations {
    // 1. ADD TWO INTEGERS
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. ADD TWO DOUBLES (Overloaded)
    public static double add(double a, double b) {
        return a + b;
    }

    // 3. VARARGS (Variable-length Arguments)
    public static int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }


    public static void main(String[] args) {

        // 1. ADD TWO INTEGERS
        int intResult = add(10, 20);
        System.out.println("Adding two integers (10 + 20): " + intResult);


        // 2. ADD TWO DOUBLES
        double doubleResult = add(30.0, 20.5);
        System.out.println("Adding two doubles (10.5 + 20.5): " + doubleResult);


        // 3. VARARGS (Variable Arguments)
        int varargsResult = add(1, 2, 3, 4, 5);
        System.out.println("Adding multiple numbers (1, 2, 3, 4, 5): " + varargsResult);

        // You can even pass zero numbers to the varargs method!
        int emptyResult = add();
        System.out.println("Adding zero numbers: " + emptyResult);

    }
}
