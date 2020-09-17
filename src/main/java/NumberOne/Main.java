package NumberOne;

import NumberOne.Builder.CPUProfesionalBuilder;
import NumberOne.Builder.CPUStandarBuilder;
import NumberOne.Builder.Director;
import NumberOne.Models.CPU;

public class Main {
    public static void main(String[] args) {
//        1) Un comercio de venta de hard, ofrece sus CPU (formadas por procesador y memoria) en 3 distintas configuraciones:
//              ●	Plan 1 Hogar-1 Pc: Proc.: Celeron de 1.5 Ghz. y 32 bits + 128 mb. memoria
//              ●	Standard: Proc.: AMD Sempron 3000 de 1.8 Ghz. y 32 bits + 512 mb. memoria
//              ●	Profesional: Proc.: AMD Athlon 64 FX de 2.4 Ghz y 64 bits + 1 Gb. Memoria
//        Los precios de venta ascienden a : 500, 800 y 1200 $ respectivamente.
//
//        Además se pueden agregar a cualquiera de las config. los sig. elementos adicionales:
//        f)	Placa de red inalámbrica de 54 o 108 mbps, precio: 45 y 80 $ respect.
//        g)	Placa de video GeForce de 256 o 512 Mb., precio: 70 y 110 $ respect.
//        (* Pueden agregarse más elementos adic. a las configuraciones.)
//
//        Debe poder solicitarle al objeto CPU su precio de acuerdo a su config. y el monto extra por adicionales.
//
//        Aplicando el/los patrones Gof que considere necesarios:  Diseñar la solución en un diag. de clases e implementar
//        en una clase cliente que consuma ese diseño para la compra de una CPU standard con una placa de red de 54 mbps.
//        y placa de video de 512 Mb. mostrando su precio total y discriminado el precio por adicionales.

        CPUStandarBuilder cpuStandarBuilder = new CPUStandarBuilder();
        Director director = new Director();
        director.build(cpuStandarBuilder);
        CPU result = cpuStandarBuilder.getResult();
        System.out.println(result.toString());

        CPUProfesionalBuilder cpuProfesionalBuilder = new CPUProfesionalBuilder();
//        director.changeBuilder(cpuProfesionalBuilder);
        director.build(cpuProfesionalBuilder);
        CPU result1 = cpuProfesionalBuilder.getResult();
        System.out.println(result1.toString());



    }
}
