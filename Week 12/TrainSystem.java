import java.io.*;

public class TrainSystem {
    private String type;
    private double distance;
    private int pricePerKm;

    public TrainSystem(String type, double distance, int pricePerKm) {
        this.type = type;
        this.distance = distance;
        this.pricePerKm = pricePerKm;
    }

    
    public void save(String filename) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            out.writeUTF(this.type);      
            out.writeDouble(this.distance); 
            out.writeInt(this.pricePerKm);  
            System.out.println("Ticket saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving ticket: " + e.getMessage());
        }
    }

    
    public static TrainSystem load(String filename) {
        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            String type = in.readUTF();
            double distance = in.readDouble();
            int pricePerKm = in.readInt();
            return new TrainSystem(type, distance, pricePerKm);
        } catch (IOException e) {
            System.err.println("Error loading ticket: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Ticket [Type: " + type + ", Distance: " + distance + "km, Price/km: " + pricePerKm + "]";
    }

    public static void main(String[] args) {
        TrainSystem myTicket = new TrainSystem("Student", 150.5, 12);
        String file = "ticket_data.bin";

        myTicket.save(file);
        TrainSystem loadedTicket = TrainSystem.load(file);

        if (loadedTicket != null) {
            System.out.println("Loaded " + loadedTicket.toString());
        }
    }
}