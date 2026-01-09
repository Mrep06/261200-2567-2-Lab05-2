public class Lec05 {
    public static void main(String[] args) {
        User john = new User("John", 1954, 1, 9);
        john.displayInfo();
        john.displayHappyBirthday();

        System.out.println("----------");

        User john_wick = new User("John Wick", 1964, 9, 12);
        john_wick.displayInfo();
        john_wick.displayHappyBirthday();

        System.out.println("----------");

        Admin nicolas = new Admin("Nicolas", 1964, 1, 9);

        System.out.println("Full display (true):");
        nicolas.displayInfo(true);
        nicolas.displayHappyBirthday();

        System.out.println("\nShort display (false):");
        nicolas.displayInfo(false);

        System.out.println("----------");

        Admin nikolas_tesla = new Admin("Nikolas Tesla", 1856, 7, 10);

        System.out.println("Full display (true):");
        nikolas_tesla.displayInfo(true);
        nikolas_tesla.displayHappyBirthday();

        System.out.println("\nShort display (false):");
        nikolas_tesla.displayInfo(false);

        System.out.println("----------");

        User Tom = new User();
        Tom.displayInfo();
        Tom.displayHappyBirthday();

        System.out.println("----------");
        User Termineter = new User("Termineter007",2077,11,7);
        Termineter.displayInfo();
        Termineter.displayHappyBirthday();

        System.out.println("----------");

        Admin Amily = new Admin("Amily", 9999, 1, 9);

        System.out.println("Full display (true):");
        Amily.displayInfo(true);
        Amily.displayHappyBirthday();
    }
}