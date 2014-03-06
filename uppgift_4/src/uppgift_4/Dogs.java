package uppgift_4;

public class Dogs extends Mammal{

	
	private boolean Stupid;
	
	
	public Dogs(String Latin, int nursingTime, boolean Stupid){
		super(Latin, nursingTime);
		this.Stupid = Stupid;
		
	}
	public boolean getStupid(){
		return Stupid;
	}

	public void setStupid(boolean Stupid){
		this.Stupid = Stupid;
		
	}
	
 public String getinfo() {
	
	 String s;//decalrar sstring s
		
		if(Stupid){
			s = ""; // här ger jag s en tom sträng
				
		}else {
			s = "not";
		}
	 
	 
		
		return "The dog \""+super.getLatin()+"\" nurses for "+super.getnursingTime()+"and has "+ s +" a small brain. \n";
		// TODO Auto-generated method stub
		
	}




}
