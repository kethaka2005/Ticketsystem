package Ticket;

public class LastTimeTicket extends VIPTicket {
    private Double price;

    // Default constructor
    public LastTimeTicket() {}

    // Parameterized constructor
    public LastTimeTicket( double price) {

        this.price = price;
    }

    // Getter for price
    public Double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(Double price) {
        this.price = price;
    }
}
