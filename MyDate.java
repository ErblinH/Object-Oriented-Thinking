import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate{

/*
10.14 (The MyDate class) Design a class named MyDate. The class contains:
The data fields year, month, and day that represent a date. month is
0-based, i.e., 0 is for January.
 A no-arg constructor that creates a MyDate object for the current date.
A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
 A constructor that constructs a MyDate object with the specified year,
month, and day.
 Three getter methods for the data fields year, month, and day, respectively.
A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
*/

   private int year;
   private int month;
   private int day;
   
   public MyDate(){
      GregorianCalendar calendar = new GregorianCalendar();
      year = calendar.get(Calendar.YEAR);
      month = calendar.get(Calendar.MONTH);
      day = calendar.get(Calendar.DAY_OF_MONTH);
   }
   
   public MyDate(long time){
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTimeInMillis(time);
      year = calendar.get(Calendar.YEAR);
      month = calendar.get(Calendar.MONTH);
      day = calendar.get(Calendar.DAY_OF_MONTH); 
   }
   
   public MyDate(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public void setTime(long elapsedTime){
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTimeInMillis(elapsedTime);
      year = calendar.get(Calendar.YEAR);
      month = calendar.get(Calendar.MONTH);
      day = calendar.get(Calendar.DAY_OF_MONTH);
   }
}
