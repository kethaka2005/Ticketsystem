package CLI;

public class Customer {
    private int CustRetrevalRate;

    public void Customer(int CustRetrevalRate){
     this.CustRetrevalRate=CustRetrevalRate;
    }

    public int getCustRetrevalRate() {
        return CustRetrevalRate;
    }

    public void setCustRetrevalRate(int custRetrevalRate) {
        CustRetrevalRate = custRetrevalRate;
    }
}
