package EmailAddressBook;

public class GroupAddress implements EmailAddressBook {

    private String email;

    public GroupAddress(String email){

        this.email = email;
    }

    public void displayDetails(){
        System.out.println(email);
    }
}
