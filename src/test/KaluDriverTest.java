package test;

import driver.KaluDriver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KaluDriverTest {

    public static void main(String[] args) {
        testSingletonBehaviorUnderMultithreading();
        testDriveMethod();
    }

    private static void testSingletonBehaviorUnderMultithreading() {
        int threadCount = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        Runnable task = () -> {
            KaluDriver driver = KaluDriver.getKaluDriver();
            System.out.println("Instance: " + driver + " | HashCode: " + driver.hashCode());
        };

        // Submit multiple tasks to the thread pool
        for (int i = 0; i < threadCount; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
    }

    private static void testDriveMethod() {
        KaluDriver driver = KaluDriver.getKaluDriver();
        String driveResponse = driver.drive();
        System.out.println("Drive Response: " + driveResponse);
    }
}
