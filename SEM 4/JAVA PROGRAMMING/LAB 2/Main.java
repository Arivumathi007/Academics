import java.util.Scanner;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time addTime(Time other) {
        int totalSeconds = this.second + other.second;
        int totalMinutes = this.minute + other.minute + totalSeconds / 60;
        int totalHours = this.hour + other.hour + totalMinutes / 60;

        int finalSecond = totalSeconds % 60;
        int finalMinute = totalMinutes % 60;
        int finalHour = totalHours % 24;

        return new Time(finalHour, finalMinute, finalSecond);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first time:");
        System.out.print("Hours: ");
        int hour1 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minute1 = scanner.nextInt();
        System.out.print("Seconds: ");
        int second1 = scanner.nextInt();

        System.out.println("Enter the second time:");
        System.out.print("Hours: ");
        int hour2 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minute2 = scanner.nextInt();
        System.out.print("Seconds: ");
        int second2 = scanner.nextInt();

        Time time1 = new Time(hour1, minute1, second1);
        Time time2 = new Time(hour2, minute2, second2);

        Time result = time1.addTime(time2);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Sum of Time: " + result);

        scanner.close();
    }
}
