package Presenter;

import Model.Client;
import Model.Repository;
import Model.Table;
import View.Area;
import View.View;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Presenter - класс, содержащий методы, отвечающие за логику приложения
 * getData(Date date, Integer seats, Time time, Boolean smoking, Area area) возвращает список столиков,
 * * удовлетворяющих заданным условиям
 * isBusyTable(Integer numberTable, Date date, Time time) - запрашивает данные о стлике и
 * * возвращает True, если столик занят, и False, если столик свободен
 * getDetailsTable(Integer numberTable) - возвращает данные о конкретном столике
 * setReserve(Integer numberTable, Date date, Time time) - отвечает за бронирование столика - проверяет,
 * * свободен ли выбранный столик, запрашивает данные клиентаи подтверждение брони
 * getDataClient() - запрашивает данные о клиенте
 * getConfirmReserve() - запрашивает подтверждение брони
 */
public class Presenter {
    public ArrayList<Table> getData(Date date, Integer seats, Time time, Boolean smoking, Area area) throws Exception {
        iModel imodel = new Repository();
        return ((Repository) imodel).getTables(date, seats, time, smoking, area);
    }

    public Boolean isBusyTable(Integer numberTable, Date date, Time time){
        iModel imodel = new Repository();
        return ((Repository) imodel).getStatusOccupationTable(numberTable, date, time);
    }

    public Table getDetailsTable(Integer numberTable){
        iModel imodel = new Repository();
        return ((Repository) imodel).getDataTable(numberTable);
    }

    public Boolean setReserve(Integer numberTable, Date date, Time time) throws Exception{
        Presenter presenterItem = new Presenter();
        Boolean realStatus = presenterItem.isBusyTable(numberTable, date, time);

        if (realStatus) {
           throw new Exception("The table is busy. Choose another.");
        }

        Client clientItem = presenterItem.getDataClient();
        Boolean confirmItem = presenterItem.getConfirmReserve();

        if (!confirmItem) {
            throw new Exception("You canceled the reservation");
        }

        iModel imodel = new Repository();
        return ((Repository) imodel).updateDB(numberTable, date, time, clientItem);
    }

    public Client getDataClient(){
        iView iview = new View();
        return iview.inputDataClient();
    }

    public Boolean getConfirmReserve(){
        iView iview = new View();
        return iview.confirmReserve();
    }
}
