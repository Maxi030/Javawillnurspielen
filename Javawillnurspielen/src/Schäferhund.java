
public class Schäferhund extends Hund {

	
		
		public Schäferhund(double LautstaerkeDB, String Name, int Alter) {
		
			super(LautstaerkeDB,  Name,  Alter);
			
			this.rasse = "Schäferhund";
		}
		@Override public double getLautstaerkeDB() {
			return LautstaerkeDB*1.5;
		}
		
		

}