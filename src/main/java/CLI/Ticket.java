package CLI;

public class Ticket {
    private int ticketId;
    private String ticketName;
    private int ticketprice;

    public Ticket(int ticketId, String ticketName, int ticketprice) {
        this.ticketId = ticketId;
        this.ticketName = ticketName;
        this.ticketprice = ticketprice;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }
    
}
