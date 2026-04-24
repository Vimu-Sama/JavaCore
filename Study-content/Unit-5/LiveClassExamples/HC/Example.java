class PrintAllTypes<T extends Character>{
    T data ;
    public void Display(){
        System.out.println("displaying -> "+ data);
    }
}

public class Example{
    public static void main(String[] args) {
        PrintAllTypes<Integer> printAllIntegerObject= new PrintAllTypes<>() ;
        printAllIntegerObject.data= 95 ;
        printAllIntegerObject.Display();
        PrintAllTypes<Character> printAllTypes = new PrintAllTypes<>() ;
        printAllTypes.data= 'A' ;
        printAllTypes.Display();
    }
}