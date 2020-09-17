package NumberOne.Models;

public class MemoryRAM extends Component {
    private String type;

    public MemoryRAM(String name, String model, String capacity, String type) {
        super(name, model, capacity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Type: " + type + " }" + "\n";
    }
}
