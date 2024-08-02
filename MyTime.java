package Time;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyTime {

    private int Hour;
    private int minute;
    private int second;

    public MyTime(){
        this.Hour = 23;
        this.minute = 59;
        this.second = 59;

    }

    public void setTime(int hour, int minute, int second){
        this.Hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour(){
      return  this.Hour;

    }

    public int getMinute(){
       return  this.minute;

    }

    public int getSecond(){
        return  this.second;

    }

    public void setHour(int hour){
        boolean statement = true;
        while (statement){
            if (hour >= 0 || hour < 24) {
                this.Hour = hour;
                statement = false;
            } else {
                System.out.println("Eslatma : \n Soat -1dan katta 23dan kichkina bo'lishi kerak \n "+
                        "Soatni  qayta kiriting: ");
                Scanner input = new Scanner(System.in);
                hour = input.nextInt();
            }
        }


    }

    public void setMinute(int minute ){
        boolean command = true;
        while (command){
            if (minute >= 0 || minute < 60){
                this.minute = minute;
                command = false;
            }
            else{
                System.out.println("Eslatma : \n Minut -1dan katta 60dan kichkina bo'lishi kerak \n "+
                        "Minutni qayta kiriting: ");
                Scanner input = new Scanner(System.in);
                minute = input.nextInt();
            }

        }

    }

    public void turnString(){
        System.out.println(String.format("%02d:%02d:%02d", this.Hour, this.minute, this.second));

    }

    public void setSecond (int second){
        boolean command = true;
        while(command){
            if (second >= 0 || second < 60){
                this.second = second;
                command = false;
            }
            else{
                System.out.println("Eslatma : \n Second -1dan katta 60dan kichkina bo'lishi kerak \n "+
                        "Secondni qayta kiriting: ");
                Scanner input = new Scanner(System.in);
                second = input.nextInt();

            }
        }

    }

    public int nextHour(){
        if (this.Hour + 1 == 24){
            this.Hour = 0;
            return this.Hour;
        }
        else {
            return  this.Hour + 1;
        }
    }

    public int nextMinute(){
        if(this.minute + 1 == 60){
            this.minute = 0;
            return this.minute;
        }
        else {
            return this.minute + 1;

        }
    }

    public int nextSecond(){
        if(this.second + 1 == 60){
            this.second = 0;
            return this.second;
        }
        else{
            return  this.second + 1;
        }
    }

    public void previousHour(){
        if (this.Hour == 0 ){
            System.out.println("Previous hour is " + 23);
        }
        else {
            System.out.println("Previous Hour is " + (this.Hour - 1));
        }

    }
    public void previousMinute(){
        if (this.minute == 0){
            System.out.println("Previous minute is " + 59);

        }
        else {
            System.out.println("Previous minute is " + (this.minute - 1));
        }

    }

    public void previousSecond(){
        if (this.second == 0){
            System.out.println("Previous second is " + 59);
        }
        else {
            System.out.println("Previous second is " + (this.second - 1));
        }

    }



    public static void main(String[] args) {

        MyTime time = new MyTime();
        time.turnString();
        System.out.println("Next hour is " + time.nextHour());
        System.out.println("Next minute is " + time.nextMinute());
        System.out.println("Next second is " + time.nextSecond());
        time.turnString();
        time.previousHour();
        time.previousMinute();
        time.previousSecond();

    }
}
