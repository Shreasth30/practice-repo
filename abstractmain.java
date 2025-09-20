abstract class Animal {
    public abstract void sound();
}

class Cat extends Animal {
   
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class abstractmain {
    public static void main(String[] args) {
            Animal myCat = new Cat();
        System.out.println("Demonstrating abstract class and method:");
        myCat.sound();
    }
}
