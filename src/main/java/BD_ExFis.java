//Nome: Erick Elsas de Freitas - RA: 2347938 - Engenharia de Software
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_ExFis {
    private ExameFisico exFis;
    public List<ExameFisico> bdExFis = new ArrayList<ExameFisico>();
    public int flag = 1;
             
    public List<ExameFisico> getBdExFis(){
        return bdExFis;
    }
    
    public ExameFisico consExFisCod(ExameFisico exFis){
        for(int i = 0; i < bdExFis.size(); i++){
			if(exFis.getExameId() == bdExFis.get(i).getExameId()){
				return bdExFis.get(i);
			}
		}
		return null;
    }
    
    public ExameFisico cadExFis(ExameFisico exFis){
        if(consExFisCod(exFis) == null){
            bdExFis.add(exFis);
            return exFis;
        } else {
            return null;
        }
    }
    
    public ExameFisico removeExFisCod(ExameFisico exFis){
                exFis = consExFisCod(exFis);
            	if(exFis != null){
                    bdExFis.remove(exFis);
                    return null;
		}
		else{
                    return exFis;
		}
    }
    
    	public ExameFisico atualizaExFisCod(ExameFisico exFis){
		for(int i = 0; i < bdExFis.size(); i++){
			if(exFis.getExameId() == bdExFis.get(i).getExameId()){
                            String text = JOptionPane.showInputDialog(null, "Informe a NOVA faixa sistólica normalizada!", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            exFis.getPres().setFaixaSisNorm(Integer.parseInt(text));
                            text = JOptionPane.showInputDialog(null, "Informe o NOVO número diastólico normalizado!", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            exFis.getPres().setNumDiastNorm(Integer.parseInt(text));
                            text = JOptionPane.showInputDialog(null, "Informe os NOVOS sintomas!", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            exFis.setSintomas(text);
                            text = JOptionPane.showInputDialog(null, "Informe as NOVAS observações!", "Atualização", JOptionPane.QUESTION_MESSAGE);
                            exFis.setObservacoes(text);
                         }
		}
                return null;
	}
}