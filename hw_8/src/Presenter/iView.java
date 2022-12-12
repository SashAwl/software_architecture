package Presenter;

import Model.Client;

/**
 * iView - интерфейс, позволяющий избежать зависимости более абстрактного класс Presenter
 * * от менее абстрактного класса View
 */
public interface iView {
    public Client inputDataClient();
    public Boolean confirmReserve();
}
