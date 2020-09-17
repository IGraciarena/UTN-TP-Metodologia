package NumberFive.Model;

public class Sedan extends Car {

    public Sedan(String plate, Float price) {
        super(plate, price,0f);
    }

    public Float calculateAditional(Float price) {
        return price + 0f;
    }

    public Float calculateTotal() {
        return this.getPrice()+ calculateAditional(this.getPrice());
    }
}
