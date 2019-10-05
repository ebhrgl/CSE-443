package EmailAddressBook;

public class PersonelAddress implements EmailAddressBook {
    private String name;
    private String email;

    public PersonelAddress(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void displayDetails(){
        System.out.println(name + " " + email);
    }
}
