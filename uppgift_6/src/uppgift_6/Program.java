package uppgift_6;

public class Program {

	private String name;
	private String code;
	private int Woman;
	private int Man;
	
	public Program(String name, String code , int Woman, int Man){
		this.name = name;
		this.code = code;
		this.Woman = Woman;
		this.Man = Man;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public String getCode(){
		return code;
		
	}
	
	public int getWoman(){
		return Woman;
		
	}
	
	public int getMan(){
		return Man;
	}
		@Override
		public String toString(){
			return name;
			
		}
		
	}
	
	

