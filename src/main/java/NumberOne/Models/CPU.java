package NumberOne.Models;

public abstract class CPU extends Product {
    private MemoryRAM memoryRAM;
    private Processor processor;

    public CPU(MemoryRAM memoryRAM, Processor processor) {
        this.memoryRAM = memoryRAM;
        this.processor = processor;
    }

    public CPU() {

    }

    public MemoryRAM getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(MemoryRAM memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Float getTotalPrice(){
        return getPrice();
    }

    public String getComponents(){
        return getMemoryRAM().toString()+getProcessor().toString();
    }

    @Override
    public String toString() {
        return super.toString()
                + "{ " + "RAM: \n" + memoryRAM
                + "{ " + "Processor: \n" + processor
                + "\n";
    }
}
