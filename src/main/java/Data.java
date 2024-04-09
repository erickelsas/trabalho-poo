//Nome: Erick Elsas de Freitas - RA: 2347938

import java.util.GregorianCalendar;

public class Data{
	private int dia;
	private int mes;
	private int ano;

	public Data(){
		dia = 0;
		mes = 0;
		ano = 0;
	}

	public int getDia(){
		return dia;
	}

	final public void setDia(int dia) throws DiaInvalidoException{
		if(dia >= 1 && dia <= 31){
			this.dia = dia;
		} else {
			throw new DiaInvalidoException();
		}
	}

	public int getMes(){
		return mes;
	}

	final public void setMes(int mes) throws MesInvalidoException{
		if(mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			throw new MesInvalidoException();
		}
	}

	public int getAno(){
		return ano;
	}

	final public void setAno(int ano) throws AnoInvalidoException{
		if(ano >= 1900 && ano <= 2022){
			this.ano = ano;
		} else {
			throw new AnoInvalidoException();
		}
	}

	final public void dataCad(){
		GregorianCalendar data = new GregorianCalendar();
		dia = data.get(data.DAY_OF_MONTH);
		mes = data.get(data.MONTH)+1;
		ano = data.get(data.YEAR);
	}
}