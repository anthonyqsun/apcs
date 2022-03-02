import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        int secs;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seconds: ");
        secs = scanner.nextInt();
        int hours = secs / 3600; // Since this is integer division, we are left with the floor fx of the decimal division
        int minutes = (secs % 3600) / 60;
        int seconds = (secs % 60);

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", secs, hours, minutes, seconds);

    }
}
