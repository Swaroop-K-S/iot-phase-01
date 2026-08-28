package day2;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();
}

// Inheretence - uses parent details in child
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // polymorphism
    @Override
    void sound() {
        System.out.println(getName() + " barks woof woof");
    }
}

class cat extends Animal {
    public cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " meows meow meow");
    }
}

public class hgfd {
    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy");
        Animal a2 = new cat("Mimi");

        a1.sound();
        a2.sound();
    }
}
