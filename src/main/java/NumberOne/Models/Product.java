package NumberOne.Models;

public abstract class Product {
    private Float price;
    private Float extras;

    public Product() {
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getExtras() {
        return extras;
    }

    public void setExtras(Float extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return  "[ Price: " + price +
                "\t Extras: " + extras+" ]"+"\n";
    }
}
