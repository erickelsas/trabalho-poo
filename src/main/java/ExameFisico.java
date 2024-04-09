public class ExameFisico{
	private Enfermeiro enf;
	private Paciente pac;
	private int exameID;
	private Pressao pres;
	private String sintomas;
	private String observacoes;

	//POLIMORFISMO DE SOBRECARGA
	public ExameFisico(){
		enf = new Enfermeiro();
		pac = new Paciente();
		exameID = 0;
		pres = new Pressao();
		sintomas = "";
		observacoes = "";
	}

	public ExameFisico(Enfermeiro enf, Paciente pac){
		this.enf = enf;
		this.pac = pac;
		exameID = 0;
		pres = new Pressao();
		sintomas = "";
		observacoes = "";
	}

	public ExameFisico(Paciente pac, Enfermeiro enf){
		this.enf = enf;
		this.pac = pac;
		exameID = 0;
		pres = new Pressao();
		sintomas = "";
		observacoes = "";
	}

	public Enfermeiro getEnf(){
		return enf;
	}

	final public void setEnf(Enfermeiro enf){
		this.enf = enf;
	}

	public Paciente getPac(){
		return pac;
	}

	final public void setPac(Paciente pac){
		this.pac = pac;
	}

	public int getExameId(){
		return exameID;
	}

	final public void setExameId(int exameID){
		this.exameID = exameID;
	}

	public Pressao getPres(){
		return pres;
	}

	final public void setPres(Pressao pres){
		this.pres = pres;
	}

	public String getSintomas(){
		return sintomas;
	}

	final public void setSintomas(String sintomas){
		this.sintomas = sintomas;
	}

	public String getObservacoes(){
		return observacoes;
	}

	final public void setObservacoes(String observacoes){
		this.observacoes = observacoes;
	}

	final public boolean buscaId(int exameID){
		if(exameID == getExameId()){
			return true;
		} else {
			return false;
		}
	}
}