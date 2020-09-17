package NumberTwo;

import NumberTwo.Models.Client;
import NumberTwo.Models.Product;

public class Main {
    public static void main(String[] args) {
        // 2) En un sitio de subastas: cada vez que se oferte por un artículo un precio mayor al actual
        // (partiendo de un mínimo), se debe notificar a las personas que se registraron en su subasta.
        // A los que se suscribieron por celular se les mostrará solo el precio, y si suscribieron por
        // email podrán tener tambien fecha y hora exacta de la actualización.

        Product p1 = new Product("Alfajor",50f);

        Client c1 = new Client("Ivan","Graciarena","2235765132","ivangraciarena@gmail.com");
        Client c2 = new Client("Jorge","villordo","2234523423","villordo@gmail.com");
        Client c3 = new Client("Juan","Perez","213213421","juanp@gmail.com");

        p1.registerObserverByEmail(c1);
        p1.registerObserverByPhone(c2);
        p1.registerObserverByPhone(c3);
        p1.registerObserverByEmail(c3);
        p1.updatePrice(60f);


    }
}
