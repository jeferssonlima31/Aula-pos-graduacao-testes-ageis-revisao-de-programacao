import entities.Animal;
import entities.Cachorro;
import entities.Capivara;

public class ProgramAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro c = new Cachorro();
		c.setNome("Tobby");
		
		Animal a =  new Capivara();
	
		a.setNome("Molly");
		
		
	c.comunicar();
	a.comunicar();
	
	
	
	}

}
