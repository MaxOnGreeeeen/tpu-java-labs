package tpu.labs.lab2MakerConsumer;

public class Producer {
    public void produce(Storage storage) throws InterruptedException {
        int productId = 0;

        while (true) {
            synchronized (storage.getLock()) {
                while (storage.getStorage().size() == storage.getStorageCapacity()) {
                    storage.getLock().wait();
                }

                Product product = new Product(productId);

                storage.getStorage().offer(product);
                System.out.println("Произведен продукт: " + product.getProductId());

                productId++;

                storage.getLock().notify();
            }

        }
    }
}
