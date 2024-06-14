package INHERITANCE007;

import java.util.ArrayList;
import java.util.Scanner;

abstract class TestQuestion {
    protected String question;

    protected abstract void readQuestion(String question);
}

class Essay extends TestQuestion {
    private int space;

    public Essay(int space) {
        this.space = space;
    }

    public int getSpace() {
        return space;
    }

    public void readQuestion(String question) {
        this.question = question;
        System.out.println(question);
    }
}

class MultiChoice extends TestQuestion {
    private ArrayList<String> listAns = new ArrayList<>();

    public ArrayList<String> getListAns() {
        return this.listAns;
    }

    public void readQuestion(String question) {
        this.question = question;
        System.out.println(question);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        System.out.println(t);

        while (t-- > 0) {
            String s = sc.nextLine();
            if (s.equals("e")) {
                int Space = Integer.parseInt(sc.nextLine());
                Essay e = new Essay(Space);
                System.out.println(s);
                System.out.println(e.getSpace());
                e.readQuestion(sc.nextLine());
            } else {
                MultiChoice m = new MultiChoice();
                System.out.println(s);
                int n = Integer.parseInt(sc.nextLine());
                System.out.println(n);
                m.readQuestion(sc.nextLine());

                for (int i = 0; i < n; i++) {
                    m.getListAns().add(sc.nextLine());
                }

                for (String x : m.getListAns()) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
