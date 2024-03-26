package pr2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.print("Введите число, факториал которого хотите найти: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
        }
        if (n == 0) {
            System.out.println("Factorial(0) = 1");
        } else {
            int result = fact(n);
            System.out.println("Factorial("+n+") = "+result);
        }
    }

    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
