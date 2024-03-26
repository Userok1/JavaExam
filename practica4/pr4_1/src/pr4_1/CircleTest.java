package pr4_1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a radius: ");
        double r = scanner.nextDouble();
        Circle c = new Circle(r);
        System.out.println(c.getS());
        c.setR(8);
        System.out.println(c.getS());
        System.out.println(c.toString());
    }
}
