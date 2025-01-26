package CONCURRENCY;

import java.util.concurrent.atomic.AtomicInteger;

public class NonBlockingCounter {
    private AtomicInteger value = new AtomicInteger();

    public int getValue() {
        return this.value.get();
    }

    public int increment() {
        return this.value.incrementAndGet();
    }

    public int incrementLongVersion() {
        int oldValue = this.value.get();
        while (!this.value.compareAndSet(oldValue, oldValue + 1)) {
            oldValue = value.get();
        }
        return oldValue + 1;
    }
}
