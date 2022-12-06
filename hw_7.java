import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 * PartsRequest - сущность, содержащая детали полученного HTTP-запроса
*/
class PartsRequest{
    public String method;
    public String URL;
    public String versionHTTP;
    public String headersHTTP;
    public String bodyHTTP;
}

/**
 * ReportObject - сущность сформированного отчета в исходном формате
 */
class ReportObject{
    public Date dateObject;
    public Integer volumObjectKb;
}

/**
 * JSON - сущность отчета, представленного в подготовленном для отправки формате
 */
class JSON{
    public Integer length;
}

/**
 * Sender - класс, содержащий методы для отправки данных в приложение
 * convertJSON(ReportObject someReport) - конвертирует отчет из исходного формата в формат JSON
 * send(JSON reportJSON) - осуществляет непосредственно отправку подготовленного отчета
 */
class Sender{
    public JSON convertJSON(ReportObject someReport){
        return new JSON();
    }

    public void send(JSON reportJSON){
        System.out.println("Report sent!");
    }
}

/**
 * iSend - интерфейс, позволяющий исключить зависимость более абстрактного класса Report
 * * от менее абстрактного класса Sender 
 */
interface iSend{
    public void send(JSON reportJSON);
}

/**
 * Report - класс, содержащий методы для формирования отчета
 * getData(PartsRequest detailsRequest) - запрашивает данные для формирования отчета у источника данных
 * transfomRequest(String request) - разбивает на содержательные части полученный HTTP-запрос
 * bildReport(ArrayList<Sales> list) - строит отчет по полученным с помощью метода getData() данным
 * sendReport(ReportObject someReport) - обращается к методам класса Sender для конвертации и отправки отчета
 */
class Report{
    public ArrayList<Sales> getData(PartsRequest detailsRequest){
        iSales isales = new Provider();
        return isales.getSales();
    }

    public PartsRequest transfomRequest(String request){
        return new PartsRequest();
    }

    public ReportObject bildReport(ArrayList<Sales> list){
        return new ReportObject();
    }

    public void sendReport(ReportObject someReport){
        iSend isend = new Sender();
        JSON reportJSON = isend.convertJSON(someReport);
        isend.send(reportJSON);
    }
}

/**
 * Reader - класс, отвечающий за инициализацию процесса сбора данных и формирования отчета
 * * по полученному HTTP-запросу
 * атрибут request содержит сам HTTP-запрос
 * getReport() - отвечает за всю цепочку методов по формированию отчета
 */
class Reader{
    public static String request;

    public void getReport(){
        Report newReport = new Report();
        PartsRequest parts = newReport.transfomRequest(Reader.request);
        ArrayList<Sales> listSales = newReport.getData(parts);
        ReportObject someReport = newReport.bildReport(listSales);
        newReport.sendReport(someReport);
    }
}

/**
 * Sales - сущность, содержащая информацию об одном факте продажи товара
 */
class Sales{
    public String product;
    public String provider;
    public Float purchase;
    public Integer countProduct;
    public Date dateTimeOperation;
    public Integer transactionNumber;
    public String salesman;
    public String adressShop;
    public String calculationMethod;
}

/**
 * iSales - интерфейс, позволяющий исключить зависимость более абстрактного класса Report
 * * от менее абстрактного класса Provider 
 */
interface iSales{
    public ArrayList<Sales> getSales();
}

/**
 * Provider - класс, отвечающий за подготовку данных из источника данных; реализует интерфейс iSales
 * getSales() - возвращает список продаж
 */
class Provider implements iSales{
    public ArrayList<Sales> getSales(){
        return new ArrayList<Sales>();
    }
}
