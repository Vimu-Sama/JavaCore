class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Example {
    public static void main(String[] args) {
        try {
            throw new CustomException("Error custom");
        } catch (Exception e) {
            System.out.println("Exception-> " + e);
        } finally{
            System.out.println("Code execution ended") ;
        }
    }
}
