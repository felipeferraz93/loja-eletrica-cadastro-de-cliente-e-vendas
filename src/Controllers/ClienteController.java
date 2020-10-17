package Controllers;

import Models.Cliente;
import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteController {

    public void create(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        //teste

        try {
            stmt = con.prepareStatement("INSERT INTO clientes (nome,cpf,email) VALUES (?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public List<Cliente> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                
                clientes.add(cliente);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
        
        
    }

    

}
