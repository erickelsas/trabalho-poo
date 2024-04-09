//Nome: Erick Elsas de Freitas - RA: 2437938 - Engenharia de Software
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Enf {
    private Enfermeiro enf;
    public List<Enfermeiro> bdEnf = new ArrayList<Enfermeiro>();
    public int flag = 1;
            
    public List<Enfermeiro> getBdEnf(){
        return bdEnf;
    }
    
    public Enfermeiro consEnfCod(Enfermeiro enf){
        for(int i = 0; i < bdEnf.size(); i++){
			if(enf.getCpf().equals(bdEnf.get(i).getCpf())){
				return bdEnf.get(i);
			}
		}
		return null;
    }
    
    public Enfermeiro cadEnf(Enfermeiro enf){
        if(consEnfCod(enf) == null){
            bdEnf.add(enf);
            return enf;
        } else {
            return null;
        }
    }
    
    public Enfermeiro removeEnfCod(Enfermeiro enf){
                enf = consEnfCod(enf);
            	if(enf != null){
                    bdEnf.remove(enf);
                    return null;
		}
		else{
                    return enf;
		}
    }
    
	public Enfermeiro atualizaEnfCod(Enfermeiro enf){
		for(int i = 0; i < bdEnf.size(); i++){
			if(enf.getCpf().equals(bdEnf.get(i).getCpf())){
                            String text = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            enf.setNome(text);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO nome da rua", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            enf.getEnd().setNome(text);
                            do{
                               try {
                                   flag = 1;
                                   text = JOptionPane.showInputDialog(null, "Informe o NOVO número da casa", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                   enf.getEnd().setNum(Integer.parseInt(text));
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
                            enf.getEnd().setCompl(text);
                            text = JOptionPane.showInputDialog(null, "Informe a NOVA cidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            enf.getEnd().setCidade(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO estado", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    enf.getEnd().setEstado(text);
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
                            enf.getEnd().setPais(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO CEP", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    enf.getEnd().setCep(Integer.parseInt(text));
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
                                    enf.getTel().setDdd(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO Telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    enf.getTel().setTel(Integer.parseInt(text));
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
                            enf.setEmail(text);
                            do{
                                try{
                                    flag = 1;
                                    text = JOptionPane.showInputDialog(null, "Informe a NOVA carteira de trabalho", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    enf.setCtps(Integer.parseInt(text));
                                    flag = 0;
                                }
                                catch(CtpsTamanhoException cte){
                                    JOptionPane.showMessageDialog(null, "CTPS deve ter 8 caracteres!");
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "CTPS deve ser um valor numérico!");
                                }
                            }while(flag != 0);
                            do{
                                try{
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO salário", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    enf.setSalario(Float.parseFloat(text));
                                }
                                catch(SalarioMinException sme){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor maior que 1212!");
                                }
                                catch(NumberFormatException nfe){
                                    JOptionPane.showMessageDialog(null, "Salário deve ser um valor numérico!");
                                }
                            }while(flag != 0);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO grau de formação", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            enf.setGrauForm(text);
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO setor hospitalar", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            enf.setSetorHosp(text);
                      
                            bdEnf.set(i, enf);  
                            return bdEnf.get(i);
			}
		}
                return null;
	}
        
    public Enfermeiro reajustaEnf(Enfermeiro enf){
        enf = consEnfCod(enf);
        if(enf != null){
            String resp = JOptionPane.showInputDialog(null, "Informe a PORCENTAGEM do reajuste (0 para Reajuste Automatico)", "Reajuste", JOptionPane.QUESTION_MESSAGE);
            Float porc = Float.parseFloat(resp);
           
            if(porc == 0){
                enf.reajustaSal();
            } else {
                enf.reajustaSal(porc);
            }
            return enf;
        }
        
        return null;
    }
}
