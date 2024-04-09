//Nome: Erick Elsas de Freitas - RA: 2347938

public class Pressao{
	private int faixaSisNorm;
	private int numDiastNorm;

	public Pressao(){
		faixaSisNorm = 0;
		numDiastNorm = 0;
	}

	public int getFaixaSisNorm(){
		return faixaSisNorm;
	}

	final public void setFaixaSisNorm(int faixaSisNorm){
		this.faixaSisNorm = faixaSisNorm;
	}

	public int getNumDiastNorm(){
		return numDiastNorm;
	}

	final public void setNumDiastNorm(int numDiastNorm){
		this.numDiastNorm = numDiastNorm;
	}
}	