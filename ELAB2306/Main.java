package ELAB2306;

import java.io.IOException;
import java.lang.ArithmeticException;
import java.util.Scanner;
class MyMethods {
    public void m(int x) {
        try {
            m2(x);
            System.out.println(1);    
        } catch (ArithmeticException e) {
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(2);
        }        
    }

    public  void m2(int x) throws IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        System.out.println(5);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMethods myMethods = new MyMethods();
        int x = sc.nextInt();

        if(x == 2){
            myMethods.m(2);
        }
        else if(x == 1){
            myMethods.m(1);
        }
        else myMethods.m(0);
        }
} 