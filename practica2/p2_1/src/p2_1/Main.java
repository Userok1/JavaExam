package p2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Input a size of array: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            }
        }
        int[] arr = new int[n];
        System.out.print("Choose the number of loop you want to use (for - 1, while - 2, do while - 3): ");
        int l = sc.nextInt();
        if (l == 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Math.random() * 50);
                System.out.print(arr[i] + " ");
            }
        } else if (l == 2) {
            int i = 0;
            while (i < n) {
                arr[i] = (int)(Math.random() * 50);
                System.out.print(arr[i] + " ");
                i++;
            }
        } else if (l == 3) {
            int i = 0;
            do {
                arr[i] = (int) (Math.random() * 50);
                System.out.print(arr[i] + " ");
                i++;
            } while (i < n);
        } else {
            System.out.println("Wrong number");
        }
    }
}
