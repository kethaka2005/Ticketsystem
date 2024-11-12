package Ticket;

public class GeneralTicket extends LastTimeTicket {
    private Double price;

    // Default constructor
    public GeneralTicket() {}

    // Parameterized constructor
    public GeneralTicket( double price) {
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
