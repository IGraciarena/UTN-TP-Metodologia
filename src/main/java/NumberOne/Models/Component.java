package NumberOne.Models;

public abstract class Component {
    private String name;
    private String model;
    private String capacity;

    public Component(String name, String model, String capacity) {
        this.name = name;
        this.model = model;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Model: " + model + "\n" +
                "Capacity: " + capacity + "\n";
    }
}
