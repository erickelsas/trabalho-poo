//Nome: Erick Elsas de Freitas - RA: 2347938 - Engenharia de Software
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCons extends javax.swing.JFrame {
    private static CadCons unicoCadCons;   
    private ExameFisico exFis = new ExameFisico();
    private Consulta cons = new Consulta();
    private Medico med = new Medico();
    private Paciente pac = new Paciente();
    private static BD_Pac bdPac = new BD_Pac();
    private static BD_Med bdMed = new BD_Med();
    private static BD_Cons bdCons = new BD_Cons();
    private static BD_ExFis bdExFis = new BD_ExFis();
    /**
     * Creates new form MenuMed
     */
    public static CadCons getCadCons(){
        if(unicoCadCons == null){
            unicoCadCons = new CadCons();
        }
        return unicoCadCons;
    }
    public CadCons() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelMed = new javax.swing.JLabel();
        cxMed = new javax.swing.JTextField();
        labelPac = new javax.swing.JLabel();
        cxPac = new javax.swing.JTextField();
        cxConsultaID = new javax.swing.JTextField();
        labelConsultaID = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();
        cxDia = new javax.swing.JTextField();
        labelAgendamento = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();
        cxMes = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        cxAno = new javax.swing.JTextField();
        labelHora = new javax.swing.JLabel();
        cxHora = new javax.swing.JTextField();
        labelMinutos = new javax.swing.JLabel();
        cxMinutos = new javax.swing.JTextField();
        labelExame = new javax.swing.JLabel();
        cxExame = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabCons = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelMed.setText("CPF MÉDICO");

        cxMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMedActionPerformed(evt);
            }
        });

        labelPac.setText("CPF PACIENTE");

        cxPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPacActionPerformed(evt);
            }
        });

        labelConsultaID.setText("CONSULTA ID");

        labelDia.setText("DIA");

        labelAgendamento.setText("AGENDAMENTO");

        labelMes.setText("MÊS");

        labelAno.setText("ANO");

        labelHora.setText("HORA");

        labelMinutos.setText("MINUTOS");

        labelExame.setText("EXAME ID");

        tabCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CONSULTA ID", "MÉDICO", "PACIENTE"
            }
        ));
        tabCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabConsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabCons);

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

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addComponent(labelAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelConsultaID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(labelMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxMed)
                            .addComponent(cxDia)
                            .addComponent(cxConsultaID)
                            .addComponent(cxAno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(labelPac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cxPac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(cxMes, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxExame)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultar)
                            .addComponent(btAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMed)
                    .addComponent(cxMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPac)
                    .addComponent(cxPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxConsultaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelConsultaID))
                        .addGap(18, 18, 18)
                        .addComponent(labelAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDia)
                            .addComponent(cxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMes)
                            .addComponent(cxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAno)
                            .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHora)
                            .addComponent(cxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMinutos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelExame)
                                .addComponent(cxExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btConsultar))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDeletar)
                            .addComponent(btAtualizar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair)
                            .addComponent(btLimpar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMedActionPerformed

    private void cxPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPacActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadCons();
        listaTab();        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        excluiConsId();
        listaTab();        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizaConsId();        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consConsId();        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    private void tabConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabConsMouseClicked
        selectTabCons();        // TODO add your handling code here:
    }//GEN-LAST:event_tabConsMouseClicked

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
            java.util.logging.Logger.getLogger(CadCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCons().setVisible(true);
            }
        });
    }
    
        public void selectTabCons(){
        String valLinTab = "";
        int posLin = tabCons.getSelectedRow();
          
        
        for(int coluna = 0;coluna < tabCons.getColumnCount(); coluna++ ){
            valLinTab += tabCons.getModel().getValueAt(posLin,coluna).toString();
            
            if(coluna < tabCons.getColumnCount()-1){
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
        DefaultTableModel modelo = (DefaultTableModel) tabCons.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Consulta cons : bdCons.getBdCons() ){
            modelo.insertRow(posLin, new Object[]{cons.getConsultaID(), cons.getMed().getCpf(), cons.getPac().getCpf()});
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
        cxMed.setText("");
        cxPac.setText("");
        cxConsultaID.setText("");
        cxDia.setText("");
        cxAno.setText("");
        cxMes.setText("");
        cxHora.setText("");
        cxMinutos.setText("");
        cxExame.setText("");
        cxMed.requestFocus();
    }
    
    public void cadCons(){
       pac = new Paciente();
       med = new Medico();
       exFis = new ExameFisico();
       int flag = 1;
       
       try{
           med.setCpf(cxMed.getText());
           cons.setMed(bdMed.consMedCod(med));
           pac.setCpf(cxPac.getText());
           cons.setPac(bdPac.consPacCod(pac));
           cons.setConsultaId(Integer.parseInt(cxConsultaID.getText()));
           exFis.setExameId(Integer.parseInt(cxExame.getText()));
           cons.setExFis(bdExFis.consExFisCod(exFis));
           flag = 0;
       } catch (CpfTamanhoException ex) {
            JOptionPane.showMessageDialog(null, "CPF deve ter 11 números!", "Erro!", 0);
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Data de Nascimento, número da rua, CEP, CTPS ou CRM devem ser compostos por números", "Erro!", 0);
        }
       
       if(flag == 0){
           cons = bdCons.cadCons(cons);
       } else {
           JOptionPane.showMessageDialog(null,
                   "Erro durante cadastro! Tente Novamente",
                   "Erro de cadastro", 0);
           return;
       }

       if(cons != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Consulta cadastrada com sucesso!",
                    "Cadastro Ok",
                    1
                );
                limpar();
       }
       else{
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe uma consulta com esse ID!",
                    "Erro de Cadastro",
                    0
                );
                limpar();
       }
    }
       
    public void excluiConsId(){
      cons = new Consulta();
      
      cons.setConsultaId(Integer.parseInt(cxConsultaID.getText()));

      
      cons = bdCons.removeConsCod(cons);
       
      if(cons == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Consulta EXCLUÍDA com sucesso!",
                    "Exclusão OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe uma consulta com esse ID",
                    "Erro de Excluasão",
                    0
                );
               
      }
      limpar();
    }
    
     public void atualizaConsId(){
      cons = new Consulta();
      
      cons.setConsultaId(Integer.parseInt(cxConsultaID.getText()));

      
      cons = bdCons.atualizaConsCod(cons);
       
      if(cons != null){
        cxMed.setText(cons.getMed().getCpf());
        cxPac.setText(cons.getPac().getCpf());
        cxConsultaID.setText(Integer.toString(cons.getConsultaID()));
        cxDia.setText(Integer.toString(cons.getDataConsulta().getDia()));
        cxMes.setText(Integer.toString(cons.getDataConsulta().getMes()));
        cxAno.setText(Integer.toString(cons.getDataConsulta().getAno()));
        cxHora.setText(Integer.toString(cons.getDataConsulta().getHora()));
        cxMinutos.setText(Integer.toString(cons.getDataConsulta().getMinutos()));
        cxExame.setText(Integer.toString(cons.getExFis().getExameId()));
                JOptionPane.showMessageDialog(
                    null,
                    "Consulta atualizada com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe uma consulta com esse ID",
                    "Erro de Alteração",
                    0
                );
               
      }
      limpar();
    }
     
   public void consConsId(){
      cons = new Consulta();
      
      cons.setConsultaId(Integer.parseInt(cxConsultaID.getText()));

      
      cons = bdCons.consConsCod(cons);  

       
      if(cons != null){
        cxMed.setText(cons.getMed().getCpf());
        cxPac.setText(cons.getPac().getCpf());
        cxConsultaID.setText(Integer.toString(cons.getConsultaID()));
        cxDia.setText(Integer.toString(cons.getDataConsulta().getDia()));
        cxMes.setText(Integer.toString(cons.getDataConsulta().getMes()));
        cxAno.setText(Integer.toString(cons.getDataConsulta().getAno()));
        cxHora.setText(Integer.toString(cons.getDataConsulta().getHora()));
        cxMinutos.setText(Integer.toString(cons.getDataConsulta().getMinutos()));
        cxExame.setText(Integer.toString(cons.getExFis().getExameId()));
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe uma consulta com este ID",
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
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxConsultaID;
    private javax.swing.JTextField cxDia;
    private javax.swing.JTextField cxExame;
    private javax.swing.JTextField cxHora;
    private javax.swing.JTextField cxMed;
    private javax.swing.JTextField cxMes;
    private javax.swing.JTextField cxMinutos;
    private javax.swing.JTextField cxPac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAgendamento;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelConsultaID;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelExame;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelMed;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelMinutos;
    private javax.swing.JLabel labelPac;
    private javax.swing.JTable tabCons;
    // End of variables declaration//GEN-END:variables
}
