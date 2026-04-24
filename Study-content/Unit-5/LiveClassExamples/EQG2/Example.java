class PrintDetails<T>{
    T data1 ;
    T data2 ;

    public PrintDetails(T data1, T data2){
        this.data1 = data1 ;
        this.data2 = data2 ;
    }

    public void DisplayData(){
        System.out.println("Display-> \n"+ data1 + "\n" + data2) ;
    }
}

public class Example{
    public static void main(String[] args) {
        PrintDetails<Integer> printData = new PrintDetails<>(10,20) ;
        PrintDetails<String> mohitPradhan = new PrintDetails<>("O+", "O-") ;
        mohitPradhan.DisplayData() ;
        printData.DisplayData() ;
    }
}