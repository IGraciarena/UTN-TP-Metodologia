package NumberOne.Decorador;

import NumberOne.Models.CPU;

public abstract class CPUDecorator extends CPU {
    private CPU cpu;

    public CPUDecorator(CPU cpu) {
        this.cpu = cpu;
    }

}
