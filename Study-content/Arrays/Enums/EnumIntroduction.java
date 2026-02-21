//ONLY FOR EXPLAINATION->
//the enum is a class, and below is how it work internally
//note that each enum constant is an object
//this whole code is generated internally when enum is detected
// final class WeekDays extends :contentReference[oaicite:0]{index=0}<WeekDays> {

//     public static final WeekDays Monday = new WeekDays("Monday", 0);
//     public static final WeekDays Tuesday = new WeekDays("Tuesday", 1);
//     public static final WeekDays Wednesday = new WeekDays("Wednesday", 2);

//     public static WeekDays[] values() {
//         return new WeekDays[]{Monday, Tuesday, Wednesday};
//     }
//      the values return an array
// }

enum WeekDays{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday ;
}

public class EnumIntroduction{

    public static void main(String[]  args){
        WeekDays week= WeekDays.Monday ;
        //printing only single value
        System.out.println(week) ;
        //values() -> this returns all the values of the enum we defined
        System.out.println("Print out all the values-> ") ;
        //the code below runs for-each loop, we use WeekDays.values()
        for(WeekDays day : WeekDays.values()){
            System.out.println(day);
        }
        WeekDays[] arrOfDays= WeekDays.values() ;
        int n= arrOfDays.length ;
        for(int i=0;i<n;i++){
            System.out.println("Weekdays-> " + arrOfDays[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println("Weekdays-> " + arrOfDays[i] + " Value-> " + WeekDays.valueOf("Monday")) ;
        }
    }
}