// Name: Deepak Kumar | Roll No: 2410303156 | Student ID: BCS2024358 | Assignment 12
public class Main {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
