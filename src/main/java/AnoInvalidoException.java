//Nome: Erick Elsas de Freitas - RA: 2347938

public class AnoInvalidoException extends Exception{
	public void impErro(){
		System.out.println("O ano deve ser um valor entre 1900 e 2022 [inclusos]!");
	}
}