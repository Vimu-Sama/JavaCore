
class PaymentSession {
    public int amount = 100;
    
    public PaymentSession() {
        System.out.println("Payment Session started");
    }

    public void VerifyDetails(String s, int pin) {
        int temp = 10 ;
        class Success { // local inner nested class
            public void DisplayStatus() {
                System.out.println("Status-> Success");
                amount =200;
                System.out.println(amount);
                System.out.println(temp) ;
            }
        }

        class Failure { // local inner nested class
            public void DisplayStatus() {
                System.out.println("Status-> Failed");
            }
        }

        if(s.equals("Madhurya Bank") && pin==123456){
            Success success= new Success() ;
            success.DisplayStatus();
        } else {
            Failure failure = new Failure() ;
            failure.DisplayStatus();
        }

    }

}

public class LiveExampleEQG2 {
    public static void main(String[] args) {
        System.out.println("Scanned QR code");
        PaymentSession paymentSession= new PaymentSession() ;
        paymentSession.VerifyDetails("Madhurya", 123456);
    }
}
