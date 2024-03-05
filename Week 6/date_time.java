import java.time.*;


// import java.util.Date;

public class date_time {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);

        int DayOfMonth=date.getDayOfMonth();
        System.out.println(DayOfMonth);

        int DayOfYear=date.getDayOfYear();
        System.out.println(DayOfYear);

        LocalTime time=LocalTime.now();
        System.out.println(time);
        
        int getHour=time.getHour();
        int  getMinute=time.getMinute();
        int getSecond=time.getSecond();
        System.out.println(getHour+":"+getMinute+":"+getSecond);
        
        
        
        
        
        
        
        
        
        
        // Date date = new Date();
        // System.out.println(date);

        // long time = date.getTime();
        // System.out.println(time + " ms");

        // java.sql.Date sdate = new java.sql.Date(time);
        // System.out.println(sdate);
    }
}
