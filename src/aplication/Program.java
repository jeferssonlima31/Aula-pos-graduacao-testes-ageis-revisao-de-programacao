package aplication;

import entities.Atleta;

public class Program {

	
	public static void main(String[] args) {
		
		
		Atleta a1 = new Atleta();
		a1.setIdade(29);
		
		Atleta a2 = new Atleta("Aécio");
		a2.setIdade(34);

		Atleta a3 = new Atleta("Douglas");
		a3.setIdade(29);
		
		Atleta a4 = new Atleta("Vitória");
		a4.setIdade(26);

		Atleta a5 = new Atleta("Clarice");
		a5.setIdade(32);

		Atleta a6 = new Atleta("Bianka");
		a6.setIdade(35);
		
		
		a1.compete();
		a1.comer();
		
		
		
		
		System.out.println("a1 - " + a1.getNome());
		System.out.println("a2 - " + a2.getNome());
		System.out.println("a3 - " + a3.getNome());
		System.out.println("a4 - " + a4.getNome());
		System.out.println("a5 - " + a5.getNome());
		System.out.println("a6 - " + a6.getNome());
		
		




	}

}
