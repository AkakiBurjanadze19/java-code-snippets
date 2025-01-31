package OOP.ENUMS.LEVEL;

public class LevelUsage {
    public static void main(String[] args) {
        Level medium = Level.MEDIUM;
        System.out.println(medium);

        System.out.println();

        /* looping through Level enum values */
        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
}
