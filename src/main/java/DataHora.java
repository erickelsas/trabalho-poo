//Nome: Erick Elsas de Freitas - RA: 2347938

public class DataHora extends Data{
	private int hora;
	private int minutos;

	public DataHora(){
		hora = 0;
		minutos = 0;
	}

	public int getHora(){
		return hora;
	}	

	final public void setHora(int hora) throws HoraInvalidaException{
		if(hora >= 00 && hora <= 23){
			this.hora = hora;
		} else {
			throw new HoraInvalidaException();
		}
	}

	public int getMinutos(){
		return minutos;
	}

	final public void setMinutos(int minutos) throws MinutosInvalidosException{
		if(minutos >= 00 && minutos <= 59){
			this.minutos = minutos;
		} else {
			throw new MinutosInvalidosException();
		}
	}
}