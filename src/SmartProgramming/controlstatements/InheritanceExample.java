package SmartProgramming.controlstatements;

class Parent {

    static int x = 10;
    static int y = 20;

    public static void show() {
        System.out.println("Parent Class show() method");

    }

}

public class InheritanceExample extends Parent {

    public static void main(String[] args) {

        InheritanceExample inheritanceexample = new InheritanceExample();
        inheritanceexample.show();
        inheritanceexample.display();

        System.out.println(x);

    }

    public static void display() {

        System.out.println("Child Inherited class display methods ");
    }

}
