/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacao;
<<<<<<< HEAD

/**
 *
 * @author Positivo
 */
public class telaListarEvento extends javax.swing.JFrame {

    /**
     * Creates new form telaListarEvento
     */
    public telaListarEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
=======
import modelo.Evento;
import dao.EventoDAO;
import dao.DAOFactory;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class telaListarEvento extends javax.swing.JFrame {

    EventoDAO eventoDAO = DAOFactory.criarEventoDAO();
     DefaultTableModel modeloEvento = null;
     
    public telaListarEvento() {
        initComponents();
        modeloEvento = (DefaultTableModel) tblEvento.getModel();
    }
    private void preencherTabelaEvento() {
    // Limpa os dados da tabela
    modeloEvento.setRowCount(0);  // Usar setRowCount é mais seguro do que getDataVector().clear()

    try {
        // Obtém a lista de pessoas
        List<Evento> eventos = eventoDAO.listar();
       

        // Adiciona as pessoas na tabela
        for (Evento evento : eventos) {
            modeloEvento.addRow(new Object[]{
                evento.getEndereco().getCep(), // Exibe o CEP do endereço
                evento.getEndereco().getRua(), // Exibe a Rua do endereço
                evento.getEndereco().getBairro(), 
                evento.getEnderecoId(),
                evento.getNome(),
                evento.getData(),
                evento.getHorario(),
            });
        }

        // Notifica que os dados mudaram
        //modeloEvento.fireTableDataChanged();

    } catch (Exception e) {
        e.printStackTrace();  // Ajuda a visualizar o erro
        throw e;
    }
}
    

>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        jTable1 = new javax.swing.JTable();
=======
        tblEvento = new javax.swing.JTable();
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
        btnInserirEvento = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

<<<<<<< HEAD
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Bairro", "Rua", "Referência", "Data", "Horário"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
=======
        tblEvento.setBackground(new java.awt.Color(204, 204, 204));
        tblEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Referência", "Bairro", "Rua", "Data", "Horário"
            }
        ));
        tblEvento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEventoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblEvento);
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7

        btnInserirEvento.setText("Inserir");
        btnInserirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirEventoActionPerformed(evt);
            }
        });

        btnEditar1.setText("Editar");

        btnEditar.setText("Detalhes");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnInserir.setText("Excluir");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnInserirEvento)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirEvento)
                    .addComponent(btnEditar1)
                    .addComponent(btnEditar)
                    .addComponent(btnInserir)
                    .addComponent(btnCancelar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       new exibirParticipantes().setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInserirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirEventoActionPerformed
       this.dispose();
       new telaEvento().setVisible(true);
    }//GEN-LAST:event_btnInserirEventoActionPerformed

<<<<<<< HEAD
=======
    private void tblEventoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEventoFocusGained
        preencherTabelaEvento();
    }//GEN-LAST:event_tblEventoFocusGained

>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
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
            java.util.logging.Logger.getLogger(telaListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaListarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnInserirEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< HEAD
    private javax.swing.JTable jTable1;
=======
    private javax.swing.JTable tblEvento;
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
    // End of variables declaration//GEN-END:variables
}
