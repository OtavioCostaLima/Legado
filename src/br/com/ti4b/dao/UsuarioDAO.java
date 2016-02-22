package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author StreamRead
 */
public class UsuarioDAO {

    ConectaBanco conectaBanco = new ConectaBanco();

    public void cadastrar(Usuario usuario) {
        try {
            String sql = "";

            sql = "INSERT INTO usuario (nome,nome_usuario,senha,previlegio) VALUES(?,?,?,?)";

            conectaBanco.conexao();
            PreparedStatement pst = conectaBanco.conn.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getNome_usuario());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getPrevilegio());
            pst.execute();
            conectaBanco.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar usuário! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletar(Usuario usuario) {
        try {
            String sql = "";

            sql = "delete from usuario where nome_usuario='" + usuario.getNome() + "'";

            conectaBanco.conexao();
            PreparedStatement pst = conectaBanco.conn.prepareStatement(sql);
            pst.execute();
            conectaBanco.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuário! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
