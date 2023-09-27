import java.util.ArrayList;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        System.out.print("How many customer do you want to add? ");
        int noCust = scan.nextInt();

        for (int i = 0; i < noCust; i++) {
            customers.add(new Customer(i));
        }
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        Customer customer;
        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            System.out.println("Customer " + (i + 1) + " has the name of " + customer.getName());
        }
    }
}
