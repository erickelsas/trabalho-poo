//Nome: Erick Elsas de Freitas - RA: 2347938

public class Endereco{
	private String nome;
	private int num;
	private String compl;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private int cep;

	public Endereco(){
		nome = "";
		num = 0;
		compl = "";
		bairro = "";
		cidade = "";
		estado = "";
		pais = "";
		cep = 0;
	}

	public String getNome(){
		return nome;
	}

	final public void setNome(String nome){
		this.nome = nome;
	}

	public int getNum(){
		return num;
	}
	
	final public void setNum(int num) throws NumNegException{
		if(num >= 0){
			this.num = num;
		} else {
			throw new NumNegException();
		}
	}

	public String getCompl(){
		return compl;
	}

	final public void setCompl(String compl){
		this.compl = compl;
	}

	public String getBairro(){
		return bairro;
	}

	final public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getCidade(){
		return cidade;
	}

	final public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getEstado(){
		return estado;
	}

	final public void setEstado(String estado) throws EstadoTamanhoException, EstadoCaracterException{
		estado = estado.toUpperCase();
		if(estado.length() == 2){
			if(estado.matches("[A-Z]*")){
				this.estado = estado;
			} else {
				throw new EstadoCaracterException();
			}
		} else {
			throw new EstadoTamanhoException();
		}	
	}	

	public String getPais(){
		return pais;
	}

	final public void setPais(String pais){
		this.pais = pais;
	}
	
	public int getCep(){
		return cep;
	}

	final public void setCep(int cep) throws CepTamanhoException{
		if(Integer.toString(cep).length() == 8){
			this.cep = cep;
		} else {
			throw new CepTamanhoException();
		}
	}
}