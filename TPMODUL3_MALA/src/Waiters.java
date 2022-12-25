public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 35000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        // call getFoodmethod and pending it to 5000 ms
        while (true) {
            getFood();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getCoffee

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            // check if value of getCoffeeNumber form CoffeeMachine class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getfoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the food machine to make another food\n");

        }
    }
}