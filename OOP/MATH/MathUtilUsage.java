package OOP.MATH;

public class MathUtilUsage {
    public static void main(String[] args) {
        System.out.println("PI: " + MathUtil.PI);
        System.out.println("E: " + MathUtil.E);

        System.out.println();

        System.out.println("2 + 3 = " + MathUtil.add(2, 3));
        System.out.println("10 - 5 = " + MathUtil.sub(10, 5));
        System.out.println("10 * 10 = " + MathUtil.mul(10, 10));
        System.out.println("16 / 8 = " + MathUtil.div(16, 8));
        System.out.println("25 % 3 = " + MathUtil.mod(25, 3));
    }
}
