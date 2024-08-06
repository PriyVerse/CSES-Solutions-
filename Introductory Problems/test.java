import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        long[] array = new long[n];  // Use long to handle large numbers

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();  // Use nextLong for large numbers
        }

        // Variable to count the minimum number of moves
        long moves = 0;

        // Loop through the array and calculate the number of moves
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                // Calculate the number of moves needed
                long difference = array[i - 1] - array[i];
                // Update the element to be at least as large as the previous one
                array[i] = array[i - 1];
                // Add the number of moves to the total
                moves += difference;
            }
        }

        // Print the result
        System.out.println(moves);

        // Close the scanner
        scanner.close();
    }
}
