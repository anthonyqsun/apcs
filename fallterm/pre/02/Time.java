public class Time {
    public static void main(String[] args) {
        int hour = 14;
        int minute = 21;
        int second = 15;

        final int seconds_in_hour = 3600;
        final int seconds_in_min = 60;
        final int seconds_in_day = 86400;
        
        int secs_since_midnight = hour*seconds_in_hour + minute*seconds_in_min + second;
        int secs_till_eod = seconds_in_day - secs_since_midnight;
        double db_secs_since_midnight = secs_since_midnight;
        double percent_elapsed = 100.0 * db_secs_since_midnight / 86400;

        int prior_hour = 14;
        int prior_minute = 14;
        int prior_second = 4;

        int secs_elapsed = (hour-prior_hour)*seconds_in_hour + (minute-prior_minute)*seconds_in_min + second - prior_second;

        System.out.print("Seconds since midnight: ");
        System.out.println(secs_since_midnight);
        System.out.print("Seconds till end of day: ");
        System.out.println(secs_till_eod);
        System.out.print("Percent of day elapsed: ");
        System.out.println(percent_elapsed);
        System.out.print("Seconds elapsed since start of code: ");
        System.out.println(secs_elapsed);
    }
}
