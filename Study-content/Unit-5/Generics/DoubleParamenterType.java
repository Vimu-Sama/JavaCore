class StoreTwoTypes<T, U>{
    T first ;
    U second ;

    public StoreTwoTypes(T first, U second){
        this.first = first ;
        this.second = second ;
    }

    public String getBothVars(){
        return "first-> " + first + "\nsecond-> " + second ;
    }
}

public class DoubleParamenterType {
    public static void main(String[] args) {
        StoreTwoTypes<Double, Character> st = new StoreTwoTypes<>(1.5, 'A') ;
        System.out.println(st.getBothVars()) ;
    }
}
