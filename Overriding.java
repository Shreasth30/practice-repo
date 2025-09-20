
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        genericAnimal.sound(); 
        myDog.sound();         
    }
} 
