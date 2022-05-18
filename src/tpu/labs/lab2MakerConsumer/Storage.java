package tpu.labs.lab2MakerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Storage implements Description{
    private Queue<Product> storage = new LinkedList();

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    private int storageCapacity;
    private Object lock = new Object();

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    public Queue<Product> getStorage() {
        return storage;
    }

    public void setStorage(Queue<Product> storage) {
        this.storage = storage;
    }

    public Storage(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String getDescription() {
        return "Storage capacity " + storageCapacity;
    }
}
