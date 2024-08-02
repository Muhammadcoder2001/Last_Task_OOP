package Time;

public class MyTime {

    private int Hour;
    private int minute;
    private int second;

    public MyTime(){
        this.Hour = 12;
        this.minute = 50;
        this.second = 24;

    }

    public void setTime(int hour, int minute, int second){
        this.Hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour(){
        return this.Hour;

    }

    public int getMinute(){
        return this.minute;


    }

    public int getSecond(){
        return  this.second;
    }

    public static void main(String[] args) {

    }
}
