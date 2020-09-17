package NumberThree.Models;

public class Car {
    private String plate;
    private Float price;

    public Car(String plate, Float price) {
        this.plate = plate;
        this.price = price;
    }

    public Car() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
