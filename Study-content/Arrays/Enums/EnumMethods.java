enum Payment{
    Pending,
    Accepted
}

public class EnumMethods {
    public static void main(String[] args){
        Payment payment= Payment.Accepted ;

        //values()
        Payment[] paymentArray = Payment.values() ;
        for(Payment paymentIterator : paymentArray){
            System.out.println("payment value-> " + paymentIterator) ;
        }
        System.out.println("\n\n------valueOf()------");
        //valueOf()- if we want to convert from String to Enum
        Payment findValueOfPayment = Payment.valueOf("Accepted") ;
        System.out.println("Value is-> " + findValueOfPayment) ;
        System.out.println("\n\n------ordinal()------");
        //ordinal()
        System.out.println("Index or Ordinal of Pending is " + Payment.Pending.ordinal());
        System.out.println("Index or Ordinal of Accepted is " + Payment.Accepted.ordinal());
        System.out.println("\n\n------name()------");
        //name()
        System.out.println("Name of the payment-> " + findValueOfPayment.name()) ;
        System.out.println("\n\n------compareTo()------");
        //compareTo() --> basically the (caller enum index) - (parameter enum index)
        System.out.println("Compare to when Payment.Pending called Payment.Accepted -> " + Payment.Pending.compareTo(Payment.Accepted)) ; 
        System.out.println("Compare to when Payment.Pending called Payment.Pending  -> " + Payment.Pending.compareTo(Payment.Pending))  ;
        System.out.println("Compare to when Payment.Accepted called Payment.Pending -> " + Payment.Accepted.compareTo(Payment.Pending)) ;
        System.out.println("Compare to when Payment.Accepted called Payment.Accepted- > " + Payment.Accepted.compareTo(Payment.Accepted)) ;
        System.out.println("---------------------\n\n");
    }    
}
