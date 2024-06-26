//Nome: Erick Elsas de Freitas - RA: 2347938 - Engenharia de Software
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadEx extends javax.swing.JFrame {
    private static CadEx unicoCadEx;   
    private ExameFisico exFis = new ExameFisico();
    private Enfermeiro enf = new Enfermeiro();
    private Paciente pac = new Paciente();
    private static BD_Pac bdPac = new BD_Pac();
    private static BD_Enf bdEnf = new BD_Enf();
    private static BD_ExFis bdExFis = new BD_ExFis();
    /**
     * Creates new form MenuMed
     */
    public static CadEx getCadEx(){
        if(unicoCadEx == null){
            unicoCadEx = new CadEx();
        }
        return unicoCadEx;
    } 
    
    public CadEx() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEnfermeiro = new javax.swing.JLabel();
        cxEnfermeiro = new javax.swing.JTextField();
        labelPaciente = new javax.swing.JLabel();
        cxPaciente = new javax.swing.JTextField();
        cxExame = new javax.swing.JTextField();
        labelExame = new javax.swing.JLabel();
        labelFaixa = new javax.swing.JLabel();
        cxFaixa = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        cxNumero = new javax.swing.JTextField();
        labelDadosExame = new javax.swing.JLabel();
        labelSintomas = new javax.swing.JLabel();
        cxSintomas = new javax.swing.JTextField();
        labelObservacoes = new javax.swing.JLabel();
        cxObservacoes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabExFis = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelEnfermeiro.setText("CPF ENFERMEIRO");

        cxEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEnfermeiroActionPerformed(evt);
            }
        });

        labelPaciente.setText("CPF PACIENTE");

        labelExame.setText("EXAME ID");

        labelFaixa.setText("FAIXA SIS NORM");

        labelNumero.setText("NÚMERO DIS NORM");

        labelDadosExame.setText("DADOS EXAME");

        labelSintomas.setText("SINTOMAS");

        labelObservacoes.setText("OBSERVAÇÕES");

        tabExFis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EXAME ID", "CPF ENFERMEIRO", "CPF PACIENTE"
            }
        ));
        tabExFis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabExFisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabExFis);

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btDeletar.setText("DELETAR");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(labelDadosExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelExame, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxExame, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnfermeiro)
                    .addComponent(cxEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPaciente)
                    .addComponent(cxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExame)
                    .addComponent(cxExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelDadosExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFaixa)
                    .addComponent(cxFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSintomas)
                    .addComponent(cxSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObservacoes)
                    .addComponent(cxObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSair)
                        .addComponent(btLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDeletar)
                            .addComponent(btConsultar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadExFis();
        listaTab();// TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        excluiExFisId();
        listaTab();        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizaExFisId();        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consExFisId();        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    private void tabExFisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabExFisMouseClicked
        selectTabExFis();        // TODO add your handling code here:
    }//GEN-LAST:event_tabExFisMouseClicked

    private void cxEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEnfermeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEnfermeiroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEx().setVisible(true);
            }
        });
    }
    
            public void selectTabExFis(){
        String valLinTab = "";
        int posLin = tabExFis.getSelectedRow();
          
        
        for(int coluna = 0;coluna < tabExFis.getColumnCount(); coluna++ ){
            valLinTab += tabExFis.getModel().getValueAt(posLin,coluna).toString();
            
            if(coluna < tabExFis.getColumnCount()-1){
               valLinTab += " - ";
            }
            
            
        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: "+ valLinTab,
                "Seleção na tabela",
                1
        );
    }
        
    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabExFis.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(ExameFisico exFis : bdExFis.getBdExFis() ){
            modelo.insertRow(posLin, new Object[]{exFis.getExameId(), exFis.getEnf().getCpf(), exFis.getPac().getCpf()});
            posLin++;
        }
    }
        
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair?",
                    "Saida",
                    JOptionPane.YES_NO_OPTION
                  );
        if(resp == 0){
            dispose();
        }
    }

    public void limpar(){
        cxEnfermeiro.setText("");
        cxPaciente.setText("");
        cxExame.setText("");
        cxFaixa.setText("");
        cxNumero.setText("");
        cxObservacoes.setText("");
        cxSintomas.setText("");
        cxEnfermeiro.requestFocus();
    }
    
    public void cadExFis(){
       pac = new Paciente();
       enf = new Enfermeiro();
       exFis = new ExameFisico();
       int flag = 1;
       
       try{
           enf.setCpf(cxEnfermeiro.getText());
           exFis.setEnf(bdEnf.consEnfCod(enf));
           pac.setCpf(cxPaciente.getText());
           exFis.setPac(bdPac.consPacCod(pac));
           exFis.setExameId(Integer.parseInt(cxExame.getText()));
           exFis.getPres().setFaixaSisNorm(Integer.parseInt(cxFaixa.getText()));
           exFis.getPres().setNumDiastNorm(Integer.parseInt(cxNumero.getText()));
           exFis.setObservacoes(cxObservacoes.getText());
           exFis.setSintomas(cxSintomas.getText());
           flag = 0;
       } catch (CpfTamanhoException ex) {
            JOptionPane.showMessageDialog(null, "CPF deve ter 11 números!", "Erro!", 0);
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Data de Nascimento, número da rua, CEP, CTPS ou CRM devem ser compostos por números", "Erro!", 0);
        }
       
       if(flag == 0){
           exFis = bdExFis.cadExFis(exFis);
       } else {
           JOptionPane.showMessageDialog(null,
                   "Erro durante cadastro! Tente Novamente",
                   "Erro de cadastro", 0);
           return;
       }

       if(exFis != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Exame cadastrado com sucesso!",
                    "Cadastro Ok",
                    1
                );
                limpar();
       }
       else{
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe um exame com esse ID!",
                    "Erro de Cadastro",
                    0
                );
                limpar();
       }
    }
       
    public void excluiExFisId(){
      exFis = new ExameFisico();
      
      exFis.setExameId(Integer.parseInt(cxExame.getText()));

      
      exFis = bdExFis.removeExFisCod(exFis);
       
      if(exFis == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Exame EXCLUÍDA com sucesso!",
                    "Exclusão OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um exame com esse ID!",
                    "Erro de Excluasão",
                    0
                );
               
      }
      limpar();
    }
    
     public void atualizaExFisId(){
      exFis = new ExameFisico();
      
      exFis.setExameId(Integer.parseInt(cxExame.getText()));

      
      exFis = bdExFis.atualizaExFisCod(exFis);
       
      if(exFis != null){
        cxEnfermeiro.setText(exFis.getEnf().getCpf());
        cxPaciente.setText(exFis.getPac().getCpf());
        cxExame.setText(Integer.toString(exFis.getExameId()));
        cxFaixa.setText(Integer.toString(exFis.getPres().getFaixaSisNorm()));
        cxNumero.setText(Integer.toString(exFis.getPres().getNumDiastNorm()));
        cxSintomas.setText(exFis.getSintomas());
        cxObservacoes.setText(exFis.getObservacoes());
                JOptionPane.showMessageDialog(
                    null,
                    "Exame atualizado com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um Exame com esse ID",
                    "Erro de Alteração",
                    0
                );
               
      }
      limpar();
    }
     
   public void consExFisId(){
      exFis = new ExameFisico();
      
      exFis.setExameId(Integer.parseInt(cxExame.getText()));

      
      exFis = bdExFis.consExFisCod(exFis);  

       
      if(exFis != null){
        cxEnfermeiro.setText(exFis.getEnf().getCpf());
        cxPaciente.setText(exFis.getPac().getCpf());
        cxExame.setText(Integer.toString(exFis.getExameId()));
        cxFaixa.setText(Integer.toString(exFis.getPres().getFaixaSisNorm()));
        cxNumero.setText(Integer.toString(exFis.getPres().getNumDiastNorm()));
        cxSintomas.setText(exFis.getSintomas());
        cxObservacoes.setText(exFis.getObservacoes());
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um exame com este ID",
                    "Erro de Consulta",
                    0
                );
                limpar();
      }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxEnfermeiro;
    private javax.swing.JTextField cxExame;
    private javax.swing.JTextField cxFaixa;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxObservacoes;
    private javax.swing.JTextField cxPaciente;
    private javax.swing.JTextField cxSintomas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDadosExame;
    private javax.swing.JLabel labelEnfermeiro;
    private javax.swing.JLabel labelExame;
    private javax.swing.JLabel labelFaixa;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelObservacoes;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel labelSintomas;
    private javax.swing.JTable tabExFis;
    // End of variables declaration//GEN-END:variables
}
