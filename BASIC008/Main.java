public class Main {
    public static void main(String[] args) {
        long Sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        for(int i = 100; i <= 200; i++){
            if(i % 9 == 0){
                System.out.println(i);
                Sum += i;
            }
        }
        System.out.println(Sum);
    }
}