/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Campanha;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GC
 */
public class CampanhaDAO {
    
    
    
        ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Campanha ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO campanha (cod_animal, cod_vacina, data_aplicacao, quant"
                    + ") VALUES(?,?,?,?)";
        }
        if (tipo == 2) {
            sql = "update campanha set cod_animal=?,cod_vacina=?,data_aplicacao=?,quant=? where cod_campanha = " + ch.getIdCampanha();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, ch.getCod_animal());
            pst.setInt(2, ch.getCod_vacina());
            pst.setDate(3, ch.getDataAplicacao());
            pst.setInt(4, ch.getQuantidade());
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
                ch.setRetorno("Erro ao Cadastrar!");
            } else {
                ch.setRetorno("Erro ao Alterar!");
            }

                 JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public List<Campanha> pesquisarCampanha(DefaultTableModel dtm) {
        List<Campanha> listCampanha = new ArrayList<>();
        try {
            String sql = null;

            sql = "select ca.cod_animal,ca.cod_campanha,ca.cod_vacina,ca.data_aplicacao,ca.quant,va.cod_vacina,va.descricao,a.nome from campanha ca \n" 
                  +"join animal a using(cod_animal)\n"
                    + "join vacina_obrigatoria va using(cod_vacina)";                   

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Campanha campanha = new Campanha();
                campanha.setIdCampanha(rs.getInt("cod_campanha"));
                campanha.setCod_animal(rs.getInt("cod_animal"));
                campanha.setCod_vacina(rs.getInt("cod_vacina"));
                campanha.setDataAplicacao(rs.getDate("data_aplicacao"));
                campanha.setQuantidade(rs.getInt("quant"));
                campanha.setNomeAnimal(rs.getString("Nome"));
                campanha.setDescricao(rs.getString("descricao"));
                
                
                dtm.addRow(new Object[]{rs.getInt("cod_campanha"), rs.getString("nome"), rs.getString("descricao"), rs.getDate("data_aplicacao"), rs.getInt("quant")});
                listCampanha.add(campanha);

            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return listCampanha;
    }


    public void excluirCampanha(Campanha ch) {
        String sql = "delete from campanha where cod_campanha=" + ch.getIdCampanha();
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
