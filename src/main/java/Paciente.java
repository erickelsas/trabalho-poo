//Nome: Erick Elsas de Freitas - RA: 2347938

final public class Paciente extends Pessoa implements EntradaDados{
	private int pront;
	private int sus;
	private String tipoSang;

	public Paciente(){
		pront = 0;
		sus = 0;
		tipoSang = "";
	}

	final public int getPront(){
		return pront;
	}

	final public void setPront(int pront){
		this.pront = pront;
	}

	final public int getSus(){
		return sus;
	}
	
	final public void setSus(int sus){
		this.sus = sus;
	}

	final public String getTipoSang(){
		return tipoSang;
	}

	final public void setTipoSang(String tipoSang) throws TipoSangInvalidoException{
		tipoSang = tipoSang.toUpperCase();
      	if(tipoSang.length() == 2){
			if(Character.compare(tipoSang.charAt(0), 'A') == 0 || Character.compare(tipoSang.charAt(0), 'B')  == 0 || Character.compare(tipoSang.charAt(0), 'O') == 0){
				if(Character.compare(tipoSang.charAt(1), '+') == 0 || Character.compare(tipoSang.charAt(1), '-') == 0){
					this.tipoSang = tipoSang;
				}
			}
		    else{
		        throw new TipoSangInvalidoException();
		    }
		} else if(tipoSang.length() == 3){
			if(Character.compare(tipoSang.charAt(0), 'A') == 0 || Character.compare(tipoSang.charAt(0), 'B') == 0 || Character.compare(tipoSang.charAt(0), 'O') == 0){
				if(Character.compare(tipoSang.charAt(1), 'B') == 0){
					if(Character.compare(tipoSang.charAt(2), '+') == 0 || Character.compare(tipoSang.charAt(2), '-') == 0){
						this.tipoSang = tipoSang;
				    }
			    }
		    } else{
		        throw new TipoSangInvalidoException();
		    }
		}else {
			throw new TipoSangInvalidoException();
		}
	}

	public void entraDados(){
		Leitura l = new Leitura();
		int flag = 1;
		
		do{
			try{
				super.entradaDeDados();
				setPront(Integer.parseInt(l.entDados("Informe o prontuario: ")));
				setSus(Integer.parseInt(l.entDados("Informe o cadastro do SUS: ")));
				setTipoSang(l.entDados("Informe o tipo sanguineo: "));
				flag = 0;
			}
			catch (TipoSangInvalidoException tse){
				tse.impErro();
			}
			catch(NumberFormatException nfe){
				System.out.println("O atributo deve ser composto por numeros!");
			}
		}while(flag != 0);
	}

	final public void impDados(){
		System.out.println("\t\t\nDADOS PACIENTE!\n");
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
		System.out.println("PRONTUARIO: " + getPront());
		System.out.println("CARTEIRA DO SUS: " + getSus());
		System.out.println("TIPO SANGUINEO: " + getTipoSang());
		System.out.println("");
	}
}