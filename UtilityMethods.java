public class UtilityMethods {
    // 1.maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    // 2.if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    // 3. Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    // 4.to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    // 5.if a number is positive, negative, or zero
    public static String checkNumber(int num) {
        if (num > 0)
            return "Positive";
        else if (num < 0)
            return "Negative";
        else
            return "Zero";
    }
    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(isEven(6));
        System.out.println(reverseString("computer"));
        System.out.println(factorial(5));
        System.out.println(checkNumber(-3));
    }
}