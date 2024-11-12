package com.cw.Ticketsystem;

import Ticket.Ticket;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class TicketPool {
    @OneToMany(mappedBy = "TicketPool" ,cascade = CascadeType.ALL)
    private List<Ticket> tickets;
}
