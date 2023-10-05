package HomeWork;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        try {
            nameMethod();
        } catch (Exception e) {
            System.err.println("пустая строка. введите заново");
        }
    }

    public static void nameMethod() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String input = scanner.nextLine();
        if (input.length() == 0)
            throw new RuntimeException();
        else {
            System.out.println(input);
        }
        scanner.close();
    }

}
