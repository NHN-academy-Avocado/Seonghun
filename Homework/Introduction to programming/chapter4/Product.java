public class Product {
    private String productName;
    private int count = 0;

    public Product(String string) {
        this.productName = string;
    }

    public void downLoad(int n) {
        this.count += n;
    }

    public void upLoad(int n) {
        this.count -= n;
    }

    @Override
    public String toString() {
        return this.productName + ", " + this.count + "개";
    }
    
}
