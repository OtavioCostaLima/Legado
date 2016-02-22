/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.MateriaPrima;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GC
 */
public class MateriaPrimaDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(MateriaPrima ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO materia_prima (descricao"
                    + ") VALUES(?)";
        }
        if (tipo == 2) {
            //update
        }

        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, ch.getDescricao());
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Cadastrado com sucesso!");
        } catch (SQLException e) {
            ch.setRetorno("Erro ao Cadastrar!");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<MateriaPrima> retornaMateriaPrima() {
        List<MateriaPrima> mat = new ArrayList<>();
                String sql = "select * from materia_prima";
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                MateriaPrima ent_MateriaPrima = new MateriaPrima();
                ent_MateriaPrima.setCod_Materia(rs.getInt("cod_materia"));
                ent_MateriaPrima.setDescricao(rs.getString("descricao"));
                mat.add(ent_MateriaPrima);
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);

        }
        return mat;
    }

    public int retornaCod_Materia(String descricao) {
        int dec = 0;
        try {
            String sql = "select * from materia_prima where descricao='" + descricao + "'";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dec = rs.getInt("cod_materia");
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return dec;
    }

    public List<MateriaPrima> retornaMateria(String descricao) {
         List<MateriaPrima> mat = new ArrayList<>();
        try {
            String sql = "select cl.descricao,ma.descricao as ma from materia_prima ma \n"
                    + "join classificacao cl using(cod_classificacao) where cl.descricao='"+descricao+"'";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                MateriaPrima emp = new MateriaPrima();
               emp.setDescricao(rs.getString("ma"));
               mat.add(emp);
            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return mat;
    }
}
