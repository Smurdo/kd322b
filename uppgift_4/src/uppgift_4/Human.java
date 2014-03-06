package uppgift_4;

public class Human {

private Dog dog;
private String Info = "";

private String name;

public Human(String s){
	name = s;
	
}

public String getName() {
	return name;
}
public void buyDog(Dog d) {
	dog = d;
	
}	

public String getInfo() {
	
	if (dog == null ){
		Info = ("Hundlös");
		return Info;
	}else {
		Info = ("Har hund");
		return Info;
	}
	
}

}


