
public class Sch�ferhund extends Hund {

	
		
		public Sch�ferhund(double LautstaerkeDB, String Name, int Alter) {
		
			super(LautstaerkeDB,  Name,  Alter);
			
			this.rasse = "Sch�ferhund";
		}
		@Override public double getLautstaerkeDB() {
			return LautstaerkeDB*1.5;
		}
		
		

}