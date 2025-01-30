package OOP.DATE;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalStateException("day must be between 1 and 31!");
        }

        this.day = day;
    }

    private int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalStateException("month must be between 1 and 12!");
        }

        this.month = month;
    }

    private int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalStateException("year can start from only 1!");
        }

        this.year = year;
    }

    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
