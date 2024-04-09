//Nome: Erick Elsas de Freitas - RA: 2347938


abstract class Pessoa{
	private String rg;
	private String nome;
	private String cpf;
	private Endereco end;
	private Telefone tel;
	private String email;
	private Data dataCadastro;
	private char sexo;
	private Data dataNasc;

	public Pessoa(){
		rg = "";
		nome = "";
		cpf = "";
		end = new Endereco();
		tel = new Telefone();
		email = "";
		dataCadastro = new Data();
		sexo = ' ';
		dataNasc = new Data();
	}

	public String getRg(){
		return rg;
	}

	final public void setRg(String rg) throws RgTamanhoException{
		if(rg.length() == 9){
			this.rg = rg;
		} else {
			throw new RgTamanhoException();
		}
	}

	public String getNome(){
		return nome;
	}


	final public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	final public void setCpf(String cpf) throws CpfTamanhoException{
		if(cpf.length() == 11){
			this.cpf = cpf;
		} else {
			throw new CpfTamanhoException();
		}
	}

	public Endereco getEnd(){
		return end;
	}

	final public void setEnd(Endereco end){
		this.end = end;
	}

	public Telefone getTel(){
		return tel;
	}

	final public void setTel(Telefone tel){
		this.tel = tel;
	}

	public String getEmail(){
		return email;
	}

	final public void setEmail(String email){
		this.email = email;
	}

	public Data getDataCadastro(){
		return dataCadastro;
	}

	final public void setDataCadastro(Data dataCadastro){
		this.dataCadastro = dataCadastro;
	}

	public char getSexo(){
		return sexo;
	}

	final public void setSexo(char sexo) throws SexoInvalidoException{
		sexo = Character.toUpperCase(sexo);
		if(sexo == 'M' || sexo == 'F'){
			this.sexo = sexo;
		} else {
			throw new SexoInvalidoException();
		}
	}

	public Data getDataNasc(){
		return dataNasc;
	}

	final public void setDataNasc(Data dataNasc){
		this.dataNasc = dataNasc;
	}

	abstract void impDados();

	protected void entradaDeDados(){
		Leitura l = new Leitura();
		int flag = 1;

		do{
			try{
				setNome(l.entDados("Informe o nome: "));
				setRg(l.entDados("Informe o RG (XXXXXXXXX): "));
				setCpf(l.entDados("Informe o CPF (XXXXXXXXXXXX): "));
				getEnd().setNome(l.entDados("Informe o nome da rua: "));
				getEnd().setNum(Integer.parseInt(l.entDados("Informe o numero da casa: ")));
				getEnd().setCompl(l.entDados("Informe o complemento: "));
				getEnd().setBairro(l.entDados("Informe o bairro: "));
				getEnd().setCidade(l.entDados("Informe a cidade: "));
				getEnd().setEstado(l.entDados("Informe o Estado: "));
				getEnd().setPais(l.entDados("Informe o pais: "));
				getEnd().setCep(Integer.parseInt(l.entDados("Informe o CEP (XXXXXXXX): ")));
				getTel().setDdd(Integer.parseInt(l.entDados("Informe o DDD (XX): ")));
				getTel().setTel(Integer.parseInt(l.entDados("Informe o Telefone (XXXXXXXXX): ")));
				setEmail(l.entDados("Informe o email: "));
				setSexo(l.entDados("Informe o sexo (F/M): ").charAt(0));
				getDataNasc().setDia(Integer.parseInt(l.entDados("Informe o dia de nascimento: ")));
				getDataNasc().setMes(Integer.parseInt(l.entDados("Informe o mes de nascimento: ")));
				getDataNasc().setAno(Integer.parseInt(l.entDados("Informe o ano de nascimento: ")));
				getDataCadastro().dataCad();
				flag = 0;
			}
			catch(EstadoTamanhoException ete){
				ete.impErro();
			}
			catch(EstadoCaracterException ece){
				ece.impErro();
			}
			catch(CepTamanhoException cte){
				cte.impErro();
			}
			catch(DiaInvalidoException die){
				die.impErro();
			}
			catch(MesInvalidoException mie){
				mie.impErro();
			}
			catch(AnoInvalidoException aie){
				aie.impErro();
			}
			catch(NumNegException nne){
				nne.impErro();
			}	
			catch(DddTamanhoException dte){
				dte.impErro();
			}
			catch(TelefoneTamanhoException tte){
				tte.impErro();
			}
			catch(SexoInvalidoException sie){
				sie.impErro();
			}
			catch(NumberFormatException nfe){
				System.out.println("O atributo deve ser composto por numeros!");
			}
			catch(CpfTamanhoException cpte){
				cpte.impErro();
			}
			catch(RgTamanhoException rte){
				rte.impErro();
			}
		}while(flag != 0);
	}

	final protected boolean buscaCpf(String cpf){
		if(cpf.matches(getCpf())){
			return true;
		} else {
			return false;
		}
	}
}