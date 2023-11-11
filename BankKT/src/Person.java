public class Person {
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNumber;
    private String ID;

    public Person(String FirstName, String LastName, String Address, String PhoneNumber, String ID){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
