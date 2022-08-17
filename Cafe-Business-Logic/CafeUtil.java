import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }

        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
        }

        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();

        System.out.println("Hello ! " + userName);
        System.out.printf("There are %d people in front of you", customers.size());
        customers.add(userName);
        System.out.println("\n----- Customers List-----");
        System.out.println(customers);
    }

    public void addCustomers(ArrayList<String> customers) {
        System.out.println("Please enter the customers name: ");
        System.out.println("press 'q' to exit ");
        String userName = "";

        while (!userName.equals("q")) {
            userName = System.console().readLine();
            if (!userName.equals("q")) {
                customers.add(userName);
            }
        }

        System.out.println("\n----- Customers List-----");
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double tax = 0;
        for (int i = 1; i < maxQuantity + 1; i++) {
            System.out.printf("%d - $ %.2f \n", i, (i * price - tax));
            tax += 0.50;
        }

    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f \n", i, menuItems.get(i), prices.get(i));
        }

        return true;
    }
}