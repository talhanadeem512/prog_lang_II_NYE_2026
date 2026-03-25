class Submarine {
    private String name;
    private double depth;

    public Submarine(String name, double depth) {
        this.name = name;
        this.depth = (depth < 0) ? 0 : depth;
    }

    public void setDepth(double depth) {
        this.depth = (depth < 0) ? 0 : depth;
    }

    public double getDepth() {
        return depth;
    }

    public static void emergencySurface(Submarine[] fleet) {
        if (fleet == null) return;
        for (int i = 0; i < fleet.length; i++) {
            if (fleet[i] != null) {
                fleet[i].setDepth(0);
            }
        }
    }

    @Override
    public String toString() {
        return "Submarine [" + name + ", Depth: " + depth + "m]";
    }
}

public class SubmarineProgram {
    public static void main(String[] args) {
        Submarine[] fleet = {
            new Submarine("Alpha",   150.0),
            new Submarine("Bravo",   300.0),
            new Submarine("Charlie",  75.0)
        };

        System.out.println("Before:");
        for (Submarine sub : fleet) {
            System.out.println(sub);
        }

        Submarine.emergencySurface(fleet);

        System.out.println("\nAfter:");
        for (Submarine sub : fleet) {
            System.out.println(sub);
        }
        Math.round(3.99);
    }
}
