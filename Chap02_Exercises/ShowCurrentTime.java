////////////////////////////////////////////////////////////////////////////////////////////////////
//  ShowCurrentTime.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: The problem is to develop a program that displays the current time in GMT
//              (Greenwich Mean Time) in the format hour:minute:second, such as 13:19:8.
//  Date: 07292022
////////////////////////////////////////////////////////////////////////////////////////////////////


// class declaration
public class ShowCurrentTime {
    public static void main(String[] args) {

       String ampm;

        // get the total number of milliseconds since midnight
       long totalMilliseconds = System.currentTimeMillis();

       // get the total number of seconds since 01/01/1970
       long totalSeconds = totalMilliseconds / 1000;

       // get the current second in the minute in the hour
       long currentSecond = totalSeconds % 60;

       // get the total minutes
       long totalMinutes = totalSeconds / 60;

       // compute for the current minute in the hour
       long currentMinute = totalMinutes % 60;

       // get the total hours
       long totalHours = totalMinutes / 60;

       // get the current hour
       long currentHour = totalHours % 24;

       if (currentHour > 12)
           ampm = "PM";
       else
           ampm = "AM";

       long currentHourAMPM = currentHour % 12;

       // display the current time
       System.out.println("Current time is "
               + currentHourAMPM + ":"
               + currentMinute + ":"
               + currentSecond
               + " " + ampm
               + " GMT");
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
