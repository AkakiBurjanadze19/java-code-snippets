package GENERICS;

public class GenericClass2<T, U> {
    T element1;
    U element2;

    public GenericClass2(T element1, U element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement1() {
        return this.element1;
    }

    public U getElement2() {
        return this.element2;
    }
}
