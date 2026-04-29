import java.util.* ;

public class Example{

    public static void Print(List<?> list){
        for(int i=0 ;i< list.size(); i++){
            System.out.println(list.get(i)) ;
        }
    }
    public static void main(String[] args) {
        List<String> name = new ArrayList<>() ;
        name.add("Mohit") ;
        name.add("Tanaka") ;
        name.add("Kartik") ;
        name.add("Abhiudhay") ;
        name.add("Ayush") ;
        name.add("Kadeeja") ;
        Print(name);

        List<Integer> ageList= new ArrayList<>();
        ageList.add(20) ;
        ageList.add(20) ;
        ageList.add(20) ;
        Print(ageList);
    }
}