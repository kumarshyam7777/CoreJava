package SmartProgramming.controlstatements;

public class Demo {


    Demo() {
         System.out.println("no-args constructor");
     }
    public static void main(String[] args) throws Exception {
        Object object = Class.forName(args[0]).newInstance();
        System.out.println("Object Created for:" + object.getClass().getName());
    }

}