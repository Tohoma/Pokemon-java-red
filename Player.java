@@ -0,0 +1,21 @@

import java.util.ArrayList;
import java.util.List;

public class Player {
	ArrayList playerpokemon= new ArrayList();
	ArrayList item= new ArrayList();
	ArrayList badges= new ArrayList();
	private String name;
	
	public Player(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void addPokemon(List pokemon){
		playerpokemon.add(pokemon);
	}
}
