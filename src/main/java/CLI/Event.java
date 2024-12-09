package CLI;

public class Event {
    private int TotalNoOfTicket;
    private int TicketReleaseRate;
    private int MaxTicketCapacity;
    private double CustRetrievalRate;
    public void Event(int TotalNoOfTicket,int TicketReleaseRate){
     this.TotalNoOfTicket=TotalNoOfTicket;
     this.TicketReleaseRate=TicketReleaseRate;
     this.MaxTicketCapacity=MaxTicketCapacity;
     this.CustRetrievalRate=CustRetrievalRate;
    }

    public int getTotalNoOfTicket() {
        return TotalNoOfTicket;
    }

    public void setTotalNoOfTicket(int totalNoOfTicket) {
        TotalNoOfTicket = totalNoOfTicket;
    }

    public int getTicketReleaseRate() {
        return TicketReleaseRate;
    }

    public void setTicketReleaseRate(int ticketReleaseRate) {
        TicketReleaseRate = ticketReleaseRate;
    }

    public int getMaxTicketCapacity() {
        return MaxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        MaxTicketCapacity = maxTicketCapacity;
    }

    public double getCustRetrievalRate() {
        return CustRetrievalRate;
    }

    public void setCustRetrievalRate(double custRetrievalRate) {
        CustRetrievalRate = custRetrievalRate;
    }
}
