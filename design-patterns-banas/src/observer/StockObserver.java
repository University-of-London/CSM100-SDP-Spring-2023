package observer;

// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer {

    private static int observerIDTracker;
    // Used to track the observers
    private final int observerID;
    private final Subject stockGrabber;
    private double ibmPrice;
    private double aaplPrice;

    // Will hold reference to the StockGrabber object
    // Static used as a counter
    private double googPrice;

    public StockObserver(Subject stockGrabber) {

        // Store the reference to the stockGrabber object so
        // I can make calls to its methods

        this.stockGrabber = stockGrabber;

        // Assign an observer ID and increment the static counter

        this.observerID = ++observerIDTracker;

        // Message notifies user of new observer

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList

        stockGrabber.register(this);

    }

    // Called to update all observers

    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    public void printThePrices() {

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
            aaplPrice + "\nGOOG: " + googPrice + "\n");

    }

}