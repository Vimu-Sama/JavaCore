class PrintNumsOnly<T extends Number> {
    T num1;
    T num2;

    public PrintNumsOnly(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void Display(){
        System.out.println("First Number-> " + num1) ;
        System.out.println("Second Number-> " + num2) ;
    } 
}

public class Example {
    public static void main(String[] args) {
        PrintNumsOnly<Double> numsDouble = new PrintNumsOnly<>(10.0, 12.0);
        PrintNumsOnly<Integer> numsInteger = new PrintNumsOnly<>(2,5) ;
        numsDouble.Display();
        numsInteger.Display();
    }
}
