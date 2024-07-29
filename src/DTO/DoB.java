package DTO;
public class DoB {
    private int doB;
    private int moB;
    private int yoB;
    public DoB() {

    }
    public DoB(int doB, int moB, int yoB) {
        if (isValidDate(doB, moB, yoB)) {
            this.doB = doB;
            this.moB = moB;
            this.yoB = yoB;
        } else {
            throw new IllegalArgumentException("DOB is invalid");
        }
    }
    public int getDoB() {
        return doB;
    }
    public void setDoB(int doB) {
        if (isValidDate(doB, this.moB, this.yoB)) {
            this.doB = doB;
        } else {
            throw new IllegalArgumentException("doB is invalid");
        }
    }
    public int getMoB() {
        return doB;
    }
    public void setMoB(int moB) {
        if (isValidDate(doB, this.moB, this.yoB)) {
            this.moB = moB;
        } else {
            throw new IllegalArgumentException("doB is invalid");
        }
    }
    public int getYoB() {
        return yoB;
    }
    public void setYoB(int yoB) {
        if (isValidDate(doB, this.moB, this.yoB)) {
            this.yoB = yoB;
        } else {
            throw new IllegalArgumentException("doB is invalid");
        }
    }
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1) return false;

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        return day <= daysInMonth[month - 1];
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}