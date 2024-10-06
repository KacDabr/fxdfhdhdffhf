public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pies", "Czarny");
        Cat cat = new Cat("Kot", "Bialy");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
