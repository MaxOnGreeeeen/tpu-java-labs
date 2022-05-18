package tpu.labs.lab2MakerConsumer;

public class Product implements Description{
    private int productId;

    public Product(int id){
        this.productId = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String getDescription() {
        return "Product " + productId;
    }
}
