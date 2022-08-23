package codewars.kyu7.execute_me_nTimes;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void SampleTests() {

        Worker w = new Worker();
        Random rand = new Random();
        int counter = rand.nextInt(300) + 200;
        // task takes between 10 and 14 seconds to complete
        int n = 10000 + rand.nextInt(4000);
        AtomicInteger executionCounter = new AtomicInteger();

        Runnable action = () -> {

            try {

                Thread.sleep(n);
                executionCounter.incrementAndGet();

            } catch (InterruptedException ex) {
                // do not crash, but do not count
            }
        };
        w.execute(action, counter);

        int actualCounter = executionCounter.get();
        if (counter != actualCounter)
            System.out.println("Aciton was executed " + actualCounter + " times instead of " + counter + " times");

        assertEquals(counter, actualCounter);
    }
}
