package week3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Method to get firstName
    public String getFirstName() {
        return firstName;
    }

    // Method to get lastName
    public String getLastName() {
        return lastName;
    }

    // Method to get age
    public int getAge() {
        return age;
    }

    // Method to set firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set age
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}

