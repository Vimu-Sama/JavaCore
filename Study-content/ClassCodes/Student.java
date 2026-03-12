public class Student {
    int studentId ;
    String name ;
    
    public Student(int studentId, String name){
        this.studentId = studentId ;
        this.name = name ;
    }

    public boolean equals(Student s){
        return s.name.equals(this.name) && (s.studentId == this.studentId) ;
    }

    public String toString(){
        return "Student Id-> " + studentId + "\nStudent name-> " + name ;
    }

    public int hashCode(){
        return studentId ;
    }

    public static void main(String[] args){
        Student s = new Student(1, "Siddharth");
        Student t= new Student(4, "Siddharth");
        System.out.println(s.equals(t)) ;
    }
}
