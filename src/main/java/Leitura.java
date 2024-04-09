//Nome: Erick Elsas de Freitas - RA: 2347938

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
	public String entDados(String s){
		String r = "";
		
		System.out.println(s);
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);

		try{
			r = cd.readLine();
		}
		catch(IOException e){
			System.out.println("\nErro na entrada de dados!");
		}
		return r;
	}
}