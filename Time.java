public class Time{
   private long hour;
   private long minute;
   private long second;
   
   public Time(){
      long time = System.currentTimeMillis();
      long second = time/1000;
      long minute = second/60;
      long hour = minute/60;
      this.hour = hour%24;
      this.minute = minute%60;
      this.second = second%60;
   }
   
   public Time(long elapsed){
      long second = elapsed/1000; this.second = second%60;
      long minute = second/60; this.minute = minute%60;
      long hour = minute/60; this.hour = hour%24;
   }
   public Time(long hour, long minute, long second){
      this.hour = hour; this.minute = minute; this.second = second;
   }
   public long getHour(){
      return hour;
   }
   public long getMinute(){
      return minute;
   }
   public long getSecond(){
      return second;
   }
   public void setTime(long elapsedTime){
      new Time(elapsedTime);
   }
   
   public static void main(String[] args){
      Time time1 = new Time();
      Time time2 = new Time(555550000);
      
      System.out.println("Time in hour:minute:second is: "+
         time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond()
         );
   }
}