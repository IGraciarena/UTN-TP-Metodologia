package NumberFour;

import NumberFour.Builder.Director;
import NumberFour.Builder.PromotionArgentina;
import NumberFour.Builder.PromotionMercosur;
import NumberFour.Models.Promotion;

public class Main {
    public static void main(String[] args) {
//        4) Siguiendo con el ejemplo de la Cia. de Seguros para autos, se nos solicita poder armar una promoción
//        que esté compuesta por: el seguro contratado por el cliente + cuponera con 20% de descuento en cargas
//        de combustible hasta completar 500$ + alarma de regalo (sin costo de instalación). Esto es asi para los clientes de Argentina
//        en el 1er. trimestre de 2007, en cambio para los del Mercosur se mantendrán el 1er. semestre del 2007,
//        pero además de los items ya detallados, se deberá sumar un nuevo descto. del 50% en cambios de aceite (filtro incluído)
//        hasta completar los 200 $; y en la alarma, el costo de instalación va incluído.
//        Se debe tener en cuenta que estos regalos y/o bonificaciones pueden ir cambiando con el tiempo;
//        por lo que se propone que las promociones estén formadas por: Seguro + Regalo + Descuento.

        PromotionMercosur builderMercosur = new PromotionMercosur();
        PromotionArgentina builderArgentina = new PromotionArgentina();
        Director director = new Director(builderArgentina);
        director.build();
        Promotion promotion = builderArgentina.getResult();
        System.out.println(promotion.toString());
        director.changeBuilder(builderMercosur);
        director.build();
        Promotion promotion1 = builderMercosur.getResult();
        System.out.println(promotion1.toString());

    }
}
