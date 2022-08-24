package codewars.kyu7.execute_me_nTimes;

import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker {

    public void execute(Runnable action, int nTimes) {
        ExecutorService executor = Executors.newFixedThreadPool(nTimes);
        try {
            executor.invokeAll(Collections.nCopies(nTimes, Executors.callable(action)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

