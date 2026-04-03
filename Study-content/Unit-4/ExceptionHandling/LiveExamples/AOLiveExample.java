
class ExampleClass implements AutoCloseable{
    public void close(){
        System.out.println("Resource closed") ;
    }
}

class ExampleWrongClass{

}


class WrongValueException extends Exception{
    public WrongValueException(String message){
        super(message) ;
    }
}


public class AOLiveExample{
    public static void main(String[] args){
        try(ExampleClass wc = new ExampleClass()){
            
        }
        
    }

    public static void Check(int a, int b) throws Exception{
        System.out.println("Quotient-> " + a/b) ;
    }
}