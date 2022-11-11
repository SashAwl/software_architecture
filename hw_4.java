import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
    }
}

/**
 * создаем сущность билет с набором атрибутов
 */
class Ticket
{
    public int rootNumber;
    public int place;
    public int price;
    public Date date;
    public boolean inValid;
}

/**
 * CashProvider - эл.кошелек покупателя
 * метод authorization() осуществляет авторизацию владельца
 * метод buy() производит оплату выбранного билета
 */
class CashProvider
{
    public long card;
    public boolean isAuthorization;

    public void buy(int price)
    {
        System.out.println("The purchase was successful!");
    }

    public void authorization(Customer customer)
    {
        this.isAuthorization = true;
    }
}

/** Customer - покупатель билета
 * метод searchTicket() осуществляет поиск подходящих билетов в БД перевозчика
 * метод buyTicket() инициализирует процесс покупки билета
 * *(авторизация в электронном кошельке, непосредственно оплата)
 */
class  Customer
{
    public int id;
    public ArrayList<Ticket>  ticket = new ArrayList<Ticket>();
    public CashProvider cash;

    public boolean buyTicket(Ticket ticket) throws Exception {

        cash = new CashProvider();
        cash.authorization(new Customer());

        if (!cash.isAuthorization) {
            throw new Exception("Error authorization");
        }
        cash.buy(ticket.price);

        new TicketProvider().updateTicketStatus(ticket);

        return true;
    }

    public ArrayList<Ticket> searchTicket(Date someDate, int someRootNumber) throws Exception {

        TicketProvider newSearch = new TicketProvider();
        ArrayList<Ticket> ticketList = newSearch.getTickets(someDate, someRootNumber);

        if (ticketList.isEmpty()) {
            throw new Exception("No tickets");
        }
        return ticketList;
    }
}

/**
 * TicketProvider - перевозчик
 * метод getTickets() запрашивает список билетов в БД перевозчика, удовлетворяющих заданным дате и номеру маршрута
 * метод updateTicketStatus() обновляет данные в БД первозчика о наличии билетов
 */
class TicketProvider
{
    public ArrayList<Ticket> getTickets(Date date, int rootNumber)
    {
        System.out.println("Search in database..");

        return new ArrayList<Ticket>();
    }

    public boolean updateTicketStatus(Ticket ticket)
    {
        System.out.println("Update data in database..");
        return true;
    }
}