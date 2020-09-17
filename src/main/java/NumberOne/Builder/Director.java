package NumberOne.Builder;

public class Director {
//    private CPUBuilder cpuBuilder;

    public Director() {
//        this.cpuBuilder = cpuBuilder;
    }

    public void build(CPUBuilder cpuBuilder) {
        cpuBuilder.buildProcessor();
        cpuBuilder.buildMemoryRAM();
        cpuBuilder.buildPrice();
    }

//    public void changeBuilder(CPUBuilder cpuBuilder) {
//        this.cpuBuilder = cpuBuilder;
//    }

}
