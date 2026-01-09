import java.time.LocalDate;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    // Step 4: Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    // Step 4: Method Overloading
    public void displayInfo(boolean full) {
        if (full) {
            this.displayInfo(); // Calls the overridden displayInfo above
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Admin Name: " + getName());
        }
    }

    @Override
    public void displayHappyBirthday() {
        int age = today.getYear() - getDob().getYear();

        if (isBirthday()) {
            System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }
    }
}