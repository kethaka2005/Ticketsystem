package Configuration;

public class Configuration {

    private double customerRetrievalRate;
    private int maxTicketCapacity;
    private double ticketReleaseRate;
    private int totalTickets;

    public Configuration(){}


    public void Configuration(){
        this.customerRetrievalRate=customerRetrievalRate;
        this.maxTicketCapacity=maxTicketCapacity;
        this.ticketReleaseRate=ticketReleaseRate;
        this.totalTickets=totalTickets;


    }
    public double getcustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public double getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public void setCustomerRetrievalRate(double customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public double getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public void setTicketReleaseRate(double ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }









}
