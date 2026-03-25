class CoffeeMachine {
    private String brand;
    private double price;       // HUF/dl
    private double quantity;    // This is for current amount in container (dl)
    private double capacity;    // This is for maximum container capacity (dl)

    // According to condition set in question we will set the quantity of container to full.
    public CoffeeMachine(String brand, double price, double capacity) {
        this.brand    = brand;
        this.capacity = capacity;
        this.quantity = capacity; 
        setPrice(price);          // We will let it go through the setter to check for any invalid price.
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price. Price unchanged.");
            return;
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    // Returns total cost, or -1 if requested amount exceeds current quantity
    public double buy(double dl) {
        if (dl > quantity) {
            return -1;
        }
        quantity -= dl;
        return dl * price;
    }

    // Fills container to capacity, returns the amount added
    public double fill() {
        double filled = capacity - quantity;
        quantity = capacity;
        return filled;
    }

    @Override
    public String toString() {
        return "CoffeeMachine ["
             + "Brand: "    + brand    + ", "
             + "Price: "    + price    + " HUF/dl, "
             + "Quantity: " + quantity + " dl, "
             + "Capacity: " + capacity + " dl"
             + "]";
    }
}

public class CoffeeProgram {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine("Starbucks", 150.0, 10.0);
        System.out.println(machine);

        // Now Let's simulate this purchase
        double cost = machine.buy(3.0);
        if (cost == -1) {
            System.out.println("\nNot enough coffee in container.");
        } else {
            System.out.println("\nPaid: " + cost + " HUF");
        }
        System.out.println(machine);

        cost = machine.buy(20.0);
        System.out.println("\nBuy 20dl result: " + cost); // -1

        double filled = machine.fill();
        System.out.println("\nFilled: " + filled + " dl");
        System.out.println(machine);

        machine.setPrice(-50.0); 
        System.out.println("\nPrice after invalid set: " + machine.getPrice()); // 150.0

        machine.setPrice(180.0);
        System.out.println("\nUpdated price: " + machine.getPrice());
    }
}