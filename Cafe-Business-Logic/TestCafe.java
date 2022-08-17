import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();
        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        int numWeeks = 10;
        System.out.printf("Purchases needed by week %d : %s \n\n", numWeeks, appTest.getStreakGoal(numWeeks));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        System.out.println("\n----- Add many Customers at once -----");
        ArrayList<String> customersList = new ArrayList<String>();
        appTest.addCustomers(customersList);

        System.out.println("\n----- Price Chart-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 2, 4);

        System.out.println("\n----- Display Menu -----");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.50);
        prices.add(3.50);
        prices.add(4.50);
        prices.add(3.50);
        appTest.displayMenu(menu, prices);

    }
}
