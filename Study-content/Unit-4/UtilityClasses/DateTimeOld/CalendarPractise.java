import java.util.Calendar ;

public class CalendarPractise {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance() ;
        int date = cal.get(Calendar.DATE) ;
        System.out.println("date-> " + date);


        int month = cal.get(Calendar.MONTH);
        System.out.println("month-> " + month);
        
        //Month starts from 0th Index
        month++ ;
        
        int year = cal.get(Calendar.YEAR) ;
        
        int weekDay = cal.get(Calendar.DAY_OF_WEEK) ;

        // date/month/year
        System.out.println(date + "/" + month + "/" + year) ;
        System.out.println(weekDay) ;
    }
}
