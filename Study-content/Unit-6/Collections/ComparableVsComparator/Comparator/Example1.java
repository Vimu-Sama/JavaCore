
import java.util.ArrayList ;
import java.util.Collections;
import java.util.Comparator;
import java.util.List ;

class Student implements Comparator<Student>{
    int studentId ;
    String studentName ;

    public Student(int studentId, String studentName){
        this.studentId = studentId ;
        this.studentName = studentName ;
    }

    @Override
    public int compare(Student A, Student B){
        return A.studentId - B.studentId ;
    }

    @Override
    public String toString(){
        return "Student Id-> " + this.studentId + "\nStudent Name-> " + this.studentName ;
    }
}

public class Example1{
    public static void main(String[] args) {
        List<Student> ls= new ArrayList<>() ;
        ls.add(new Student(1230, "Chloe")) ;
        ls.add(new Student(1231, "Bryn")) ;
        ls.add(new Student(1001, "Alex")) ;
        ls.add(new Student(1008, "Jess")) ;
        Collections.sort(ls, (a, b)-> {
            return a.studentId - b.studentId ;
        }) ;
        for(var v: ls){
            System.out.println(v) ;
        }
    }
}