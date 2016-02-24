/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Medicamentos;
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
 * @author HELBECY
 */
public class MedicamentosDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar_Medicamentos(Medicamentos ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO medicamento (descricao,eficacia,quant,preco_unit, data_validade"
                    + ") VALUES(?,?,?,?,?)";
        }
        if (tipo == 2) {
            sql = "update medicamento set descricao=?,eficacia=?,quant=?,preco_unit=?,data_validade=? where cod_medicamento = " + ch.getCod_medicamento();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, ch.getDesricao());
            pst.setString(2, ch.getEficacia());
            pst.setInt(3, ch.getQuant());
            pst.setFloat(4, ch.getPreco_unit());
            pst.setDate(5, (Date) ch.getData_validade());
            pst.execute();
            pst.close();
            conecta.desconecta();
            if (tipo == 1) {
                ch.setRetorno("Cadastrado com Sucesso!");
            } else {
                ch.setRetorno("Alterado com Sucesso!");
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

    public List<Medicamentos> pesquisarMedicamentos(DefaultTableModel dtm) {
        List<Medicamentos> listMedicamentos = new ArrayList<>();
        try {
            String sql = null;

            sql = "select * from medicamento";

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Medicamentos medicamentos = new Medicamentos();
                medicamentos.setCod_medicamento(rs.getInt("cod_medicamento"));
                medicamentos.setDesricao(rs.getString("descricao"));
                medicamentos.setEficacia(rs.getString("eficacia"));
                medicamentos.setQuant(rs.getInt("quant"));
                medicamentos.setPreco_unit(rs.getFloat("preco_unit"));
                medicamentos.setData_validade(rs.getDate("data_validade"));
                dtm.addRow(new Object[]{rs.getInt("cod_medicamento"), rs.getString("descricao"), rs.getString("eficacia"), rs.getInt("quant"), rs.getInt("preco_unit"), rs.getDate("data_validade")});
                listMedicamentos.add(medicamentos);

            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return listMedicamentos;
        
    }

    public void excluirMedicamentos(Medicamentos ch) {
        String sql = "delete from medicamento where cod_medicamento=" + ch.getCod_medicamento();
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
