public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }}