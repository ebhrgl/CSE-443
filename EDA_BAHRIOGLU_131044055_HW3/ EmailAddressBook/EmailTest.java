package EmailAddressBook;

public class EmailTest {

    public static void main(String[] args){
        PersonelAddress p1 = new PersonelAddress("Ali Velioglu", "alivelioglu@xyz.com");
        PersonelAddress p2 = new PersonelAddress("Mehmet Yılmaz", "mehmetyilmaz@xyz.com");

        Composite compPersonel = new Composite();
        compPersonel.addEmailAddress(p1);
        compPersonel.addEmailAddress(p2);

        GroupAddress g1 = new GroupAddress("cengstudents4th@gtu.edu.tr");
        GroupAddress g2 = new GroupAddress("bilmuhstudents8th@gtu.edu.tr");

        Composite compGroup = new Composite();
        compGroup.addEmailAddress(g1);
        compGroup.addEmailAddress(g2);

        Composite composite = new Composite();
        composite.addEmailAddress(compPersonel);
        composite.addEmailAddress(compGroup);
        composite.displayDetails();
    }
}
