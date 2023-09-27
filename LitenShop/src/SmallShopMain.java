public class SmallShopMain {
    public static void main(String[] args) {
        Dairy myDairy = new Dairy();
        Soda mySoda = new Soda();

        System.out.println("The value of the " + myDairy.type + " is " + myDairy.value);
        System.out.println("The value of the " + mySoda.type + " is " + mySoda.value);


        System.out.println();
        System.out.println("PRICEDROP!");
        System.out.println();
        myDairy.value -= 10;
        mySoda.value *= 0.9;

        System.out.println("The new value of the " + myDairy.type + " is " + myDairy.value);
        System.out.println("The new value of the " + mySoda.type + " is " + mySoda.value);

    }
}