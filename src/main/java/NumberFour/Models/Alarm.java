package NumberFour.Models;

public class Alarm {
    private Float instalationCost;

    public Alarm(Float instalationCost) {
        this.instalationCost = instalationCost;
    }

    public Alarm() {
    }

    public Float getInstalationCost() {
        return instalationCost;
    }

    public void setInstalationCost(Float instalationCost) {
        this.instalationCost = instalationCost;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "instalationCost=" + instalationCost +
                '}';
    }
}
