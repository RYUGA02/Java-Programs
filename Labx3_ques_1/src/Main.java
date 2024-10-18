// Superclass HillStations
class HillStations {
    // Method to get the location
    public void location() {
        System.out.println("Location: Not specified.");
    }

    // Method to get what the hill station is famous for
    public void famousFor() {
        System.out.println("Famous for: Not specified.");
    }
}


public class Main {
    public static void main(String[] args) {



        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Calling methods on superclass reference
        System.out.println("Calling methods from superclass reference:");
        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();

        System.out.println("\nCalling methods from subclass reference:");

        // Calling methods on subclass reference
        ((Manali) manali).location();
        ((Manali) manali).famousFor();

        ((Mussoorie) mussoorie).location();
        ((Mussoorie) mussoorie).famousFor();

        ((Gulmarg) gulmarg).location();
        ((Gulmarg) gulmarg).famousFor();

    }
}