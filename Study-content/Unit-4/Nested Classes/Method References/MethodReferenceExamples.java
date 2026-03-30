interface funInterface{
    int giveAbsolute(int a) ;
}

public class MethodReferenceExamples {
    public static void main(String[] args) {
        funInterface f= b -> Math.abs(b) ;
        System.out.println(f.giveAbsolute(-25));
        funInterface m= Math::abs ;
        System.out.println(m.giveAbsolute(-100)) ;
    }
}
