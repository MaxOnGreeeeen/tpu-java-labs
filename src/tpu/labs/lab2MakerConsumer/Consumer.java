package tpu.labs.lab2MakerConsumer;

public class Consumer {
    public void consume(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLock()) {
                while (storage.getStorage().size() == 0) {
                    storage.getLock().wait();
                }
                Product product = storage.getStorage().poll();

                System.out.println("Продукт " + product.getProductId() + " взят со склада");
                System.out.println("Количество продуктов в хранилище: " + storage.getStorage().size());

                storage.getLock().notify();
            }
            Thread.sleep(1000);
        }
    }
}
