/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Doencas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GC
 */
public class DoencasDAO {
    
     ConectaBanco conecta = new ConectaBanco();
      
      public void Cadastrar(Doencas ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO doenca (descricao" + ") VALUES(?)";
        }
        if (tipo == 2) {
            sql = "update doenca set descricao=? where cod_doenca=" + ch.getCod_doenca();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, ch.getDescricao()); 
            pst.execute();
            pst.close();
            conecta.desconecta();
            if (tipo == 1) {
                ch.setRetorno("Cadastrado com sucesso!");
            } else {
                ch.setRetorno("Alterado com sucesso!");
            }

        } catch (SQLException e) {
              if (tipo == 1) {
                ch.setRetorno("Erro ao cadastrar!");

            } else {
                ch.setRetorno("Erro ao alterar!");
            }
            
            ch.setRetorno("Erro ao Alterar!");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        
        }
    }

    public void excluirDoenca(Doencas ch) {
        String sql = "delete from doenca where cod_doenca=" + ch.getCod_doenca();
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Deletado com sucesso!");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            ch.setRetorno("Erro ao Excluir");
            conecta.desconecta();
        }
    }
    
}


    



