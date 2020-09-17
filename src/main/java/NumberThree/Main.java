package NumberThree;

import NumberThree.Interface.IPolicy;
import NumberThree.Models.Car;
import NumberThree.Models.MercosurPolicy;
import NumberThree.Models.ThridPartyPolicy;

public class Main {
    public static void main(String[] args) {

//        3) Una empresa de seguros del automotor posee 3 tipos de polizas para sus clientes: Terceros, Resp.Civil y TodoRiesgo.
//        En cada tipo se especifica el valor de la misma (Terc:0.10 – RC:0.06 – TR:0.20), que se calcula con la sig.
//        fórmula: (importe cotizado del auto  valor de poliza). Por ej.: (20.000$  0.10).
//        La empresa ofrecerá estas mismas pólizas fuera del país, inicialmente a los componentes del Mercosur,
//        a los cuales se les incorporará un % de recargo que será determinado cada mes por la empresa.
//        Por este motivo se nos solicitó se diseñe una solución a esta nueva problemática.


        Car c1 = new Car("abc123",50000f);
        Car c2 = new Car("cfg456",30500f);

        IPolicy iPolicy = new ThridPartyPolicy();
        System.out.println(iPolicy.calculatePolicy(c2));

        iPolicy = new MercosurPolicy(0.1f,iPolicy);
        System.out.println(iPolicy.calculatePolicy(c2));
    }
}
