package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog bullDog = new Dog();
        bullDog.fetch();
        bullDog.makeSound();

        Animal rocky = new Dog();
        rocky.makeSound();

        rocky = new Cat();
        rocky.makeSound();
    }
}
