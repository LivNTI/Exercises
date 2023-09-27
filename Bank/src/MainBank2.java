import java.util.ArrayList;

public class MainBank2 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer myCust1 = new Customer(1, "Luke");
        Customer myCust2 = new Customer(2, "Akbar");
        Customer myCust3 = new Customer(3, "Madine");
        Customer myCust4 = new Customer(4, "Mara");

        customers.add(myCust1);
        customers.add(myCust2);
        customers.add(myCust3);
        customers.add(myCust4);

        Customer myCust = customers.get(2);

        customers.remove(2);

        customers.remove(myCust2);


        Customer myCust = new Customer(1, "Luke");
        Account myAcc = new Account(myCust, 1, 100);

        myAcc.setFunds(-100);

        String[] strArray = new String[5];
        int[] intArray = new int[17];
        boolean[] boolArray = new boolean[3];

        ArrayList<String> strArrayList = new ArrayList<String>();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<Boolean> boolArrayList = new ArrayList<Boolean>();


        ArrayList<Object> objArrayList = new ArrayList<Object>();

    }
}
