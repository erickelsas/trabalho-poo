final public class Enfermeiro extends Empregado implements Reajusta, EntradaDados{
	private String grauForm;
	private String setorHosp;

	public Enfermeiro(){
		grauForm = "";
		setorHosp = "";
	}

	final public String getGrauForm(){
		return grauForm;
	}

	final public void setGrauForm(String grauForm){
		this.grauForm = grauForm;
	}

	final public String getSetorHosp(){
		return setorHosp;
	}

	final public void setSetorHosp(String setorHosp){
		this.setorHosp = setorHosp;
	}

	public void entraDados(){
		Leitura l = new Leitura();
		int flag = 1;
		do{
			try{	
				super.entradaDeDados();
				setSalario(Float.parseFloat(l.entDados("Informe o salario: ")));
				setCtps(Integer.parseInt(l.entDados("Informe a Carteira de Trabalho (XXXXXXXX): ")));
				setGrauForm(l.entDados("Informe o grau de formação: "));
				setSetorHosp(l.entDados("Informe o setor hospitalar: "));
				flag = 0;
			}
			catch(SalarioMinException sme){
				sme.impErro();
			}
			catch(CtpsTamanhoException ctte){
				ctte.impErro();
			}
			catch(NumberFormatException nfe){
				System.out.println("O atributo deve ser composto por numeros!");
			}
		}while(flag != 0);
	}

	final public void impDados(){
		System.out.println("\t\t\nDADOS ENFERMEIRO!\n");
		System.out.println("NOME: " + getNome());
		System.out.println("RG: "+ getRg());
		System.out.println("CPF: " + getCpf());
		System.out.println("RUA: " + getEnd().getNome());
		System.out.println("NUMERO CASA: " + getEnd().getNum());
		System.out.println("COMPLEMENTO: " + getEnd().getCompl());
		System.out.println("BAIRRO: " + getEnd().getBairro());
		System.out.println("CIDADE: " + getEnd().getCidade());
		System.out.println("ESTADO: " + getEnd().getEstado());
		System.out.println("PAIS: " + getEnd().getPais());
		System.out.println("CEP: " + getEnd().getCep());
		System.out.println("(DDD) TELEFONE: (" + getTel().getDdd() + ") " + getTel().getTel());
		System.out.println("EMAIL: " + getEmail());
		System.out.println("DATA DE NASCIMENTO: " + getDataNasc().getDia() + "/" + getDataNasc().getMes() + "/" + getDataNasc().getAno());
		System.out.println("SALARIO: " + getSalario());
		System.out.println("CTPS: " + getCtps());
		System.out.println("GRAU DE FORMACAO: " + getGrauForm());
		System.out.println("SETOR HOSPITALAR: " + getSetorHosp());
	}

	//POLIMORFISMO DE SOBRECARGA
	final public void reajustaSal(){
		super.salario = super.salario * 1.12f;
	}

	final public void reajustaSal(float porc){
		if(porc < 1){
			super.salario = super.salario * (1 + porc);
		} else {
			System.out.println("O valor deve ser menor que 1! (15% = 0.15)");
		}
	}

}