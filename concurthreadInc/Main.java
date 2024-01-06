package org.example.concurthreadInc;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numofThread = 5;
        int incrementPerThread = 1000;
        IncrementThread[] threads = new IncrementThread[numofThread];

        // Create and start the threads
        for (int i = 0; i < numofThread; i++) {
            threads[i] = new IncrementThread(counter, incrementPerThread);
            threads[i].start();
        }
        // Wait for all threads to finish
        try {
            for (IncrementThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
