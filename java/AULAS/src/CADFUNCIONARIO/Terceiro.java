package CADFUNCIONARIO;

public class Terceiro extends Funcionario{
	
	//Atributo
	private double adicional;

	//Construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	//encapsulamento
	public double getAdicional() {
		return adicional;
	}


	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double salario() {
		
		return (horasTrabalhadas * valorPorHora)+adicional;
		
	}

	/*@Override
	public double salario() {
		return super.salario()+adicional;
	}*/
	
	
	
	
}//fim
