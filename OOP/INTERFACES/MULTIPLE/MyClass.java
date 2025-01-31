package OOP.INTERFACES.MULTIPLE;

public class MyClass implements FirstInterface, SecondInterface {
    @Override
    public void firstInterfaceMethod() {
        System.out.println("first interface method.");
    }

    @Override
    public void secondInterfaceMethod() {
        System.out.println("second interface method.");
    }
}
