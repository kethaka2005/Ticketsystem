package CLI;

import java.util.NoSuchElementException;

public class Customer implements Runnable{
    private int CustRetrievalRate;
    private int NoOfTickets;
    private TicketPool ticketPool;


    public Customer(int NoOfTickets, int CustRetrievalRate,TicketPool ticketPool){
        this.CustRetrievalRate=CustRetrievalRate;
        this.NoOfTickets=NoOfTickets;
        this.ticketPool=ticketPool;
    }

    public int getCustRetrievalRate() {
        return CustRetrievalRate;
    }

    public void setCustRetrievalRate(int custRetrievalRate) {
        CustRetrievalRate = custRetrievalRate;
    }

    public int getNoOfTickets() {
        return NoOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        NoOfTickets = noOfTickets;
    }

    public TicketPool  getTicketPool() {
        return ticketPool;
    }

    public void setTicketPool(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run(){
        for(int i=1;i<=NoOfTickets;i++){
            System.out.println("Ticket has been removed");
            try {
                ticketPool.removeTicket();
                Thread.sleep(getCustRetrievalRate());
            }    catch(InterruptedException e){
                System.out.println("thread was interrupted.Exiting...");
            }
            catch(NoSuchElementException NSE){
                System.out.println("There no Tickets remaining ");
            }
        }
    }

}
