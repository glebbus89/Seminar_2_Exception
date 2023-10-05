package HomeWork;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        System.out.println(getFloatNumber());
    }

    public static float getFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("число float");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("не соответствуют float");
            }
        }
    }

}
