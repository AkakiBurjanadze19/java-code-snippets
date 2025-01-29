package INTERFACES;

public class FooExtendedUsage {
    public static void main(String[] args) {
        FooExtended fooExtended = parameter -> parameter;

        System.out.println(fooExtended.method("hello"));
        System.out.println(fooExtended.method("hello from another print statement"));

        System.out.println(fooExtended.defaultBar());
        System.out.println(fooExtended.defaultBaz());
        System.out.println(fooExtended.defaultCommon());
    }
}
