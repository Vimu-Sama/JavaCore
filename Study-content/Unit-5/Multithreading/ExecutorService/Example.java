import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            System.out.println("Task 1");
        });

        executor.submit(() -> {
            System.out.println("Task 2");
        });

        executor.shutdown();
    }
}