
import java.util.ArrayList ;
import java.util.Collections;
import java.util.List ;

class Student implements Comparable<Student>{
    int studentId ;
    String studentName ;

    public Student(int studentId, String studentName){
        this.studentId = studentId ;
        this.studentName = studentName ;
    }

    //notice how integer is used as a measure for checking if its smaller or larger than this
    // basically we are doing subtraction, there will be 3 cases:
    // 1) <0 --> current object member variable is smaller than the other object member variable
    // 2) ==0 --> current object member variable is equal to the other object member variable
    // 3) >0 --> current object member variable is greater than the other object member variable 
    @Override
    public int compareTo(Student other){
        return this.studentName.compareTo(other.studentName) ;
    }

    @Override
    public String toString(){
        return "Student Id-> " + this.studentId + "\nStudent Name-> " + this.studentName ;
    }
}

public class Example{
    public static void main(String[] args) {
        List<Student> ls= new ArrayList<>() ;
        ls.add(new Student(1230, "Chloe")) ;
        ls.add(new Student(1231, "Bryn")) ;
        ls.add(new Student(1001, "Alex")) ;
        ls.add(new Student(1008, "Jess")) ;
        Collections.sort(ls) ;
        for(var v: ls){
            System.out.println(v) ;
        }
    }
}