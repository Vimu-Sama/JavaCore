public class Assertion {
    public static void main(String[] args) {
        int age=18 ;
        System.out.println("before assert") ; 
        assert (age>=18): "Age should be greater than 18" ;    //only executes when condition is false
        System.out.println("after assert") ; 
    }
}

//run in terminal
//command-> javac Assertion.java
//command-> java -ea Assertion [instead of java Assertion]