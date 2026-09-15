public class Main {
    public static void main(String[] args) {
        try {
            Parrot p = new Parrot("Kiwi", "Squawk", "African Grey");
            p.makeSound();   // from Animal
            p.layEggs();     // from Bird
            p.fly();         // from Flyable, implemented in Parrot
            p.mimic();       // from Parrot

            // Demonstrating the custom exception
            Parrot invalid = new Parrot("NoName", "Squawk", "");
        } catch (InvalidSpeciesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
