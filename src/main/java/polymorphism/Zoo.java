package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog bullDog = new Dog();
        bullDog.fetch();
        bullDog.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();

        // down side | type casting cat to use the full method
        ((Cat)sasha).scratch();

    }
}
