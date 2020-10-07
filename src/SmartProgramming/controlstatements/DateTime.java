package SmartProgramming.controlstatements;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        int day, month, year;
        int seconds, minutes, hours;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        month = gregorianCalendar.get(Calendar.MONTH);
        year = gregorianCalendar.get(Calendar.YEAR);
        seconds = gregorianCalendar.get(Calendar.SECOND);
        minutes = gregorianCalendar.get(Calendar.MINUTE);
        hours = gregorianCalendar.get(Calendar.HOUR);
        int milliseconds = gregorianCalendar.get(Calendar.MILLISECOND);
        System.out.println("Date is: " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Time is: " + hours + ":" +  minutes + ":" + seconds + ":" + milliseconds);
    }
}
