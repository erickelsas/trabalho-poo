//Nome: Erick Elsas de Freitas - RA: 2347938

abstract class Empregado extends Pessoa{
	protected float salario;
	private int ctps;

	public Empregado(){
		salario = 0;
		ctps = 0;
	}

	public float getSalario(){
		return salario;
	}

	final public void setSalario(float salario) throws SalarioMinException{
		if(salario >= 1212){
			this.salario = salario;
		} else {
			this.salario = 1212;
			throw new SalarioMinException();
		}
	}

	public int getCtps(){
		return ctps;
	}

	public void setCtps(int ctps) throws CtpsTamanhoException{
		if(Integer.toString(ctps).length() == 8){
			this.ctps = ctps;
		} else {
			throw new CtpsTamanhoException();
		}
	}
	
	abstract void impDados();
}