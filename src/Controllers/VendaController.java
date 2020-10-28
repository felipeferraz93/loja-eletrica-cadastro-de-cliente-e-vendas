
package Controllers;

import Models.Produto;
import Models.Venda;
import Models.ProdutoOrcado;
import Utils.CurrencyFormatter;
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
    
    public List<Venda> list(String orcamento, String cliente, String cpf, String status) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            
            //stmt = con.prepareStatement("SELECT vendas.*, clientes.nome AS nome_cliente, usuarios.nome AS nome_vendedor FROM vendas INNER JOIN clientes on vendas.cliente_id = clientes.id INNER JOIN usuarios on vendas.vendedor_id = usuarios.id ORDER BY vendas.id DESC WHERE vendas.id LIKE '"+orcamento+"%' AND clientes.nome LIKE'"+cliente+"%' AND vendas.statusVenda='"+status+"'");
            stmt = con.prepareStatement("SELECT vendas.*, clientes.nome AS nome_cliente, usuarios.nome AS nome_vendedor FROM vendas INNER JOIN clientes on vendas.cliente_id = clientes.id INNER JOIN usuarios on vendas.vendedor_id = usuarios.id WHERE statusVenda LIKE '"+ status +"' AND vendas.id LIKE '"+orcamento+"%' AND clientes.nome LIKE'"+cliente+"%'ORDER BY vendas.id DESC");
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
            stmt.setString(4, "Orçamento");
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
    
    public void addProduto(Produto p, int quantidade, int venda_id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produtosOrcados(venda_id,produto_id,preco,quantidade) VALUES (?,?,?,?)");
            stmt.setString(1, Integer.toString(venda_id));
            stmt.setString(2, Integer.toString(p.getId()));
            stmt.setString(3, Double.toString(p.getPreco()));            
            stmt.setString(4, Integer.toString(quantidade));            
            stmt.executeUpdate();            

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<ProdutoOrcado> listProducts(int venda_id){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<ProdutoOrcado> produtos = new ArrayList<>();

        try {
            
            stmt = con.prepareStatement("SELECT produtosOrcados.*, produtos.nome AS produto_nome, produtos.id AS produto_id, produtos.unidade AS unidade FROM produtosOrcados INNER JOIN produtos on produtosOrcados.produto_id = produtos.id WHERE venda_id='"+ Integer.toString(venda_id)+"'");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutoOrcado p = new ProdutoOrcado();
                
                p.setProduto_id(rs.getInt("produto_id"));
                p.setName(rs.getString("produto_nome"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco(rs.getDouble("preco"));
                p.setPrecoTotal(rs.getDouble("preco")*rs.getDouble("quantidade"));
                p.setUnidade(rs.getString("unidade"));
                produtos.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;
    }
    
    public String totalProducts(int venda_id){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<ProdutoOrcado> produtos = new ArrayList<>();
        Double valorTotal=0.0;

        try {
            
            stmt = con.prepareStatement("SELECT * FROM produtosOrcados WHERE venda_id='"+ Integer.toString(venda_id)+"'");
            rs = stmt.executeQuery();

            while (rs.next()) {
                valorTotal = valorTotal + (rs.getDouble("preco")*rs.getDouble("quantidade"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        CurrencyFormatter formatar = new CurrencyFormatter();
        String precoString = formatar.real(valorTotal);

        return precoString;
    }
    
    public void updateStatus(int venda_id, String status){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
         try {
            stmt = con.prepareStatement("UPDATE vendas SET statusVenda = ? WHERE id = ?");
            stmt.setString(1, status);
            stmt.setString(2, Integer.toString(venda_id));
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
