package INTERFACES.EXAMPLES.CUSTOM;

public class StringProcessorUsage {
    public static void main(String[] args) {
        StringProcessor toUpper = s -> s.toUpperCase();

        System.out.println(toUpper.process("hello"));
        System.out.println(toUpper.process("how"));
        System.out.println(toUpper.process("when"));
    }
}
