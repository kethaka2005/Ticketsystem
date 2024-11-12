package Ticket;

public class EarlyBirdTicket extends GeneralTicket{
    private Double price;

    // Default constructor
    public EarlyBirdTicket() {}

    // Parameterized constructor
    public EarlyBirdTicket( double price) {
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
