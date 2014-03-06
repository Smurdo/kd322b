package bike;

public class Bike {
/** v�rlden som vi anv�der i oliak funktioner*/
	private String color;
	private int price;
	private int size;
	/** antal cycklar*/
	private static int nbrOfBikes;
	
	/** sting f�r stolek f�rj*/
	public Bike(String farg, int storlek){
		color = farg;
		size = storlek;	
		
		
	}
	/** skapar en cykel med instansvariablar med begr�nsade olika v�rlden */
	public Bike(String farg, int storlek, int pris){
		
		if (storlek > Constants.MIN_SIZE){
			   this.size = storlek;
			   }else{
				   size = Constants.MIN_SIZE;
			   }
		 if (pris > Constants.MIN_PRICE){
			   this.price = pris;
			   }else{
				   price = Constants.MIN_PRICE;
			   }
		this.color = farg;
		
		nbrOfBikes = nbrOfBikes + 1; 
	}
		
		
	
	public String getColor(){
		return color;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int pris){
		
	}
	
	public int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
}