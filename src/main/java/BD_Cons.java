//Nome: Erick Elsas de Freitas - RA: 2347938 - Engenharia de Software
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Cons {
    private Consulta cons;
    public List<Consulta> bdCons = new ArrayList<Consulta>();
    public int flag = 1;
             
    public List<Consulta> getBdCons(){
        return bdCons;
    }
    
    public Consulta consConsCod(Consulta cons){
        for(int i = 0; i < bdCons.size(); i++){
			if(cons.getConsultaID() == bdCons.get(i).getConsultaID()){
				return bdCons.get(i);
			}
		}
		return null;
    }
    
    public Consulta cadCons(Consulta cons){
        if(consConsCod(cons) == null){
            bdCons.add(cons);
            return cons;
        } else {
            return null;
        }
    }
    
    public Consulta removeConsCod(Consulta cons){
                cons = consConsCod(cons);
            	if(cons != null){
                    bdCons.remove(cons);
                    return null;
		}
		else{
                    return cons;
		}
    }
    
    	public Consulta atualizaConsCod(Consulta cons){
		for(int i = 0; i < bdCons.size(); i++){
			if(cons.getConsultaID() == bdCons.get(i).getConsultaID()){
                            do{
                                try{
                                    flag = 1;
                                    String text = JOptionPane.showInputDialog(null, "Informe o NOVO dia", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    cons.getDataConsulta().setDia(Integer.parseInt(text)); 
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO mês", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    cons.getDataConsulta().setMes(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO ano", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    cons.getDataConsulta().setDia(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe a NOVA hora", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    cons.getDataConsulta().setHora(Integer.parseInt(text));
                                    text = JOptionPane.showInputDialog(null, "Informe o NOVO minuto", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                    cons.getDataConsulta().setMinutos(Integer.parseInt(text));
                                    flag = 0;
                                } catch (DiaInvalidoException ex) {
                                    JOptionPane.showMessageDialog(null, "Dia deve ser um valor entre 1 e 31!");
                                } catch (MesInvalidoException ex) {
                                    JOptionPane.showMessageDialog(null, "Mês deve ser um valor entre 1 e 12");
                                } catch (HoraInvalidaException ex) {
                                    JOptionPane.showMessageDialog(null, "Hora deve ser um valor entre 00 e 23!");
                                } catch (MinutosInvalidosException ex) {
                                   JOptionPane.showMessageDialog(null, "Minutos deve ser um valor entre 0 e 59!");
                                }
                            } while(flag != 0);  
                        }
		}
                return null;
	}
}