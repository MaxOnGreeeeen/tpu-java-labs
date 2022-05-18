package tpu.labs.lab2MakerConsumer;

public class RunApplication {
    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Storage storage = new Storage(3);

        System.out.println(storage.getDescription());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer.produce(storage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer.consume(storage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
