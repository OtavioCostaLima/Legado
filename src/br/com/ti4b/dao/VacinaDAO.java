/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Vacinas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hyllorran
 */
public class VacinaDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Vacinas ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO vacina_obrigatoria (descricao, n_licitacao, lab_fabricante, lote, periodo_aplicacao, quant, preco_unit,data_validade"
                    + ") VALUES(?,?,?,?,?,?,?,?)";
        }
        if (tipo == 2) {
            sql = "update vacina_obrigatoria set descricao=?,n_licitacao=?,lab_fabricante=?,lote=?,periodo_aplicacao=?,quant=?,preco_unit=?,data_validade=? where cod_vacina = " + ch.getCod_vacina();
        }
        try {

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, ch.getDescricao());
            pst.setInt(2, ch.getN_licitacao());
            pst.setString(3, ch.getLab_fabricante());
            pst.setInt(4, ch.getLote());
            pst.setString(5, ch.getPeriodo_aplicacao());
            pst.setInt(6, ch.getQuant());
            pst.setDouble(7, ch.getPreco_unit());
            pst.setDate(8, (Date) ch.getData_validade());
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

    public List<Vacinas> pesquisarVacinas(DefaultTableModel dtm) {
        List<Vacinas> listVacinas = new ArrayList<>();
        try {
            String sql = null;

            sql = "select * from vacina_obrigatoria";

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vacinas vacinas = new Vacinas();
                vacinas.setCod_vacina(rs.getInt("cod_vacina"));
                vacinas.setDescricao(rs.getString("descricao"));
                vacinas.setN_licitacao(rs.getInt("n_licitacao"));
                vacinas.setLab_fabricante(rs.getString("lab_fabricante"));
                vacinas.setLote(rs.getInt("lote"));
                vacinas.setPeriodo_aplicacao(rs.getString("periodo_aplicacao"));
                vacinas.setQuant(rs.getInt("quant"));
                vacinas.setPreco_unit(rs.getFloat("preco_unit"));
                vacinas.setData_validade(rs.getDate("data_validade"));
                dtm.addRow(new Object[]{rs.getInt("cod_vacina"), rs.getString("descricao"), rs.getInt("n_licitacao"), rs.getString("lab_fabricante"), rs.getInt("lote"), rs.getString("periodo_aplicacao"), rs.getInt("quant"), rs.getFloat("preco_unit"), rs.getDate("data_validade")});
                listVacinas.add(vacinas);

            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return listVacinas;
    }
    
    
    public void excluirVacinas(Vacinas ch) {
        String sql = "delete from vacina_obrigatoria where cod_vacina=" + ch.getCod_vacina();
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
