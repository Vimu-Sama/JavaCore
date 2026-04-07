import java.time.LocalDate;
import java.time.format.DateTimeFormatter ;
import java.util.Scanner ;

public class YU{
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy,dd,MM") ;
        Scanner sc = new Scanner(System.in) ;
        String givenDate = sc.next() ;
        LocalDate dateParsed = LocalDate.parse(givenDate, fmt) ;
        String filteredDate = dateParsed.getDayOfMonth() + "/" + 
        dateParsed.getMonth().getValue() + "/" + dateParsed.getYear() ;
        System.out.println(filteredDate) ;
    }
}