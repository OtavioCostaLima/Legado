/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Consumo;
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
public class ConsumoDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Consumo ch, int tipo, int cv) {
        String sql = null;

        if (tipo == 1) {

            if (cv == 1) {
                sql = "INSERT INTO consumo (cod_classificacao,cod_concentrado,quantidade,data_consumo"
                        + ") VALUES(?,?,?,?)";
            } else if (cv == 2) {
                sql = "INSERT INTO consumo (cod_classificacao,cod_volumoso,quantidade,data_consumo"
                        + ") VALUES(?,?,?,?)";
            }
        }
        if (tipo == 2) {

            if (cv == 1) {
                sql = "update consumo set cod_classificacao=?,cod_concentrado=?,quantidade=?,data_consumo=? where cod_consumo=" + ch.getCod_Consumo();
            }
            if (cv == 2) {
                sql = "update consumo set cod_classificacao=?,cod_volumoso=?,quantidade=?,data_consumo=? where cod_consumo=" + ch.getCod_Consumo();
            }
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, ch.getCod_Classificacao());
            if (cv == 1) {
                pst.setInt(2, ch.getCod_Concentrado());
            } else if (cv == 2) {
                pst.setInt(2, ch.getCod_Volumoso());
            }

            pst.setDouble(3, ch.getQuantidade());
            pst.setDate(4, ch.getData_Consumo());
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

    public void excluirConsumo(Consumo ch) {
        String sql = "delete from consumo where cod_consumo=" + ch.getCod_Consumo();
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Deletado com sucesso!");
        } catch (SQLException e) {
            ch.setRetorno("Erro ao Deletar!");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            conecta.desconecta();
        }
    }

    public List<Consumo> pesquisa_consumo(int cod) {
        List<Consumo> listConsumo = new ArrayList<>();
        try {
            String sql = "select * from consumo where cod_consumo='" + cod;
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Consumo ent_Consumo = new Consumo();
                ent_Consumo.setCod_Classificacao(rs.getInt("cod_classificacao"));
                ent_Consumo.setCod_Concentrado(rs.getInt("cod_concentrado"));
                ent_Consumo.setCod_Consumo(rs.getInt("cod_consumo"));
                ent_Consumo.setCod_Volumoso(rs.getInt("cod_volumoso"));
                ent_Consumo.setData_Consumo(rs.getDate("data_consumo"));
                ent_Consumo.setQuantidade(rs.getInt("quant_concentrado"));
                listConsumo.add(ent_Consumo);
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return listConsumo;
    }

    public List<Consumo> pesquisa_consumo(DefaultTableModel dtm, int tipo) {
        List<Consumo> listConsumo = new ArrayList<>();
        String sql = null;
        try {
            if (tipo == 1) {
                sql = "SELECT co.cod_consumo,co.cod_classificacao,co.cod_concentrado,"
                        + "co.quantidade,co.data_consumo,cl.descricao as categoria,con.descricao as alimento"
                        + " FROM consumo co"
                        + " join classificacao cl using(cod_classificacao)"
                        + " join concentrado con using(cod_concentrado)";
            }
            if (tipo == 2) {
                sql = "SELECT co.cod_consumo, co.cod_classificacao, co.cod_volumoso,"
                        + "co.quantidade,co.data_consumo,cl.descricao as categoria,vo.descricao as alimento"
                        + " FROM consumo co"
                        + " join classificacao cl using(cod_classificacao)"
                        + " join volumoso vo using(cod_volumoso)";
            }
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Consumo ent_Consumo = new Consumo();
                ent_Consumo.setCategoria(rs.getString("categoria"));
                ent_Consumo.setDescricao(rs.getString("alimento"));
                ent_Consumo.setCod_Classificacao(rs.getInt("cod_classificacao"));
                ent_Consumo.setCod_Consumo(rs.getInt("cod_consumo"));
                ent_Consumo.setData_Consumo(rs.getDate("data_consumo"));
                ent_Consumo.setQuantidade(rs.getInt("quantidade"));
                if (tipo == 1) {
                    ent_Consumo.setCod_Concentrado(rs.getInt("cod_concentrado"));
                    dtm.addRow(new Object[]{rs.getString("cod_consumo"), rs.getString("alimento"), rs.getString("quantidade"), rs.getString("data_consumo"), rs.getString("categoria")});
                }
                if (tipo == 2) {
                    ent_Consumo.setCod_Volumoso(rs.getInt("cod_volumoso"));
                    dtm.addRow(new Object[]{rs.getString("cod_consumo"), rs.getString("alimento"), rs.getString("quantidade"), rs.getString("data_consumo"), rs.getString("categoria")});
                }

                listConsumo.add(ent_Consumo);
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return listConsumo;
    }

}
