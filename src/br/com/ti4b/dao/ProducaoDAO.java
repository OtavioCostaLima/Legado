/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Producao;
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
public class ProducaoDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Producao ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO producao (cod_materia, quant, data_producao"
                    + ") VALUES(?,?,?)";
        }
        if (tipo == 2) {
            sql = "update producao set cod_materia=?, quant=?, data_producao=? where cod_producao=" + ch.getCod_producao();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, ch.getCod_materia());
            pst.setInt(2, ch.getQuant());
            pst.setDate(3, ch.getData_producao());
            pst.execute();
            pst.close();
            conecta.desconecta();
            if (tipo == 1) {
                ch.setRetorno("Cadastrado com sucesso!");
            } else if (tipo == 2) {
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

    public List<Producao> pesquisarProducao(DefaultTableModel dtm, String classi) {
        List<Producao> listProducao = new ArrayList<>();
        try {
            String sql = "select cl.cod_classificacao,cl.descricao as categoria,ma.cod_materia,ma.descricao as materia_prima,pr.quant,pr.data_producao,pr.cod_producao from producao pr \n"
                    + "join materia_prima ma using(cod_materia)"
                    + "join classificacao cl using(cod_classificacao) where cl.descricao='" + classi + "'";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                Producao ep = new Producao();
                ep.setCod_classificacao(RS.getInt("cod_classificacao"));
                ep.setCod_materia(RS.getInt("cod_materia"));
                ep.setCod_producao(RS.getInt("cod_producao"));
                ep.setData_producao(RS.getDate("data_producao"));
                ep.setDescricao_materia(RS.getString("materia_prima"));
                ep.setCategoria(RS.getString("categoria"));
                ep.setQuant(RS.getInt("quant"));
                dtm.addRow(new Object[]{RS.getInt("cod_classificacao"), RS.getString("materia_prima"), RS.getString("categoria"), RS.getString("quant"), RS.getString("data_producao")});
                listProducao.add(ep);
            }
            conecta.desconecta();  // fecha conexão com BD
        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return listProducao;
    }

    public void excluirProducao(Producao ch) {
        String sql = "delete from campanha where cod_campanha=" + ch.getCod_producao();
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Deletado com sucesso!");
        } catch (SQLException e) {
            ch.setRetorno("Erro ao Deletar");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            conecta.desconecta();
        }
    }

}
