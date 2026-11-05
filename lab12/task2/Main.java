// Name: Deepak Kumar | Roll No: 2410303156 | Student ID: BCS2024358 | Assignment 12
public class Main {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
