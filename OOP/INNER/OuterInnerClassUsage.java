package OOP.INNER;

public class OuterInnerClassUsage {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        int sum = outer.x + inner.y;
        System.out.println("sum: " + sum);
    }
}
