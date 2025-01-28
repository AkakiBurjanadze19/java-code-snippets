package GENERICS;

public class GenericClass2Example {
    public static void main(String[] args) {
        GenericClass2<String, Integer> example1 = new GenericClass2<>("Akaki", 19);
        GenericClass2<Integer, Boolean> example2 = new GenericClass2<>(19, true);

        System.out.println(example1.getElement1());
        System.out.println(example1.getElement2());

        System.out.println();

        System.out.println(example2.getElement1());
        System.out.println(example2.getElement2());
    }
}
