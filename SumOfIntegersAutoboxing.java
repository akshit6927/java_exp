// Part a: Sum of Integers Using Autoboxing and Unboxing
import java.util.*;

public class SumOfIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of integers
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        // Using ArrayList of Integer (demonstrates Autoboxing)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Taking input numbers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();     // primitive int
            numbers.add(num);           // Autoboxing: int -> Integer
        }

        // Calculating sum using Unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer -> int
        }

        // Output
        System.out.println("The sum of integers is: " + sum);

        sc.close();
    }
}
