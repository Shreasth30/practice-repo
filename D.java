interface A{

    default void show(){
        System.out.println("A's Show");
    }
}

interface B {
    default void show(){
        System.out.println("B's Show");
    }

    
}
public class D implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("B's Show");
    }

    public static void main(String[] args) {
        B obj = new D();
        obj.show();
    }   
}                               