
public class Hund {
	public double LautstaerkeDB;
	public String Name;
	public int Alter;
	public String rasse;
	
	public Hund(double LautstaerkeDB, String Name, int Alter) {
	
	this.Name = Name;
	this.LautstaerkeDB = LautstaerkeDB;
	this.Alter = Alter;
	
	}
	
	
	public Hund(String Name, int Alter) {
		this(42, Name,Alter);
		
	}
	public Hund(String Name) {
		this(Name, 4);
	}	
	public Hund() {
	this("Dog");
	}
	
	
		
	
public double getLautstaerkeDB() {
	return LautstaerkeDB;
}
}


	