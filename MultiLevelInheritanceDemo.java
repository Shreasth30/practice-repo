// Base class
class A {
    void displayA() {
        System.out.println("Class A method");
    }
}

// Derived class from A
class B extends A {
    void displayB() {
        System.out.println("Class B method");
    }
}

// Derived class from B (multi-level inheritance)
class C extends B {
    void displayC() {
        System.out.println("Class C method");
    }
}

// Main class to demonstrate multi-level inheritance
public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA(); // Inherited from A
        obj.displayB(); // Inherited from B
        obj.displayC(); // Own method
    }
}
// this is a multi level inheritance example in java 
// Output: