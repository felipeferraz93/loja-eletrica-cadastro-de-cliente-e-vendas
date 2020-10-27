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
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class UI_Vendas_cliente extends javax.swing.JFrame {
    
    private static Usuario usuario;
    private int idUser;

    /**
     * Creates new form UI_Clientes
     */
    public UI_Vendas_cliente(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
        readJtable();
        
    }

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_clientes.getModel();

        modelo.setNumRows(0);
        ClienteController clientes = new ClienteController();

        for (Cliente c : clientes.list()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getEmail()

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
        tbl_clientes = new javax.swing.JTable();
        btn_novoCliente = new javax.swing.JButton();
        btn_novoCliente1 = new javax.swing.JButton();
        btn_novoCliente2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_pesquisaNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pesquisaCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pesquisaEmail = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_selecionaCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_cadastro_nome = new javax.swing.JTextField();
        txt_cadastro_dataNasc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cadastro_cpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cadastro_endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cadastro_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cadastro_tel = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_cadastro_cidade = new javax.swing.JTextField();
        txt_cadastro_estado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja Elétrica - Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "CPF", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clientes.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_clientes.setInheritsPopupMenu(true);
        tbl_clientes.setMinimumSize(new java.awt.Dimension(10, 0));
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);
        if (tbl_clientes.getColumnModel().getColumnCount() > 0) {
            tbl_clientes.getColumnModel().getColumn(0).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbl_clientes.getColumnModel().getColumn(1).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(2).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(3).setResizable(false);
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

        jLabel6.setText("Email:");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btn_selecionaCliente.setText("Selecionar Cliente P/ Orçamento");
        btn_selecionaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pesquisaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(180, 180, 180)
                                .addComponent(jLabel4)
                                .addGap(184, 184, 184)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane1))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_novoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_novoCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_selecionaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pesquisar)
                    .addComponent(txt_pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_pesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_pesquisaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novoCliente1)
                    .addComponent(btn_novoCliente)
                    .addComponent(btn_novoCliente2)
                    .addComponent(btn_selecionaCliente))
                .addGap(30, 30, 30))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - icon.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECIONE O CLIENTE");
        jLabel2.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jLabel5.setText("Nome:");

        txt_cadastro_nome.setEnabled(false);

        txt_cadastro_dataNasc.setEnabled(false);

        jLabel7.setText("Data de Nascimento:");

        jLabel8.setText("CPF:");

        txt_cadastro_cpf.setEnabled(false);

        jLabel9.setText("Endereço: ");

        txt_cadastro_endereco.setEnabled(false);

        jLabel10.setText("Email:");

        txt_cadastro_email.setEnabled(false);

        jLabel11.setText("Telefone:");

        txt_cadastro_tel.setEnabled(false);
        txt_cadastro_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadastro_telActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel12.setText("Cidade:");

        txt_cadastro_cidade.setEnabled(false);

        txt_cadastro_estado.setEnabled(false);

        jLabel13.setText("Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_cadastro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_cadastro_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_cadastro_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(332, 332, 332))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_cadastro_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cadastro_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_cadastro_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cadastro_email, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cadastro_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cadastro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cadastro_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_cadastro_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cadastro_tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadastro_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cadastro_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadastro_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadastro_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        Cliente c = new Cliente();
        ClienteController clienteController = new ClienteController();

        c.setNome(txt_cadastro_nome.getText());
        c.setCpf(txt_cadastro_cpf.getText());
        c.setEmail(txt_cadastro_email.getText());
        c.setCidade(txt_cadastro_cidade.getText());
        c.setEndereco(txt_cadastro_endereco.getText());
        c.setEstado(txt_cadastro_estado.getText());
        c.setTelefone(txt_cadastro_tel.getText());
        c.setDataNascimento(txt_cadastro_dataNasc.getText());
        c.setId(idUser);

        if (idUser == 0) {
            clienteController.create(c);

            txt_cadastro_nome.setText("");
            txt_cadastro_cpf.setText("");
            txt_cadastro_dataNasc.setText("");
            txt_cadastro_email.setText("");
            txt_cadastro_cidade.setText("");
            txt_cadastro_endereco.setText("");
            txt_cadastro_estado.setText("");
            txt_cadastro_tel.setText("");
            idUser = 0;
        } else {
            clienteController.update(c);
        }

        readJtable();

        tbl_clientes.setEnabled(true);
        txt_cadastro_nome.setEnabled(false);
        txt_cadastro_cpf.setEnabled(false);
        txt_cadastro_dataNasc.setEnabled(false);
        txt_cadastro_email.setEnabled(false);
        txt_cadastro_cidade.setEnabled(false);
        txt_cadastro_endereco.setEnabled(false);
        txt_cadastro_estado.setEnabled(false);
        txt_cadastro_tel.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setEnabled(false);
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        tbl_clientes.setEnabled(true);
        txt_cadastro_nome.setEnabled(false);
        txt_cadastro_cpf.setEnabled(false);
        txt_cadastro_dataNasc.setEnabled(false);
        txt_cadastro_email.setEnabled(false);
        txt_cadastro_cidade.setEnabled(false);
        txt_cadastro_endereco.setEnabled(false);
        txt_cadastro_estado.setEnabled(false);
        txt_cadastro_tel.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_cadastro_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadastro_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadastro_telActionPerformed

    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        int id = Integer.parseInt(tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(), 0).toString());
        idUser = id;
        ClienteController clienteController = new ClienteController();
        Cliente cliente = clienteController.read(id);

        txt_cadastro_nome.setText("");
        txt_cadastro_cpf.setText("");
        txt_cadastro_dataNasc.setText("");
        txt_cadastro_email.setText("");
        txt_cadastro_cidade.setText("");
        txt_cadastro_endereco.setText("");
        txt_cadastro_estado.setText("");
        txt_cadastro_tel.setText("");

        txt_cadastro_nome.setText(cliente.getNome());
        txt_cadastro_email.setText(cliente.getEmail());
        txt_cadastro_cpf.setText(cliente.getCpf());
        txt_cadastro_dataNasc.setText(cliente.getDataNascimento());
        txt_cadastro_cidade.setText(cliente.getCidade());
        txt_cadastro_endereco.setText(cliente.getEndereco());
        txt_cadastro_estado.setText(cliente.getEstado());
        txt_cadastro_tel.setText(cliente.getTelefone());
        id = cliente.getId();

        // JOptionPane.showMessageDialog(null,clienteController.read(id));
        //JOptionPane.showMessageDialog(null,tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(),1));
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbl_clientes.getModel();

        modelo.setNumRows(0);
        ClienteController clientes = new ClienteController();

        for (Cliente c : clientes.list(txt_pesquisaNome.getText(), txt_pesquisaCPF.getText(), txt_pesquisaEmail.getText())) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getEmail()

            });
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_novoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoCliente1ActionPerformed
        txt_cadastro_nome.setText("");
        txt_cadastro_cpf.setText("");
        txt_cadastro_dataNasc.setText("");
        txt_cadastro_email.setText("");
        txt_cadastro_cidade.setText("");
        txt_cadastro_endereco.setText("");
        txt_cadastro_estado.setText("");
        txt_cadastro_tel.setText("");
        idUser = 0;

        tbl_clientes.setEnabled(false);
        txt_cadastro_nome.setEnabled(true);
        txt_cadastro_cpf.setEnabled(true);
        txt_cadastro_dataNasc.setEnabled(true);
        txt_cadastro_email.setEnabled(true);
        txt_cadastro_cidade.setEnabled(true);
        txt_cadastro_endereco.setEnabled(true);
        txt_cadastro_estado.setEnabled(true);
        txt_cadastro_tel.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_salvar.setEnabled(true);

    }//GEN-LAST:event_btn_novoCliente1ActionPerformed

    private void btn_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoClienteActionPerformed
        if (idUser != 0) {
            tbl_clientes.setEnabled(false);
            txt_cadastro_nome.setEnabled(true);
            txt_cadastro_cpf.setEnabled(true);
            txt_cadastro_dataNasc.setEnabled(true);
            txt_cadastro_email.setEnabled(true);
            txt_cadastro_cidade.setEnabled(true);
            txt_cadastro_endereco.setEnabled(true);
            txt_cadastro_estado.setEnabled(true);
            txt_cadastro_tel.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_salvar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_novoClienteActionPerformed

    private void btn_novoCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoCliente2ActionPerformed
        ClienteController clienteController = new ClienteController();

        clienteController.delete(idUser);
        DefaultTableModel modelo = (DefaultTableModel) tbl_clientes.getModel();

        modelo.setNumRows(0);
        ClienteController clientes = new ClienteController();

        for (Cliente c : clientes.list(txt_pesquisaNome.getText(), txt_pesquisaCPF.getText(), txt_pesquisaEmail.getText())) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getEmail()

            });
        }
    }//GEN-LAST:event_btn_novoCliente2ActionPerformed

    private void btn_selecionaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionaClienteActionPerformed
        
        Venda v = new Venda();
        v.setCliente_id(idUser);
        v.setVendedor_id(usuario.getId());
        UUID uuid = UUID.randomUUID();
        v.setUuid(uuid.toString());
        
        VendaController vendaController = new VendaController();
        
        vendaController.create(v);
        
        int venda_id = vendaController.readUuid(uuid.toString());
        
        JOptionPane.showMessageDialog(null,venda_id);
        
        UI_Vendas_Itens ui__Vendas_Itens = new UI_Vendas_Itens(venda_id);
        ui__Vendas_Itens.setVisible(true);
        dispose();
        //função para abrir ui_vendas_itens
        
    }//GEN-LAST:event_btn_selecionaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Vendas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Vendas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Vendas_cliente(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novoCliente;
    private javax.swing.JButton btn_novoCliente1;
    private javax.swing.JButton btn_novoCliente2;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_cadastro_cidade;
    private javax.swing.JTextField txt_cadastro_cpf;
    private javax.swing.JTextField txt_cadastro_dataNasc;
    private javax.swing.JTextField txt_cadastro_email;
    private javax.swing.JTextField txt_cadastro_endereco;
    private javax.swing.JTextField txt_cadastro_estado;
    private javax.swing.JTextField txt_cadastro_nome;
    private javax.swing.JTextField txt_cadastro_tel;
    private javax.swing.JTextField txt_pesquisaCPF;
    private javax.swing.JTextField txt_pesquisaEmail;
    private javax.swing.JTextField txt_pesquisaNome;
    // End of variables declaration//GEN-END:variables
}
