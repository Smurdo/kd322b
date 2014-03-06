package house;


public class house {
//////////instansvariabler: //////////	
private int year;
private int size;	
//////////klassvariabel: //////////
private static int nbrOfHouses;
public static final int MIN_SIZE = 10; 	

//////////konstruktor: //////////	
public house (int _year,int _size){ 
     //diverse kod

	size = _size;
	if (_year < MIN_SIZE){
		_year=MIN_SIZE;
	}else {
		year=_year;
	}


nbrOfHouses = nbrOfHouses + 1;
}
//////////klassmetod: //////////
public static int getNbrHouses(){ 
	return nbrOfHouses;
}
//////////instansmetod: //////////	
public int getYear() {     
     //divers kod
	return year;
}
public int getSize(){     
    //diverse kod
	return size;
}

}