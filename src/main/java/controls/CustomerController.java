package com.oop.cw.Backend.Controller.UsersComtroller;

import com.oop.cw.Backend.Model.Tickets.TicketRequest;
import com.oop.cw.Backend.Repo.EventRepo;
import com.oop.cw.Backend.Repo.TicketPoolRepo;
import com.oop.cw.Backend.Repo.TicketRepo;
import com.oop.cw.Backend.Repo.UsersRepository.CustomerRepo;
import com.oop.cw.Backend.Repo.UsersRepository.VendorRepo;
import com.oop.cw.Backend.Service.Response;
import com.oop.cw.Backend.Service.UserService.CustomerService;
import com.oop.cw.Backend.Model.Users.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticketsystem/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController implements com.oop.cw.Backend.Controller.UsersComtroller.UserController {

    private final CustomerRepo customerRepo;
    private final EventRepo eventRepo;
    private final VendorRepo vendorRepo;
    private final TicketRepo ticketRepo;
    private final TicketPoolRepo ticketPoolRepo;

    @Autowired
    public CustomerController(CustomerRepo customerRepo, EventRepo eventRepo, VendorRepo vendorRepo, TicketRepo ticketRepo, TicketPoolRepo ticketPoolRepo) {
        this.customerRepo = customerRepo;
        this.eventRepo = eventRepo;
        this.vendorRepo = vendorRepo;
        this.ticketRepo = ticketRepo;
        this.ticketPoolRepo = ticketPoolRepo;
    }

    @PostMapping("/register")
    @Override
    public Response register(@RequestBody UserCredentials userCredentials) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("register");
        customerService.setUserCredentials(userCredentials);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.register(userCredentials);
    }
    @PostMapping("/login")
    @Override
    public Response login(@RequestBody UserCredentials userCredentials) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("login");
        customerService.setUserCredentials(userCredentials);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.login(userCredentials);
    }

    @PostMapping("/changepassword")
    @Override
    public Response changePassword(@RequestBody UserCredentials userCredentials) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("changePassword");
        customerService.setUserCredentials(userCredentials);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.changePassword(userCredentials);
    }

    @PostMapping("/deleteaccount")
    @Override
    public Response deleteAccount(@RequestBody UserCredentials userCredentials) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("deleteAccount");
        customerService.setUserCredentials(userCredentials);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.deleteAccount(userCredentials);
    }

    @PostMapping("/allevents")
    public Response allevents(@RequestBody UserCredentials userCredentials) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("allEvents");
        customerService.setUserCredentials(userCredentials);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.allEvents(userCredentials);
    }

    @PostMapping("/buytickets")
    public Response buyTickets(@RequestBody TicketRequest ticketRequest) {
        CustomerService customerService = new CustomerService(customerRepo, eventRepo, vendorRepo, ticketRepo, ticketPoolRepo);
        Thread thread = new Thread(customerService);
        customerService.setMethod("buyTickets");
        customerService.setTicketRequest(ticketRequest);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return customerService.getResponse();
        //return customerService.buyTickets(ticketRequest);
    }

}
