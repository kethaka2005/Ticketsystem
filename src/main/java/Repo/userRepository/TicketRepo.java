package com.oop.cw.Backend.Repo;

import com.oop.cw.Backend.Model.Tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {
    Ticket findFirstTicketByVendor_VendorIdAndEvent_eventIDAndTicketType(int vendorId, int eventID, String ticketType);

    Ticket findFirstTicketByVendor_VendorIdAndEvent_eventIDAndTicketTypeAndCustomerIsNull(int vendorId, int eventID, String ticketType);

    List<Ticket> findAllByTicketPool_ticketPoolId(int ticketPoolID);
}
