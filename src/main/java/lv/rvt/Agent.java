package lv.rvt;


public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        //My name is Bond, James Bond
        return "My name is" + lastName.toLowerCase() + ", " + firstName.toLowerCase() + " " + lastName.toLowerCase();
    }
}
