public enum Thing {
    apple(1000),
    banana(2000),
    tomato(3000);

    private int price;


    Thing(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
