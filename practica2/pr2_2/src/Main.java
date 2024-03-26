import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите аргументы (для завершение введите end): ");
        while (sc.hasNext()) {
            String arg = sc.next();
            if (arg.equals("end")) {
                break;
            }
            System.out.println("Аргумент: " + arg);
        }
        sc.close();
    }
}
