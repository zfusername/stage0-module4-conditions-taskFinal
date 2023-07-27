package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28; // Not Leap year
                }
                break;
            default:
                System.out.println("invalid date");
                return;
        }

        System.out.println(days);
    }
    }

