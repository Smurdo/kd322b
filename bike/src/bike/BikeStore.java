package bike;
import java.util.ArrayList;

public class BikeStore {

	
	/** gör en array för cyclarna*/
	
	ArrayList<Bike> bikes = new ArrayList<Bike>(); 
	
	public String getAllbikes() {
		
		
		/** gör en forloop för size get och color*/
		 
			 String s = "";
		 for(Bike bike:bikes){
				
				
			s=s+ "fargen po cykeln ar" + bike.getColor() + "\t storleken po cykeln" +bike.getSize()	
		+ "\t priset po cykeln ar" + bike.getPrice() + "\n";
		
		}
		
		return s;
		
		
	}

	/** läger in värderna för size price och color*/
		 public void addBike(String farg, int storlek, int pris){
			 bikes.add(new Bike(farg,storlek,pris) );
		 }

}
