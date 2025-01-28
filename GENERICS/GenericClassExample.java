package GENERICS;

public class GenericClassExample {
    public static void main(String[] args) {
        GenericClass<Integer> integerExample = new GenericClass<>(10);
        GenericClass<String> stringExample = new GenericClass<>("hello");
        GenericClass<Boolean> booleanExample = new GenericClass<>(true);

        System.out.println(integerExample.getElement());
        System.out.println(stringExample.getElement());
        System.out.println(booleanExample.getElement());
    }
}
