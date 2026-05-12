
import java.util.ArrayList;
import java.util.Collections;
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
        return "regId-> " + regId + "\nName-> " + name  + "\n------------";
    }
}

public class hc {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() ;
        list.add(new Student(3, "Satyam") );
        list.add(new Student(1, "Badal") ) ;
        list.add(new Student(4, "Sajjad") );
        list.add(new Student(2, "Ahmed") );
        Collections.sort(list, (a, b)-> a.name.compareTo(b.name)) ;
        for(Student i: list){
            System.out.println(i) ;
        }
    }    
}
