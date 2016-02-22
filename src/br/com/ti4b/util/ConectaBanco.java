package br.com.ti4b.util;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private final String drive = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/fazenda";
    private final String usuario = "postgres";
    private final String senha = "root";
    public Connection conn;

    public void conexao() {
        try {

            System.setProperty("jdbc.Drivers", drive);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //        JOptionPane.showMessageDialog(null, "Banco Conectado com Sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão !!!\nError: " + ex.getMessage());
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecSQL !!!\nError: " + ex.getMessage());
        }
    }

    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar ah Conexão !!!\nError: " + ex.getMessage());
        }
    }
}
