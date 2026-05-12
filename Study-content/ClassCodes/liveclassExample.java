import java.util.* ;

class Employee implements Comparable<Employee>{
    int empId ;
    String name ;

    public int compareTo(Employee e){
        return this.empId - e.empId ;
    }

    public Employee(int empId, String name){
        this.empId = empId ;
        this.name = name ;
    }
}

public class liveclassExample{
    public static void main(String[] args){
        List<Employee> empList = new ArrayList<>() ;
        empList.add(new Employee(0, "A")) ;
        empList.add(new Employee(1, "B")) ;
        empList.add(new Employee(2, "A")) ;
    }
}