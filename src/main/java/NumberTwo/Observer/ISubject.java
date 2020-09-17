package NumberTwo.Observer;

import NumberTwo.Models.Client;

public interface ISubject {
    void notifyObservers();

    void removeObserver(Client c);

    void registerObserverByPhone(Client c);

    void registerObserverByEmail(Client c);
}
