
public class person {
private String name="";
private String superpower="";

public String getName() {
	return name;
	
}
	public void setName(String name) {
		
		this.name=name;
	
	
	
}
	
	public String getSuperPower() {
		return superpower;
		
		
		
	}
	public void setSuperpower(String superpower) {
		
		this.superpower=superpower;
	}
	public String toString () {
		
	return name+" has mad"+superpower+ " skills";
	}
}
