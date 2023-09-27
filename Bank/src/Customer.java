import java.util.Scanner;

public class Customer {
    // Attributes
    private int id;
    private String name;
    private Scanner scan = new Scanner(System.in);

    // Constructors
    public Customer(int id) {
        this.id = id;
        getInfo();
    }

    // Methods
    public void getInfo() {
        System.out.println("==========================================================");
        System.out.print("What is customer name? ");
        this.name = scan.nextLine();
    }

    // Getters & Setters
    public String getName() {
        return this.name;
    }
}
