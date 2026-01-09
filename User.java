import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;
    LocalDate today = LocalDate.now();

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        LocalDate inputDate = LocalDate.of(year, month, day);
        if (inputDate.isAfter(today)) {
            System.out.println("Error: Date of birth cannot be in the future!");
            this.dob = today;
        } else {
            this.dob = inputDate;
        }

        this.name = name;
    }

    // 2. สร้าง Getter/Setter เพื่อควบคุมการเข้าถึงข้อมูล

    // สำหรับ name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // สำหรับ dob
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("Birthday: " + dob);
    }

    public boolean isBirthday() {
        if (today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth()) {
            return true;
        }
        return false;
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}