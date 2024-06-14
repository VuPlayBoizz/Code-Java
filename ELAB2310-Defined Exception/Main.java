import java.util.Scanner;

// Định nghĩa ngoại lệ mới
class FileNameFormatException extends Exception {
    public FileNameFormatException(String message) {
        super(message);
    }
}

class Test {
    public static void open_file(String s) {
        try {
            // Gọi phương thức f() ném ngoại lệ
            f(s);
        } catch (FileNameFormatException fname) {
            System.out.println(fname.getMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void f(String s) throws FileNameFormatException {
        // Định nghĩa phương thức f()
        if (s.contains(" ")) {
            throw new FileNameFormatException("File name format");
        } else {
            System.out.println("File opened");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test.open_file(s);
        sc.close();
    }
}
