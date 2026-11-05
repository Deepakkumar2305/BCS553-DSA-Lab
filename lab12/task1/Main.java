// Name: Deepak Kumar | Roll No: 2410303156 | Student ID: BCS2024358 | Assignment 12
public class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
