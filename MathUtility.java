public class MathUtility {
    // Power: a^b
    public static long power(int a, int b) {
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    // Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Prime check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        System.out.println("Power(2,3): " + MathUtility.power(2, 3));
        System.out.println("Factorial(5): " + MathUtility.factorial(5));
        System.out.println("IsPrime(7): " + MathUtility.isPrime(7));
        System.out.println("GCD(12, 18): " + MathUtility.gcd(12, 18));
    }
}