package REVISAO;

public class Pessoa {
		
	//classe: pessoa [terreno]
	//atributos - segurança [material de construção]
	//construtores - como a classe abre -criar [pedreiro zé]
		//(pode aocntecer não é obrigatorio)sobrecarga de construtor [pedreiro malaquias ] 
	//encapsulamento  - getter and setters - segurança [vigia]
	//metodos [vai fazer talvez] [casa ou terrenno com acabamento]
		//sobrecarga de metodos 
	//herança - a todo momento 
	
	//*** acabamento *** 
	// override
	//polimorfismo
	//collections
	//interface
	
	//atributos
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char genero;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	//construtor - sobrecarga 
	public Pessoa(String nome, int anoNascimento, char genero) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}
	
	
	//encapsulamento(tambem é um "metodo")


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	public int idade () {
		return (2021 -anoNascimento);
	}
	
	
	
	
	
	
	
	
	
	
	
}
