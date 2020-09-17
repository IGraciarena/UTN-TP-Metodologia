package NumberOne.Builder;

import NumberOne.Models.CPU;
import NumberOne.Models.CPUPlan1;
import NumberOne.Models.MemoryRAM;
import NumberOne.Models.Processor;

public class CPUPlan1Builder implements CPUBuilder {

    private CPU cpu;

    public CPUPlan1Builder() {
        cpu = new CPUPlan1();
    }

    public void buildPrice() {
        this.cpu.setPrice(1500f);
    }

    public void buildProcessor() {
        this.cpu.setProcessor(new Processor("Celeron de 1.5Ghz", "32bits", "4mb", "2"));
    }

    public void buildMemoryRAM() {
        this.cpu.setMemoryRAM(new MemoryRAM("corsair", "rx3", "128mb", "ddr3"));
    }

    public CPU getResult() {
        return this.cpu;
    }
}
