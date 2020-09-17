package NumberTwo.Models;

import NumberTwo.Observer.IObserver;
import NumberTwo.Observer.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Product implements ISubject {
    private String name;
    private Float price;
    private List<IObserver> iObservers;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
        iObservers = new ArrayList<IObserver>();
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void updatePrice(Float price) {
        setPrice(price);
        notifyObservers();
    }

    public void notifyObservers() {
        for (IObserver io : iObservers) {
            if (io instanceof Client) {
                if (((Client) io).getPhone()) {
                    io.updatePhone(this.name, this.price);
                }
                if (((Client) io).getMail()) {
                    io.updateEmail(this.name, this.price);
                }
            }
        }
    }

    public void removeObserver(Client c) {
        iObservers.remove(c);
    }

    public void registerObserverByPhone(Client c) {
        c.setIsPhone(true);
        if (!iObservers.contains(c)){
            iObservers.add(c);
        }
    }

    public void registerObserverByEmail(Client c) {
        c.setIsMail(true);
        if (!iObservers.contains(c)){
            iObservers.add(c);
        }
    }


}
