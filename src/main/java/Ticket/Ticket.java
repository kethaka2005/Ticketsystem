package Ticket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    //Default constructor//
    public Ticket() {}

    public void Ticket(){
        this.ticketId=ticketId;

    }
    // Getter for ticketId
    public int getTicketId() {
        return ticketId;
    }

    // Setter for ticketId
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

}
