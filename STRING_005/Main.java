package STRING_005;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static boolean isPangram(String sentence) {
        // Tạo một tập hợp để lưu trữ các ký tự đã gặp
        Set<Character> letters = new HashSet<>();

        // Duyệt qua từng ký tự trong chuỗi và thêm vào tập hợp
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        // Kiểm tra kích thước của tập hợp, nếu bằng 26 thì là pangram
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while(testCases >= 0) {
            String input = sc.nextLine();
            boolean result = isPangram(input);
            System.out.println(result);
            testCases--;
        }

        sc.close();
    }
}