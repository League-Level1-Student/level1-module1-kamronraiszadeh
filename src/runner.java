
public class runner {
public static void main(String[] args) {
	SeaCreature Spongebob= new SeaCreature("spongebob");
	
	Spongebob.eat();
	Spongebob.laugh();
	Spongebob.getName();
	
	SeaCreature Squidward= new SeaCreature("squidward");
	
	Squidward.eat();
	Squidward.laugh();
	Squidward.getName();
	SeaCreature Patrick= new SeaCreature("patrick");
	
	Patrick.eat();
	Patrick.laugh();
	Patrick.getName();
   
	
	System.out.println(Spongebob.getName());	
	System.out.println(Squidward.getName());	
	System.out.println(Patrick.getName());
}
}
