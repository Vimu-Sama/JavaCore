
import java.util.ArrayList;
import java.util.Collections ;
import java.util.Comparator;
import java.util.List;

class Student{
    int regId ;
    String name ;

    public Student(int regId, String name){
        this.regId = regId ;
        this.name = name ;
    }

    @Override
    public String toString(){
        return "Registration Number-> " + regId + "\nStudent Name-> "+ name+ "\n------------------" ;
    }
}

public class eq2 {
    //Comparable
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() ;
        
        list.add(new Student(5, "Navjeet")) ;
        list.add(new Student(2, "Ram Patil")) ;
        list.add(new Student(1, "Prashant")) ;
        list.add(new Student(1, "Aditya Tanzal")) ;


        Comparator<Student> cmp = new Comparator<>(){
            public int compare(Student a, Student b){
                return a.regId - b.regId ;
            }
        };
        Collections.sort(list, cmp) ;

        for(var i : list){
            System.out.println(i) ;
        }
    }
}
