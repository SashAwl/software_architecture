package View;

import Model.Client;
import Presenter.Presenter;
import Presenter.iView;
import java.sql.Time;
import java.util.Date;

/**
 * View - класс, содержащий методы для работы свнешней частью приложения, для взаимодействия с клиентом
 * selectTables(Date date, Time time, Integer seats, Boolean smoking, Area area) - инициализирует процесс
 * * подбора столиков, удовлетворяющих заданным критериям
 * isTableFree(Integer numberTable, Date date, Time time) - предоставляет клиету информацию о занятости столика
 * infOfTable(Integer numberTable) - предоставляет клиету подробную информацию о выбранном столике
 * reserveTable(Integer numberTable,Date date, Time time) - инициализирует процесс бронирования столика
 * inputDataClient() - запрашивает личные данные для бронирования у клиента
 * confirmReserve() - запрашивает подтверждение о бронировании у клиента
 */
public class View implements iView {

    public void selectTables(Date date, Time time, Integer seats, Boolean smoking, Area area) throws Exception {
        Presenter presenterItem = new Presenter();
        presenterItem.getData(date, seats, time, smoking, area);
    }

    public Boolean isTableFree(Integer numberTable, Date date, Time time) {
        Presenter presenterItem = new Presenter();
        return !(presenterItem.isBusyTable(numberTable, date, time));
    }

    public void infOfTable(Integer numberTable){
        Presenter presenterItem = new Presenter();
        presenterItem.getDetailsTable(numberTable);
    }

    public void reserveTable(Integer numberTable,Date date, Time time) throws Exception {
        Presenter presenterItem = new Presenter();
        Boolean reserveItem = presenterItem.setReserve(numberTable,date, time);

        System.out.println("Table reservation was successful");
    }

    public Client inputDataClient(){
        return new Client();
    }

    public Boolean confirmReserve(){
        System.out.println("Confirmation received");
        return true;
    }
}
