package GENERICS;

public class GenericClass<T> {
    T element;

    public GenericClass(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }
}
