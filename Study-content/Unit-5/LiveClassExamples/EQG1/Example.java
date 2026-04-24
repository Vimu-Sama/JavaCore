



class PrintData<T extends Number>{
    T element1 ;
    T element2 ;

    public PrintData(T element1, T element2){
        this.element1 = element1 ;
        this.element2 = element2 ;
    }

    public String toString(){
        return "First Element-> " + element1 + "\nSecond Element-> "+ element2 ;
    }
}

public class Example{
    public static void main(String[] args) {
        PrintData<Integer> printDataObject = new PrintData<>(1, 2) ;
        System.out.println("Print data integer-> " + printDataObject) ;
        PrintData<Character> printChars = new PrintData<>('a', 'b') ;
        System.out.println("Print data integer-> " + printChars) ;
    }
}