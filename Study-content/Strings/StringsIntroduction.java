package Strings;

public class StringsIntroduction {
        public static void main(String[] args){
            //Constructors of String Class
            //Strings has two ways- Using Literal or Using Constructor
            
            //Literal
            String example1= "Hello" ;

            //Using Constructor also has multiple approaches-
            //1)- Using new KeyWord
            String emptyExample = new String() ; //creates empty string
            String example2 = new String("Hello") ;

            //2)- Using arr to make it into String
            char[] arr= { 'H', 'e', 'l', 'l', 'o' } ;
            String example3 = new String(arr) ;
            System.out.println("Output of array to String--> " + example3) ;

            //3- From Byte array
            byte[] byteArray = {72,101,108,108,111};
            String s = new String(byteArray);



            //Methods of String

            //1-length()
            int n=  s.length() ;    


            //2- charAt()
            char ch = example3.charAt(2) ; //can be used for loop traversal

            //3- concat()
            String a= "Hello Good Sir! " ;
            String b= "How are you?" ;
            System.out.println("Concatenation-> ") ;
            System.out.println(a.concat(b)) ;
            System.out.println(b.concat(a)) ;

            
        }
}
