import java.util.Scanner;

public class Main {

    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < testCases; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int[] array = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                array[j] = Integer.parseInt(parts[j]);
            }

            System.out.println(longestSortedSequence(array));
        }

        sc.close();
    }
}