// Name: Deepak Kumar | Roll No: 2410303156 | Student ID: BCS2024358 | Assignment 2
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
