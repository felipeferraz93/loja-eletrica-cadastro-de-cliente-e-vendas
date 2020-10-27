/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Cliente;
import Models.Usuario;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class UsuarioController {

    public Usuario read(String login, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        Usuario usuario = new Usuario();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE login = ? AND senha = ?");
            //stmt = con.prepareStatement("SELECT * FROM usuarios WHERE login = " + login + "  && senha = "+senha);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                usuario.setNome(rs.getString("nome"));
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
            };

        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuario;

    }

}
