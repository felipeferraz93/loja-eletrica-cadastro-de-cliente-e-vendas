
package Controllers;

import Models.Produto;
import Models.Venda;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class VendaController {
    public List<Venda> list() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            
            stmt = con.prepareStatement("SELECT vendas.*, clientes.nome AS nome_cliente, usuarios.nome AS nome_vendedor FROM vendas INNER JOIN clientes on vendas.cliente_id = clientes.id INNER JOIN usuarios on vendas.vendedor_id = usuarios.id ORDER BY vendas.id DESC");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();

                venda.setId(rs.getInt("id"));
                venda.setCliente_id(rs.getInt("cliente_id"));
                venda.setCliente_nome(rs.getString("nome_cliente"));
                venda.setVendedor_id(rs.getInt("vendedor_id"));
                venda.setVendedor_nome(rs.getString("nome_vendedor"));
                venda.setData_criacao(rs.getDate("dataCriacao").toString());
                venda.setStatus(rs.getString("statusVenda"));
                venda.setTipo_pagamento(rs.getString("tipoPagamento"));
                vendas.add(venda);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return vendas;
    }
    
    public void create(Venda v) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Calendar c = Calendar.getInstance();
        String dataAgora = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.DAY_OF_MONTH);
        //teste

        try {
            stmt = con.prepareStatement("INSERT INTO vendas (cliente_id,vendedor_id,dataCriacao,statusVenda,tipoPagamento,uuid) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, Integer.toString(v.getCliente_id()));
            stmt.setString(2, Integer.toString(v.getVendedor_id()));            
            stmt.setString(3, dataAgora);
            stmt.setString(4, "criada/orçamento");
            stmt.setString(5, "definir");
            stmt.setString(6, v.getUuid().toString());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Criado com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public int readUuid(String uuid) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;        

        int venda_id=0;

        try {
            stmt = con.prepareStatement("SELECT * FROM vendas WHERE uuid='" + uuid + "'");
            rs = stmt.executeQuery();
            rs.next();            
            venda_id = rs.getInt("id");  

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return venda_id;
    }
    
    public Venda read(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;                

        Venda venda = new Venda();

        try {
            stmt = con.prepareStatement("SELECT vendas.*, clientes.nome AS nome_cliente, usuarios.nome AS nome_vendedor FROM vendas INNER JOIN clientes on vendas.cliente_id = clientes.id INNER JOIN usuarios on vendas.vendedor_id = usuarios.id WHERE vendas.id=" + Integer.toString(id));
            rs = stmt.executeQuery();
            rs.next();            
            venda.setId(rs.getInt("id"));
            venda.setCliente_id(rs.getInt("cliente_id"));            
            venda.setCliente_nome(rs.getString("nome_cliente"));
            venda.setVendedor_id(rs.getInt("cliente_id"));            
            venda.setVendedor_nome(rs.getString("nome_vendedor"));
            venda.setTipo_pagamento(rs.getString("tipoPagamento"));            
            venda.setStatus(rs.getString("statusVenda"));
            venda.setDataCriacao(rs.getString("dataCriacao"));

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return venda;
    }
}
