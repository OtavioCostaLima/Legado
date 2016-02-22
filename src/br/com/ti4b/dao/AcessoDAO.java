package br.com.ti4b.dao;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Usuario;
import br.com.ti4b.visao.telas.MenuPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Otavio Costa
 */
public class AcessoDAO  {
    
    Usuario login = new Usuario();
    ConectaBanco conecta = new ConectaBanco();
    ConverterDatas cd = new ConverterDatas();
    
    public void acesso() {
        
        try {
            Calendar c = Calendar.getInstance();
            cd.converterHora(c);
            login.setData(cd.CalendarForDate(c));
            String sql = "INSERT INTO acesso (nome_usuario,data_acesso,hora_acesso) VALUES(?,?,?)";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, login.getNome_usuario());
            pst.setDate(2, login.getData());
            pst.setTime(3, cd.converterHora(c));
            pst.execute();
            sql = "select cod_acesso from acesso where nome_usuario=? and data_acesso=? and hora_acesso=?";
            pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, login.getNome_usuario());
            pst.setDate(2, login.getData());
            pst.setTime(3, cd.converterHora(c));
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                login.setCod_acesso(rs.getInt("cod_acesso"));
                rs.close();
            } else {
            }
            
            pst.execute();
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro metodo de acesso!  " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void entrar(Usuario ent_Login) {
        
        String sql = "select nome, nome_usuario,previlegio from usuario where usuario.nome_usuario=? and usuario.senha=?";
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, ent_Login.getNome_usuario());
            pst.setString(2, ent_Login.getSenha());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                login.setNome(rs.getString("nome"));
                login.setNome_usuario(rs.getString("nome_usuario"));
                login.setPrevilegio(rs.getString("previlegio"));
                acesso();
                MenuPrincipal m = new MenuPrincipal();
                m.setVisible(true);
                m.retornaUsuario(login);
                ent_Login.setRetorno("ok");
                rs.close();
                conecta.desconecta();
                
            } else {
                ent_Login.setRetorno("not");
                conecta.desconecta();
            }
        } catch (SQLException e) {
            ent_Login.setRetorno("erro");
            JOptionPane.showMessageDialog(null, "Erro no metodo de entrada! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public List<Usuario> listarUsuario(DefaultTableModel dtm) {
        List<Usuario> list = new ArrayList<>();
        String sql = "select nome, nome_usuario,previlegio,senha from usuario";
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                login.setNome(rs.getString("nome"));
                login.setNome_usuario(rs.getString("nome_usuario"));
                login.setPrevilegio(rs.getString("previlegio"));
                login.setSenha(rs.getString("senha"));
                dtm.addRow(new Object[]{rs.getString("nome"), rs.getString("nome_usuario"), rs.getString("previlegio"), rs.getString("senha")});
                list.add(login);
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de entrada! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            
        }
        return list;
    }
    
    public void sair(Usuario login) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat horas = new SimpleDateFormat("HH:mm:ss");
        String hor = horas.format(c.getTime());
        String sql = "update acesso set hora_fim_acesso=? where cod_acesso=?";
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setTime(1, Time.valueOf(hor));
            pst.setInt(2, login.getCod_acesso());
            pst.execute();
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de seair! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void logKill() {
        String sql = "delete from acesso where cod_acesso>0";
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "Logs removidos com Sucesso!", "INFORMAÇÃO!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de seair! " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
