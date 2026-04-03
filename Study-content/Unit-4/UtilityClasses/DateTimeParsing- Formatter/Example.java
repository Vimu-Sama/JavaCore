import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;

public class Example {
    public static void main(String[] args) {
        //YYYY -> Year
        //MM -> Month
        //dd -> Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        System.out.println(LocalDateTime.now().format(formatter));

        //parsing Date and Time from String
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2028-11-02", formatter1);
        System.out.println(date);

        //parsing Date and Time from String in different ways
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        String s= "2018-02-14 12:24:00" ;
        LocalDateTime date2 = LocalDateTime.parse(s, formatter2) ;
        System.out.println("Date-> " + date2) ;
    }
}
