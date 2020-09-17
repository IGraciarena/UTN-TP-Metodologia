package NumberFour.Models;

public class Discount {
    private Float value;
    private String description;

    public Discount(Float value, String description) {
        this.value = value;
        this.description = description;
    }

    public Discount() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "value=" + value +
                ", description='" + description + '\'' +
                '}';
    }
}
