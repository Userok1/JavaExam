package practica1;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Barsik", 1);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.setName("Sharik");
        d.setAge(2);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.toString());
        d.intoHumanYears();
    }
}
