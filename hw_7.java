class PartsRequest{
    public String method;
    public String URL;
    public String versionHTTP;
    public String headersHTTP;
    public String bodyHTTP;
}

class ReportObject{
    public Date dataObject;
    public Integer volumObjectKb;
}

class JSON{
    public Integer length;
}

class Sender{
    public JSON convertJSON(ReportObject someReport){
        return new JSON();
    }

    public void send(JSON reportJSON){
        System.out.println("Report sent!");
    }
}

class Report{
    public ArrayList<Sales> getData(PartsRequest detailsRequest){
        return new iSales().getSales();
    }

    public PartsRequest transfomRequest(String request){
        return new PartsRequest();
    }

    public bildReport(ArrayList<Sales> list){
        System.out.println("Report successfully built!")
    }

    public void sendReport(ReportObject someReport){
        JSON reportJSON = new Sender.convertJSON(someReport);
        reportJSON.send();
    }
}

class Reader{
    public String request;

    public void getReport(){
        Report newReport = new Report();
        PartsRequest parts = newReport.transfomRequest(Reader.request);
        ArrayList<Sales> listSales = newReport.getData(parts);
        return newReport.bildReport(listSales);
    }
}

class Sales{
    public String product;
    public String provider;
    public Decimal purchase;
    public Integer countProduct;
    public DateTime dateTimeOperation;
    public Integer transactionNumber;
    public String salesman;
    public String adressShop;
    public String calculationMethod;
}

interface iSales{
    public ArrayList<Sales> getSales();
}

class Provider implementation iSales{
    public ArrayList<Sales> getSales(){
       return new ArrayList<Sales>
    }
}

