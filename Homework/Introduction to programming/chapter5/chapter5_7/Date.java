package chapter5_7;

public class Date {
    private byte day;
    private byte month;
    private int year;

    public Date(int year, byte month, byte day ) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public byte getDay() {
        return this.day;
    }

    public byte getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.year + "년 " + this.month + "월 " + this.day + "일 입니다.";
    }

    public boolean isEqual(Date date) {
        return this.day == date.getDay() && this.month == date.getMonth() && this.year == date.getYear();
    }

    public boolean isEarly(Date date) {
        if (this.year < date.getYear()) {
            return true;
        } else if (year == date.getYear()) {
            if (this.month < date.getMonth()) {
                return true;
            } else if (this.month == date.getMonth()) {
                if (this.day < date.getDay()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isLeapYear() {
        return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0;
    }

    public String nextDay() {
        int nextYear = this.year;
        int nextMonth = this.month;
        int nextDay = this.day + 1;

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear()) {
            days[2] = 29;
        }
        if (nextDay > days[this.month]) {
            nextDay = 1;
            nextMonth += 1;
        }
        if (nextMonth > 12) {
            nextYear += 1;
            nextMonth = 1;
        }

        return nextYear + "년 " + nextMonth + "월 " + nextDay + "일 입니다.";
    }
}
