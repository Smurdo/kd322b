package uppgift_4;

public class Cats extends Mammal{

	private int lives;
	
	public Cats(String Latin, int nursingTime, int lives){
		super(Latin, nursingTime);
		this.lives = lives;
		
		
		
	}

	public int getLives(){
		return lives;
	}
	@Override
	public String getinfo() {
		
		
		
		
		
		String s;
		s = "The cat \""+super.getLatin()+"\" nurses for "+super.getnursingTime()+"and has "+ lives +" lives. \n";
		// TODO Auto-generated method stub
		return s;
	}
	
	
}
