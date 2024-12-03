package CLI;

import Ticket.Ticket;

public class Vendor {
    private int VendorRetrievalRate;
    private int NoOfTickets;

    public void Vendor(int VendorRetrievalRate){
    this.VendorRetrievalRate=VendorRetrievalRate;
    this.NoOfTickets=NoOfTickets;
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

    public  void TicketCreated(){
        for(int i=0;i<getNoOfTickets();i++){
            Ticket Ticket=new Ticket();
            System.out.println("Ticket Created");
        }
    }
}
