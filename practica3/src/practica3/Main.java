package practica3;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.toString());
        b.setTitle("Fight club");
        b.setAuthorFirstName("Chuck");
        b.setAuthorLastName("Palahniuk");
        System.out.println(b.toString());
    }
}
