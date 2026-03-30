

class PaymentSession{
    int amount=100 ;

    public PaymentSession(){
        System.out.println("Payment Session started");
    }

    public void VerifyDetails(){
        System.out.println("Verifies Selected Bank") ;
        System.out.println("Verifies the PIN entered") ;

        class Success{  //inner nested class
            public void DisplayStatus(){
                System.out.println("Status-> Success") ;
                amount = 100 ;
                System.out.println(amount);
            }
        }

        Success s = new Success() ;
        s.DisplayStatus();
    }

    

    class Failure{      //inner nested class
        public void DisplayStatus(){
            System.out.println("Status-> Failed");
        }
    }
}


public class LiveExampleEQG2 {
    public static void main(String[] args) {
        System.out.println("Scanned QR code") ;
        PaymentSession paymentSession= new PaymentSession() ;
        paymentSession.VerifyDetails();
        paymentSession = new PaymentSession() ;
        // s.DisplayStatus();
    }
}
