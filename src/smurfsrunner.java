
public class smurfsrunner {
public static void main(String[] args) {
	Smurf handy= new Smurf("handy");
	handy.eat();
	handy.getName();
	System.out.println(handy.getName());
	Smurf papa=new Smurf ("papa smurf");

	papa.getHatColor();
	System.out.println(papa.getHatColor());
	
	papa.getName();
	System.out.println(papa.getName());
	papa.isGirlOrBoy();
	
	System.out.println(papa.isGirlOrBoy());
	
	Smurf smurfette=new Smurf ("smurfette");
	
	smurfette.getName();
	System.out.println(smurfette.getName());
	
	smurfette.getHatColor();
	System.out.println(smurfette.getHatColor());
	
	smurfette.isGirlOrBoy();
	
	System.out.println(smurfette.isGirlOrBoy());
	
}
}
