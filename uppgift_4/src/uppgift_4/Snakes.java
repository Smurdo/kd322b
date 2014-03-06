package uppgift_4;

public class Snakes extends Animal {

	
	private boolean Poison;
	
	public Snakes(String Latin, boolean Poison){
		
		super(Latin);
		this.Poison =Poison;
		
	}
	
	
	
	
public String getinfo() {
		
		String s;//decalrar sstring s
		
		if(Poison){
			s = ""; // här ger jag s en tom sträng
				
		}else {
			s = "not";
		}
		
		
		return "The snake \""+super.getLatin()+" is "+ s +" dangueres. \n";
		// TODO Auto-generated method stub
		
	}



	
	
}
