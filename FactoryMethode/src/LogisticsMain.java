import java.util.Scanner;
// Product interface
interface Transport {
    void deliver();
}

// Concrete products
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by land using a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by sea using a ship.");
    }
}


// Factory class with a static method to get the appropriate Transport object
class TransportFactory {
    public static Transport getTransport(String type) {
        if ("road".equalsIgnoreCase(type)) {
            return new Truck();
        } else if ("sea".equalsIgnoreCase(type)) {
            return new Ship();
        } else {
            throw new IllegalArgumentException("Invalid transport type: " + type);
        }
    }
}

// Client Code (Main)
public class LogisticsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu to the user
            System.out.println("\nWelcome to the Logistics System!");
            System.out.println("Enter the type of logistics (road or sea) or 'exit' to quit:");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().trim().toLowerCase();

            if ("exit".equals(choice)) {
                System.out.println("Exiting the Logistics System. Goodbye!");
                break;
            }

            try {
                // Use the factory method to get the appropriate transport object
                Transport transport = TransportFactory.getTransport(choice);
                System.out.println("\nUsing " + choice + " logistics:");
                transport.deliver();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
