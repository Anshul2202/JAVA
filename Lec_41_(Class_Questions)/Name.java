public class Name {

    private String firstName;
    private String lastName;

    // Get Methods
    public void getFirstName() {
        System.out.println(firstName);
    }

    public void getLastName() {
        System.out.println(lastName);
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // Set Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
