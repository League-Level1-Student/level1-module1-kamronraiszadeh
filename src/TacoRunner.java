
public class TacoRunner {
public static void main(String[] args) {
	person bob = new person();
	person bill= new person ();
	person john= new person ();
    bob.setName("bob");
    bill.setName("bill");
    john.setName("john");
	bob.setSuperpower(" strength");
	bill.setSuperpower(" bathroom");
	john.setSuperpower(" digestion");
	System.out.println(bob.toString());
	System.out.println(bill.toString());
	System.out.println(john.toString());
}

}
