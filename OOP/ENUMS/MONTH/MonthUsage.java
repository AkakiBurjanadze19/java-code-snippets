package OOP.ENUMS.MONTH;

public class MonthUsage {
    public static void main(String[] args) {
        MONTH
                july = MONTH.AUG;
        System.out.println(july);

        System.out.println();

        /* looping through enum values */
        for (MONTH month : MONTH.values()) {
            System.out.println(month);
        }
    }
}
