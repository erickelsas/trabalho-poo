//Nome: Erick Elsas de Freitas - RA: 2437938 - Engenharia de Software
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Med {
    private Medico med;
    public List<Medico> bdMed = new ArrayList<Medico>();
    public int flag = 1;
            
    public List<Medico> getBdMed(){
        return bdMed;
    }
    
    public Medico consMedCod(Medico med){
        for(int i = 0; i < bdMed.size(); i++){
			if(med.getCpf().equals(bdMed.get(i).getCpf())){
				return bdMed.get(i);
			}
		}
		return null;
    }
    
    public Medico reajustaMed(Medico med){
        med = consMedCod(med);
        if(med != null){
            String resp = JOptionPane.showInputDialog(null, "Informe a PORCENTAGEM do reajuste (0 para Reajuste Automatico)", "Reajuste", JOptionPane.QUESTION_MESSAGE);
            Float porc = Float.parseFloat(resp);
           
            if(porc == 0){
                med.reajustaSal();
            } else {
                med.reajustaSal(porc);
            }
            return med;
        }
        
        return null;
    }
    
    public Medico cadMed(Medico med){
        if(consMedCod(med) == null){
            bdMed.add(med);
            return med;
        } else {
            return null;
        }
    }
    
    public Medico removeMedCod(Medico med){
                med = consMedCod(med);
            	if(med != null){
                    bdMed.remove(med);
                    return null;
		}
		else{
                    return med;
		}
    }
    
	public Medico atualizaMedCod(Medico med){
		for(int i = 0; i < bdMed.size(); i++){
			if(med.getCpf().equals(bdMed.get(i).getCpf())){
                            String text = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.setNome(text);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO nome da rua", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.getEnd().setNome(text);
                            do{
                               try {
                                   flag = 1;
                                   text = JOptionPane.showInputDialog(null, "Informe o NOVO número da casa", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                   med.getEnd().setNum(Integer.parseInt(text));
                                   flag = 0;
                                } 
                                catch (NumNegException ex) {
                                    JOptionPane.showMessageDialog(null, "Rua deve ter um valor positivo!", "Erro!", 0);
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Rua deve ser um valor num[érico!", "Erro!", 0);
                                }
                                
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO complemento", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.getEnd().setCompl(text);
                            text = JOptionPane.showInputDialog(null, "Informe a NOVA cidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.getEnd().setCidade(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO estado", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getEnd().setEstado(text);
                                    flag = 0;
                                }
                                catch(EstadoTamanhoException ete){
                                    JOptionPane.showMessageDialog(null, "Estado deve ter DOIS caracteres!!", "Erro!", 0);
                                }
                                catch(EstadoCaracterException ece){
                                        JOptionPane.showMessageDialog(null, "Estado deve conter apenas letras!", "Erro!", 0);
                                }
                            } while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO país", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.getEnd().setPais(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO CEP", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getEnd().setCep(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(CepTamanhoException cte){
                                    JOptionPane.showMessageDialog(null, "CEP deve ter 9 caracteres!", "Erro!", 0);
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "CEP deve ser um valor numérico!", "Erro!", 0);
                                }
                            } while(flag != 0);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO DDD", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getTel().setDdd(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO Telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getTel().setTel(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(DddTamanhoException dte){
                                    JOptionPane.showMessageDialog(null, "DDD deve ter 2 caracteres!", "Erro!", 0);
                                }
                                catch(TelefoneTamanhoException tte){
                                    JOptionPane.showMessageDialog(null, "Telefone deve ter 9 caracteres!", "Erro!", 0);   
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "DDD e Telefone devem ser valores numéricos!", "Erro!", 0);
                                }
                                    
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO email", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.setEmail(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe a NOVA carteira de trabalho", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.setCtps(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(CtpsTamanhoException cte){
                                    JOptionPane.showMessageDialog(null, "CTPS deve ter 8 caracteres!", "Erro!", 0);
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "CTPS deve ser um valor numérico!", "Erro!", 0);
                                }
                            }while(flag != 0);
                            do{
                                try{
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO salário", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.setSalario(Float.parseFloat(text));
                                }
                                catch(SalarioMinException sme){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor maior que 1212!", "Erro!", 0);
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor numérico!", "Erro!", 0);
                                }
                            }while(flag != 0);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe a NOVA CRM", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getCrm().setNum(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO estado da CRM", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    med.getCrm().setEstado(text);
                                    flag = 0;
                                }
                                catch(CrmTamanhoException cte){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor maior que R$1212!", "Erro!", 0);
                                }
                                catch(EstadoTamanhoException ete){
                                    JOptionPane.showMessageDialog(null, "Estado deve ter DOIS caracteres!!", "Erro!", 0);
                                }
                                catch(EstadoCaracterException ece){
                                        JOptionPane.showMessageDialog(null, "Estado deve conter apenas letras!", "Erro!", 0);
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor numérico!", "Erro!", 0);
                                }
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe a NOVA especialização", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            med.setEspec(text);
                      
                            bdMed.set(i, med);  
                            return bdMed.get(i);
			}
		}
                return null;
	}
}
