package Presenter;

import Model.Client;
import Model.Table;
import View.Area;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


/**
 * iModel - интерфейс, позволяющий избежать зависимости более абстрактного класс Presenter
 * * от менее абстрактного класса Repository
 */
public interface iModel {

    ArrayList<Table> getTables(Date date, Integer seats, Time time, Boolean smoking, Area area) throws Exception;

    public Boolean getStatusOccupationTable(Integer number, Date date, Time time);

    public Table getDataTable(Integer numberTable);

    public Boolean updateDB(Integer numberTable, Date date, Time time, Client client);
}
