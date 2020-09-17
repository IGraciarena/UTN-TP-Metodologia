package NumberOne.Decorador;

import NumberOne.Models.CPU;

public class VideoCard extends CPUDecorator {

    public VideoCard(CPU cpu) {
        super(cpu);
    }
}
