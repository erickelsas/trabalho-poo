//Nome: Erick Elsas de Freitas - RA: 2347938

public class Telefone{
	private int ddd;
	private int tel;

	public Telefone(){
		ddd = 0;
		tel = 0;
	}

	public int getDdd(){
		return ddd;
	}

	final public void setDdd(int ddd) throws DddTamanhoException{
		if(Integer.toString(ddd).length() == 2){
			this.ddd = ddd;
		} else {
			throw new DddTamanhoException();	
		}	
	}

	public int getTel(){
		return tel;
	}

	final public void setTel(int tel) throws TelefoneTamanhoException{
		if(Integer.toString(tel).length() == 9){
			this.tel = tel;
		} else {
			throw new TelefoneTamanhoException();
		}
	}
}