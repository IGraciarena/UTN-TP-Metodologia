package NumberFive;

import NumberFive.Interface.ICar;
import NumberFive.Model.DVD;
import NumberFive.Model.EspecialWheel;
import NumberFive.Model.Sedan;

public class Main {
    public static void main(String[] args) {
//        5) En nuestra cia. de seguros deciden agregar un costo adicional en la prima por tipos de automovil
//        distintos de Sedan, para esto toman un coeficiente de 1 para el Sedan (prima sin adicional...), y
//        1.1 para camionetas (1.05 para rurales?).
//        A su vez si c/tipo de automovil tiene : DVD, GNC y/o Llantas especiales, se le recargarán los sig. adic.
//        respectivamente: 0,05, 0,15 y 0,03.

        ICar iCar = new Sedan("abc123",50000f);
        iCar = new DVD(iCar);
        iCar = new EspecialWheel(iCar);
        System.out.println(iCar.calculateTotal());

    }
}
