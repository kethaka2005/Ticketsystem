package CLI;

import Ticket.Ticket;


public class Vendor implements Runnable{

    private int VendorRetrievalRate;
    private int NoOfTickets;
    private TicketPool ticketPool;

    public Vendor(int NoOfTickets, int VendorRetrievalRate, TicketPool ticketPool){
    this.VendorRetrievalRate=VendorRetrievalRate;
    this.NoOfTickets=NoOfTickets;
    this.ticketPool= ticketPool;

    }

    public int getVendorRetrievalRate() {
        return VendorRetrievalRate;
    }

    public void setVendorRetrievalRate(int vendorRetrievalRate) {
        VendorRetrievalRate = vendorRetrievalRate;
    }

    public int getNoOfTickets() {
        return NoOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        NoOfTickets = noOfTickets;
    }

    public TicketPool getTicketPool() {
        return ticketPool;
    }

    public void setTicketPool(int ticketPool) {
        ticketPool = ticketPool;
    }


    @Override
    public void run(){
        for(int i=0;i<getNoOfTickets();i++){
            Ticket ticket=new Ticket();
            System.out.println("Ticket Created");
            ticketPool.addToTicketPool(ticket);
            try {
                Thread.sleep(VendorRetrievalRate);
            }    catch(InterruptedException e){
                System.out.println("thread was interrupted.Exiting...");
            }
        }
    }

}
