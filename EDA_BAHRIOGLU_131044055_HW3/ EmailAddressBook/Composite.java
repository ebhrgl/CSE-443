package EmailAddressBook;

import java.util.ArrayList;
import java.util.List;

public class Composite implements EmailAddressBook {

    private List<EmailAddressBook> emailList = new ArrayList<EmailAddressBook>();

    public void displayDetails(){
        for(EmailAddressBook addressBook : emailList){
            addressBook.displayDetails();
        }
    }

    public void addEmailAddress(EmailAddressBook addressBook){
        emailList.add(addressBook);
    }

    public void removeEmailAddress(EmailAddressBook addressBook){
        emailList.remove(addressBook);
    }

}
