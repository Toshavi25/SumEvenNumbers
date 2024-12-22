public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 2; // First even number

        while (count < 100) {
            sum += number;
            number += 2; // Move to the next even number
            count++;
        }

        System.out.println("The sum of the first 100 even numbers is: " + sum);
    }
}
