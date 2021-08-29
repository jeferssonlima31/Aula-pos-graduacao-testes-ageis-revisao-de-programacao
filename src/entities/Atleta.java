package entities;

public class Atleta {
	private String nome;
	private int idade;
	private double peso;
	private String genero;
	private String email;
	private boolean resultadoAnteDopping = false;

	public Atleta() {

	}

	public Atleta(String name) {

	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isResultadoAnteDopping() {
		return resultadoAnteDopping;
	}

	public void setResultadoAnteDopping(boolean resultadoAnteDopping) {
		this.resultadoAnteDopping = resultadoAnteDopping;
	}

	public void aquece() {
		System.out.println("aquecendo");

	}

	public void treina() {
		System.out.println("treinando");
		peso--;

	}

	public void compete() {
		System.out.println("competindo");

	}

	public void beber() {
		System.out.println("bebendo");

	}

	public void comer() {
		System.out.println("comendo");
		peso++;

	}

	@Override
	public String toString() {
		return "Atleta \n Nome:" + nome + ", Idade:" + idade + ", Peso:" + peso + ", Genero:" + genero + ", Email:"
				+ email + "";
	}

}
