package com.oop.cw.Backend.Repo;

import com.oop.cw.Backend.Model.TicketPool;
import com.oop.cw.Backend.Model.Tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketPoolRepo extends JpaRepository<Ticket, Integer> {
    void save(TicketPool ticketPool);
}
