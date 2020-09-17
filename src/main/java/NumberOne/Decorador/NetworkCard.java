package NumberOne.Decorador;

import NumberOne.Models.CPU;

public class NetworkCard extends CPUDecorator {

    private String model;
    private String capacity;
    private String memory;

    public NetworkCard(CPU cpu) {
        super(cpu);

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

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String getComponents() {
        return super.getComponents()+
                "NetWorkCard: \n"+
                " "+getModel()+
                " "+getCapacity()+
                " "+getMemory();
    }

    @Override
    public Float getTotalPrice() {
        return super.getTotalPrice()+getPrice();
    }
}
