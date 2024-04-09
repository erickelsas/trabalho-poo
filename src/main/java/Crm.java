//Nome: Erick Elsas de Freitas - RA: 2347938

public class Crm{
	private String estado;
	private int num;

	public Crm(){
		estado = "";
		num = 0;
	}

	public String getEstado(){
		return estado;
	}

	final public void setEstado(String estado) throws EstadoCaracterException, EstadoTamanhoException{
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

	public int getNum(){
		return num;
	}

	final public void setNum(int num) throws CrmTamanhoException{
		if(Integer.toString(num).length() == 6){
			this.num = num;
		} else {
			throw new CrmTamanhoException();
		}
	}
}