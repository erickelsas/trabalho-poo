
import javax.swing.JOptionPane;

//Nome: Erick Elsas de Freitas - RA: 2347938

final public class Medico extends Empregado implements Reajusta, EntradaDados{
	private Crm crm;
	private String espec;

	public Medico(){
		crm = new Crm();
		espec = "";
	}

	final public Crm getCrm(){
		return crm;
	}
	
	final public void setCrm(Crm crm){
		this.crm = crm;
	}

	final public String getEspec(){
		return espec;
	}

	final public void setEspec(String espec){
		this.espec = espec;
	}

	public void entraDados(){		
		Leitura l = new Leitura();
		int flag = 1;

		do{
			try{
				super.entradaDeDados();
				setSalario(Float.parseFloat(l.entDados("Informe o salario: ")));
				setCtps(Integer.parseInt(l.entDados("Informe a Carteira de Trabalho (XXXXXXXX): ")));
				getCrm().setNum(Integer.parseInt(l.entDados("Informe o numero da CRM (XXXXXX): ")));
				getCrm().setEstado(l.entDados("Informe o estado da CRM (XX): "));
				setEspec(l.entDados("Informe a especializacao: "));
				flag = 0;
			}
			catch(SalarioMinException sme){
				sme.impErro();
			}
			catch(CtpsTamanhoException ctte){
				ctte.impErro();
			}
			catch(CrmTamanhoException cte){
				cte.impErro();
			}
			catch(EstadoCaracterException ece){
				ece.impErro();
			}
			catch(EstadoTamanhoException ete){
				ete.impErro();
			}
			catch(NumberFormatException nfe){
				System.out.println("O atributo deve ser composto por numeros!");
			}
		}while(flag != 0);
	}

	final public void impDados(){
		System.out.println("\t\t\nDADOS MEDICO!");
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
		System.out.println("CRM: " + getCrm().getNum() + "-" + getCrm().getEstado());
		System.out.println("ESPECIALIZACAO: " + getEspec());
		System.out.println("");
	}

	final public void reajustaSal(){
		super.salario = super.salario * 1.16f;
	}

	final public void reajustaSal(float porc){
		if(porc < 1){
			super.salario = super.salario * (1 + porc);
		} else {
			JOptionPane.showMessageDialog(null, "O valor deve ser menor que 1 (15% = 0.15)", "Erro!", 0);
		}
	}

	final public boolean buscaEspec(String espec){
		if(espec.matches(getEspec())){
			return true;
		} else {
			return false;
		}
	}
}