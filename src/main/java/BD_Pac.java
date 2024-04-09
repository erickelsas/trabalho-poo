//Nome: Erick Elsas de Freitas - RA: 2437938 - Engenharia de Software
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Pac {
    private Paciente pac;
    public List<Paciente> bdPac = new ArrayList<Paciente>();
    public int flag = 1;
            
    public List<Paciente> getBdPac(){
        return bdPac;
    }
    
    public Paciente consPacCod(Paciente pac){
        for(int i = 0; i < bdPac.size(); i++){
			if(pac.getCpf().equals(bdPac.get(i).getCpf())){
				return bdPac.get(i);
			}
		}
		return null;
    }
    
    public Paciente cadPac(Paciente pac){
        if(consPacCod(pac) == null){
            bdPac.add(pac);
            return pac;
        } else {
            return null;
        }
    }
    
    public Paciente removePacCod(Paciente pac){
                pac = consPacCod(pac);
            	if(pac != null){
                    bdPac.remove(pac);
                    return null;
		}
		else{
                    return pac;
		}
    }
    
	public Paciente atualizaPacCod(Paciente pac){
		for(int i = 0; i < bdPac.size(); i++){
			if(pac.getCpf().equals(bdPac.get(i).getCpf())){
                            String text = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.setNome(text);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO nome da rua", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.getEnd().setNome(text);
                            do{
                               try {
                                   flag = 1;
                                   text = JOptionPane.showInputDialog(null, "Informe o NOVO número da casa", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                   pac.getEnd().setNum(Integer.parseInt(text));
                                   flag = 0;
                                } 
                                catch (NumNegException ex) {
                                    JOptionPane.showMessageDialog(null, "Rua deve ter um valor positivo!");
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Rua deve ser um valor num[érico!");
                                }
                                
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO complemento", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.getEnd().setCompl(text);
                            text = JOptionPane.showInputDialog(null, "Informe a NOVA cidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.getEnd().setCidade(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO estado", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    pac.getEnd().setEstado(text);
                                    flag = 0;
                                }
                                catch(EstadoTamanhoException ete){
                                    JOptionPane.showMessageDialog(null, "Estado deve ter DOIS caracteres!!");
                                }
                                catch(EstadoCaracterException ece){
                                        JOptionPane.showMessageDialog(null, "Estado deve conter apenas letras!");
                                }
                            } while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO país", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.getEnd().setPais(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO CEP", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    pac.getEnd().setCep(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(CepTamanhoException cte){
                                    JOptionPane.showMessageDialog(null, "CEP deve ter 9 caracteres!");
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "CEP deve ser um valor numérico!");
                                }
                            } while(flag != 0);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO DDD", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    pac.getTel().setDdd(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO Telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    pac.getTel().setTel(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(DddTamanhoException dte){
                                    JOptionPane.showMessageDialog(null, "DDD deve ter 2 caracteres!");
                                }
                                catch(TelefoneTamanhoException tte){
                                    JOptionPane.showMessageDialog(null, "Telefone deve ter 9 caracteres!");   
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "DDD e Telefone devem ser valores numéricos!");
                                }
                                    
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO email", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            pac.setEmail(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO código do SUS", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    pac.setSus(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Código do SUS deve ser valores numéricos!");
                                }
                            }while(flag != 0);
                            
                            bdPac.set(i, pac);  
                            return bdPac.get(i);
			}
		}
                return null;
	}
}
