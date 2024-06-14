import java.util.Scanner;

class Main {
    static int quadrant(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(quadrant(x, y));
        }
        scanner.close();
    }
}