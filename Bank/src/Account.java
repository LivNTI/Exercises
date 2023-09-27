public class Account {
    private int accNo;
    private int funds;
    private Customer customer;

    public Account(Customer customer, int accNo, int funds) {
        this.customer = customer;
        this.accNo = accNo;
        this.funds = funds;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        if (funds >= 0) {
            this.funds = funds;
        } else {
            System.out.println("The amount cannot be negative");
        }
    }
}


