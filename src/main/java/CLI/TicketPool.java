package CLI;

import Ticket.Ticket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketPool {
    private int NoOfTickets;
    List<Ticket> tickets= Collections.synchronizedList(new ArrayList<>());
    public TicketPool() {
        this.tickets = tickets;
        this.NoOfTickets=NoOfTickets;
    }

    public List <Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getNoOfTickets() {
        return NoOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        NoOfTickets = noOfTickets;
    }

    public synchronized void addToTicketPool(Ticket ticket){
      tickets.add(ticket);
    }
    public synchronized void removeTicket(){
        tickets.removeFirst();
    }
}
