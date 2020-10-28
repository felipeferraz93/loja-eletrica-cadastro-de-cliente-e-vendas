/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.ClienteController;
import Controllers.VendaController;
import Models.Cliente;
import Models.Usuario;
import Models.Venda;
import Utils.DataFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class UI_Vendas_Orcamentos extends javax.swing.JFrame {

    private int idUser;
    private static Usuario vendedor;
    /**
     * Creates new form UI_Clientes
     */
    public UI_Vendas_Orcamentos(Usuario vendedor) {
        this.vendedor = vendedor;
        initComponents();
        setLocationRelativeTo(null);
        readJtable();
        atualizaCbStatus();
        
    }
    
    public void atualizaCbStatus(){
        String[] status = { "Todos","Orçamento","Fechado / A Pagar", "Pago / Separação Estoque","Finalizada"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(status);
        cb_status.setModel(model);
        cb_status.setSelectedIndex(0);
        
        //statusList.addActionListener();
                
    }

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_orcamentos.getModel();

        modelo.setNumRows(0);
        VendaController vendas = new VendaController();
        
        DataFormatter d = new DataFormatter();
        
        

        for (Venda v : vendas.list()) {
            String data = d.dataBrasil(v.getData_criacao());
            
            modelo.addRow(new Object[]{
                v.getId(),
                v.getCliente_nome(),
                data, // METODO A SER ALTERADO
                v.getVendedor_nome(),
                v.valorTotal(),
                v.getStatus()
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_orcamentos = new javax.swing.JTable();
        btn_novoCliente = new javax.swing.JButton();
        btn_novoCliente1 = new javax.swing.JButton();
        btn_novoCliente2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_pesquisaNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pesquisaCPF = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        txt_pesquisaOrcamento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        Status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja Elétrica - Vendas");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        tbl_orcamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Orçamento", "Cliente", "Data", "Vendedor", "Total", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_orcamentos.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_orcamentos.setInheritsPopupMenu(true);
        tbl_orcamentos.setMinimumSize(new java.awt.Dimension(10, 0));
        tbl_orcamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_orcamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_orcamentos);
        if (tbl_orcamentos.getColumnModel().getColumnCount() > 0) {
            tbl_orcamentos.getColumnModel().getColumn(0).setResizable(false);
            tbl_orcamentos.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbl_orcamentos.getColumnModel().getColumn(1).setResizable(false);
            tbl_orcamentos.getColumnModel().getColumn(2).setResizable(false);
            tbl_orcamentos.getColumnModel().getColumn(3).setResizable(false);
            tbl_orcamentos.getColumnModel().getColumn(4).setResizable(false);
            tbl_orcamentos.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_novoCliente.setText("Editar");
        btn_novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoClienteActionPerformed(evt);
            }
        });

        btn_novoCliente1.setText("Novo");
        btn_novoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoCliente1ActionPerformed(evt);
            }
        });

        btn_novoCliente2.setText("Excluir");
        btn_novoCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoCliente2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel4.setText("CPF:");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        jLabel14.setText("N° Orçamento:");

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Status.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_pesquisaOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(176, 176, 176)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_pesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_pesquisar))
                            .addComponent(Status))
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(btn_novoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_novoCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(Status, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pesquisaOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pesquisar)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novoCliente1)
                    .addComponent(btn_novoCliente)
                    .addComponent(btn_novoCliente2))
                .addGap(20, 20, 20))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - icon.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORÇAMENTOS E VENDAS");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(182, 182, 182)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_orcamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_orcamentosMouseClicked
        int id = Integer.parseInt(tbl_orcamentos.getValueAt(tbl_orcamentos.getSelectedRow(), 0).toString());
        idUser = id;
        
        
//        ClienteController clienteController = new ClienteController();
//        Cliente cliente = clienteController.read(id);
//
//        
//        id = cliente.getId();

        // JOptionPane.showMessageDialog(null,clienteController.read(id));
        //JOptionPane.showMessageDialog(null,tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(),1));
    }//GEN-LAST:event_tbl_orcamentosMouseClicked

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbl_orcamentos.getModel();

        modelo.setNumRows(0);
        VendaController vendas = new VendaController();
        
        String status;
        if(cb_status.getSelectedItem().toString().equals("Todos")){
            status="%";
        }else{
            status = cb_status.getSelectedItem().toString();
        }
        

        for (Venda v : vendas.list(txt_pesquisaOrcamento.getText(),txt_pesquisaNome.getText(),txt_pesquisaCPF.getText(),status)) {
            DataFormatter d = new DataFormatter();
            String data = d.dataBrasil(v.getData_criacao());
            
            modelo.addRow(new Object[]{
                v.getId(),
                v.getCliente_nome(),
                data, // METODO A SER ALTERADO
                v.getVendedor_nome(),
                v.valorTotal(),
                v.getStatus()
            });
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_novoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoCliente1ActionPerformed
        
        UI_Vendas_cliente ui_vendas_cliente = new UI_Vendas_cliente(vendedor);
        ui_vendas_cliente.setVisible(true);
        

    }//GEN-LAST:event_btn_novoCliente1ActionPerformed

    private void btn_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoClienteActionPerformed
        if (idUser != 0) {
           UI_Vendas_Itens ui_Vendas_Itens = new UI_Vendas_Itens((idUser));
           ui_Vendas_Itens.setVisible(true);            
        }
    }//GEN-LAST:event_btn_novoClienteActionPerformed

    private void btn_novoCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoCliente2ActionPerformed
        
    }//GEN-LAST:event_btn_novoCliente2ActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Vendas_Orcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_Orcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_Orcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_Orcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Vendas_Orcamentos(vendedor).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton btn_novoCliente;
    private javax.swing.JButton btn_novoCliente1;
    private javax.swing.JButton btn_novoCliente2;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_orcamentos;
    private javax.swing.JTextField txt_pesquisaCPF;
    private javax.swing.JTextField txt_pesquisaNome;
    private javax.swing.JTextField txt_pesquisaOrcamento;
    // End of variables declaration//GEN-END:variables
}
