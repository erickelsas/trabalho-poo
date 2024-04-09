//Nome: Erick Elsas de Freitas - RA: 2347938

public class Consulta{
	private Paciente pac;
	private Medico med;
	private int consultaID;
	private DataHora dataConsulta;
	private ExameFisico exFis;

	//POLIMORFISMO DE SOBRECARGA
	public Consulta(){
		pac = new Paciente();
		med = new Medico();
		consultaID = 0;
		dataConsulta = new DataHora();
		exFis = new ExameFisico();
	}
	
	public Consulta(Paciente pac, Medico med){
		this.pac = pac;
		this.med = med;
		consultaID = 0;
		dataConsulta = new DataHora();
		exFis = new ExameFisico();
	}

	public Consulta(Paciente pac, Medico med, ExameFisico exFis){
		this.pac = pac;
		this.med = med;
		consultaID = 0;
		dataConsulta = new DataHora();
		this.exFis = exFis;
	}

	public Paciente getPac(){
		return pac;
	}	

	final public void setPac(Paciente pac){
		this.pac = pac;
	}

	public Medico getMed(){
		return med;
	}

	final public void setMed(Medico med){
		this.med = med;
	}

	public int getConsultaID(){
		return consultaID;
	}

	final public void setConsultaId(int consultaID){
		this.consultaID = consultaID;
	}

	public DataHora getDataConsulta(){
		return dataConsulta;
	}

	final public void setDataConsulta(DataHora dataConsulta){
		this.dataConsulta = dataConsulta;	
	}

	public ExameFisico getExFis(){
		return exFis;
	}

	final public void setExFis(ExameFisico exFis){
		this.exFis = exFis;
	}
} 