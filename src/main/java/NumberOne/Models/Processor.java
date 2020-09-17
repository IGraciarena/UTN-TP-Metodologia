package NumberOne.Models;

public class Processor extends Component {

    private String coresNumber;

    public Processor(String nombre, String modelo, String capacidad, String coresNumber) {
        super(nombre, modelo, capacidad);
        this.coresNumber = coresNumber;
    }

    public String getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(String coresNumber) {
        this.coresNumber = coresNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "coresNumber: " + coresNumber + " }" + "\n";
    }
}
