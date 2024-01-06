package org.example.concurthreadInc;

import org.example.concurthreadInc.Counter;

public class IncrementThread extends Thread {
    private Counter counter;
    private int increments;

    public IncrementThread(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }
}
