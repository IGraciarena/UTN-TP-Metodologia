package NumberOne.Builder;

import NumberOne.Models.CPU;
import NumberOne.Models.CPUProfessional;
import NumberOne.Models.MemoryRAM;
import NumberOne.Models.Processor;

public class CPUProfesionalBuilder implements CPUBuilder {
    private CPU cpu;

    public CPUProfesionalBuilder() {
        cpu = new CPUProfessional();
    }

    public void buildPrice() {
        this.cpu.setPrice(4500f);
    }

    public void buildProcessor() {
        this.cpu.setProcessor(new Processor("AMD", "Athlon", "2.4Ghz", "6"));
    }

    public void buildMemoryRAM() {
        this.cpu.setMemoryRAM(new MemoryRAM("corsair", "rx6", "1gb", "ddr6"));
    }

    public CPU getResult(){
        return this.cpu;
    }
}
