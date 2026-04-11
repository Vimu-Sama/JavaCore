


import java.time.DayOfWeek;
import java.time.LocalDate ;
import java.time.LocalDateTime;
import java.time.LocalTime ;
import java.time.ZoneId;
import java.time.ZonedDateTime ;

public class NewDateTimeAPI {
    public static void main(String[] args) {
        
        //LocalDate used for getting local date 
        //for cases when we are only working with date
        LocalDate date= LocalDate.now() ;
        System.out.println("Date-> " + date) ;
        
        int dayNum= date.getDayOfMonth() ;
        int dayYearNum= date.getDayOfYear() ;

        DayOfWeek dw= date.getDayOfWeek() ;
        int dwInt= date.getDayOfWeek().getValue() ;

        int  year = date.getYear() ;




        //LocalTime used for getting time
        //for cases when we are only working with time
        LocalTime localTime = LocalTime.now() ;
        System.out.println(localTime) ;

        //LocalDateTime used for getting local Date and Time
        //for cases when we are only working with time
        LocalDateTime localDateTIme = LocalDateTime.now() ;
        System.out.println("localDateTime-> " + localDateTIme);
    
        //ZonedDateTime used when u want date and time along with TimeZone
        ZonedDateTime zonedDateTime = ZonedDateTime.now() ;
        System.out.println("Zoned DateTime-> " + zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("UTC")) ;
        System.out.println("Zoned Date Time edited Zone-> " + zonedDateTime1);
    }
}
