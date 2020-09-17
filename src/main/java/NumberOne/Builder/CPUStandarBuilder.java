package NumberOne.Builder;

import NumberOne.Models.CPU;
import NumberOne.Models.CPUStandar;
import NumberOne.Models.MemoryRAM;
import NumberOne.Models.Processor;

public class CPUStandarBuilder implements CPUBuilder {

    private CPU cpu;

    public CPUStandarBuilder() {
       this.cpu = new CPUStandar();
    }

    public void buildPrice() {
        this.cpu.setPrice(2500f);
    }

    public void buildProcessor(){
        this.cpu.setProcessor(new Processor("AMD", "Sempron", "1.8Ghz", "4"));
    }

    public void buildMemoryRAM() {
        this.cpu.setMemoryRAM(new MemoryRAM("corsair", "rx4", "512Mb", "ddr4"));
    }

    public CPU getResult(){
        return this.cpu;
    }
}
