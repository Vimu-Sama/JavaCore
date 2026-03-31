//SAM- Single Abstract Method
//below is functional interface
interface Task{
    void start(); //only single abstract method allowed for functional interface
}

interface Task2{
    int sum(int a, int b) ;
}

interface  Task3{
    String concatenation(String a) ;
}

//if the interface has more that single abstract method, then it is not a functional interface
public class LamdaExpressionIntro {
    public static void main(String[] args){
        //lambda functions can be multi-line as well, but should be written properly inside code block
        
        //lambda function with no arguments
        Task t = () -> System.out.println("Hello World");
        t.start();


        //lambda function with two arguments
        int a = 10 ;
        int b= 20 ;
        Task2 t2 = (c,d) -> c+d ; //can also write Task2 t2 = (int c,int d) -> (c+d) ;
        int summed= t2.sum(a, b) ;
        System.out.println("Sum-> " + summed) ;
        
        
        //lambda function with single argument
        String s= "Hello " ;
        Task3 t3 = (p) -> p + "World!" ;
        String p = t3.concatenation(s) ;
        System.out.println("New String is-> " + p);
    }    
}
