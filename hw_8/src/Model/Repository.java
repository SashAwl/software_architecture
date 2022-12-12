package Model;

import Presenter.iModel;
import View.Area;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Repository - класс, содержащий методы для работы с базой данных; реализует интерфейс iModel
 * getTables(Date date, Integer seats, Time time, Boolean smoking, Area area) - запрашивает данные о столиках из источника данных
 * getStatusOccupationTable(Integer number, Date date, Time time) - проверяет, свободен ли
 * * данный столик в указанное время
 * getDataTable(Integer numberTable) - возвращает данные о конкретном столике
 * updateDB(Integer numberTable, Date date, Time time, Client client) - вносит данные о бронировании в БД
 */
public class Repository implements iModel {
    @Override
    public ArrayList<Table> getTables(Date date, Integer seats, Time time, Boolean smoking, Area area) throws Exception {
            ArrayList<Table> listItem = new ArrayList<Table>();
            if (listItem.isEmpty()) {
                throw new Exception("There are no free tables matching the filters");
            }
            return listItem;
        }

    @Override
    public Boolean getStatusOccupationTable(Integer number, Date date, Time time) {
        return true;
    }

    @Override
    public Table getDataTable(Integer numberTable) {
            return new Table();
        }

    public Boolean updateDB(Integer numberTable, Date date, Time time, Client client){
        return true;
    }
}
