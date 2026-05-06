import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int studentId ;
    String studentName ;

    public Student(int id, String name){
        studentId = id ;
        studentName = name ;
    }

    @Override
    public String toString(){
        return "Student Id-> " + this.studentId + "\nStudent Name-> " + this.studentName ;
    }
}

public class Example2{
    public static void main(String[] args) {
        List<Student> ls= new ArrayList<>() ;
        ls.add(new Student(1230, "Chloe")) ;
        ls.add(new Student(1231, "Bryn")) ;
        ls.add(new Student(1001, "Alex")) ;
        ls.add(new Student(1008, "Jess")) ;
        Collections.sort(ls, (a, b)-> a.studentId - b.studentId) ;
        for(var v: ls){
            System.out.println(v) ;
        }
    }
}