public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "Woof. " + name + ",  " + color;
    }
}
