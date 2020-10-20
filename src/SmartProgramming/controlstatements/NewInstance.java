package SmartProgramming.controlstatements;

class Student {
}

class Customer {
}

class Test {
    public Test(String ram, int i) {
    }
}

public class NewInstance {
    public static void main(String[] args) throws Exception {
        Object object = Class.forName(args[0]).newInstance();
        System.out.println("Object created for :" + object.getClass().getName());

    }

}