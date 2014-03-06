package uppgift_4;

public abstract class Animal {

	
	private String Latin;
	
	public Animal(String Latin){
		
		setLatin(Latin);
		
		
	}
	
	public String getLatin(){
		return Latin;
		
		
	}
	
	public void setLatin(String Latin){
		this.Latin = Latin;
		
		
	}
	
	abstract String getinfo();
	
}
