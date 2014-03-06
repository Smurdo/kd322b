package uppgift_4;

public abstract class Mammal extends Animal {

	private int nursingTime;
	
	public Mammal(String Latin, int nursingTime){
		
	super(Latin);
	this.nursingTime = nursingTime;
		
	}
	
	
	public int getnursingTime(){
		return nursingTime;
		
		
	}

	public void setnursingTime(int nursingTime){
		this.nursingTime = nursingTime;
		
		
	}

}
