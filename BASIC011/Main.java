import java.util.Scanner;

class Main {
    static int minGap(int[] arr){
        if (arr.length < 2) {
            return 0;
        }
        int min = arr[1] - arr[0];
        for(int i = 1; i < arr.length - 1; i++){
            int tmp = arr[i + 1] - arr[i];
            if(tmp < min){
                min = tmp;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {
            String S = sc.nextLine();
            String[] words = S.split(" ");
            int[] numbers = new int[words.length];
            for(int j = 0; j < words.length; j++){
                numbers[j] = Integer.parseInt(words[j]);
            }
            System.out.println(minGap(numbers));
        }
        sc.close();
    }
}