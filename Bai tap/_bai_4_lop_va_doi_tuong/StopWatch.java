import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;
    // constructor
    public  StopWatch() {
        startTime = LocalTime.now();
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void stop() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int hour = endTime.getHour() - startTime.getHour();
        int minute = endTime.getMinute() - startTime.getMinute();
        int second = endTime.getSecond() - startTime.getSecond();
        return (hour*3600 + minute*60 + second)*1000;
    }
}
