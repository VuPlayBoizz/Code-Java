import java.util.Scanner;

class Main {
    static int swapDigitPairs(int n) {

        int count = 0;
        int tmp = n;
        while (tmp > 0) {
            tmp /= 10;
            count ++;
        }
        int A[] = new int[count];
        tmp = n;
        for (int i = count - 1; i >= 0; i--) {
            A[i] = tmp % 10;
            tmp /= 10;
        }

        if(count % 2 == 0){
            for(int i = 0; i < count; i+=2){
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }
        else{
            for(int i = 1; i < count; i+= 2){
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }
        int result = 0;
        for (int i = 0; i < count; i++) {
            result = result * 10 + A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            System.out.println(swapDigitPairs(n));
        }
        sc.close();
    }
}