package pr3_1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String name = scanner.next();
        System.out.print("Введите email: ");
        String email = scanner.next();
        System.out.print("Введите гендер автора: ");
        char gender = scanner.next().charAt(0);
        if (gender == 'M' || gender == 'F' || gender == 'U') {
            Author obj = new Author(name, email, gender);
            System.out.println("Name: " + obj.getName());
            System.out.println("Email: " + obj.getEmail());
            obj.setEmail("google@gmail.com");
            System.out.println("New email: " + obj.getEmail());
            System.out.println("Gender: " + obj.getGender());
            System.out.println(obj.toString());
        }
        scanner.close();
    }
}
