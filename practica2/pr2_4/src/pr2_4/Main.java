package pr2_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while(n < 1) {
            System.out.print("Ведите желаемый размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
        }
        if (n > 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Math.random() * 200);
            }
            Main.arrayOuput(arr);
            Arrays.sort(arr);
            Main.arrayOuput(arr);
        }
    }

    public static void arrayOuput(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
