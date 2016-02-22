/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Consulta;
import br.com.ti4b.modelo.Diagnostico;
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
public class DiagnosticoDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Diagnostico ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO diagnostico (cod_consulta, cod_doenca, data_diagnostico, informacao"
                    + ") VALUES(?,?,?,?)";
        }
        if (tipo == 2) {
            sql = "update diagnostico set cod_consulta=?, cod_doenca=?, data_diagnostico=?, informacao=? where cod_diagnostico=" + ch.getIdDiagnostico();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, ch.getIdConsulta());
            pst.setInt(2, ch.getIdDoenca());
            pst.setDate(3, ch.getData_diagnostico());
            pst.setString(4, ch.getInformacao());
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

    public List<Diagnostico> pesquisarDiagnostico(DefaultTableModel dtm, int descricao) {
        List<Diagnostico> listDiagnostico = new ArrayList<>();
        String sql = null;
        try {
            if (descricao == 1) {
                sql = "select di.cod_diagnostico,di.cod_consulta,di.cod_doenca,di.data_diagnostico,di.informacao,co.tipo_exame_encam,doe.descricao from diagnostico di\n"
                        + "join consulta co using (cod_consulta)\n"
                        + "join doenca doe using (cod_doenca)";
            } else if (descricao == 2) {
                sql = "select di.cod_diagnostico,di.cod_consulta,di.cod_doenca,di.data_diagnostico,di.informacao,co.tipo_exame_encam,doe.descricao from diagnostico di\n"
                        + "join consulta co using (cod_consulta)\n"
                        + "join doenca doe using (cod_doenca) where di.informacao='POSITIVO'";

            }

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Diagnostico diagnostico = new Diagnostico();
                diagnostico.setIdDiagnostico(rs.getInt("cod_diagnostico"));
                diagnostico.setIdConsulta(rs.getInt("cod_consulta"));
                diagnostico.setIdDoenca(rs.getInt("cod_doenca"));
                diagnostico.setData_diagnostico(rs.getDate("data_diagnostico"));
                diagnostico.setInformacao(rs.getString("informacao"));
                diagnostico.setTipoDeExame(rs.getString("tipo_exame_encam"));
                diagnostico.setNomeDoenca(rs.getString("descricao"));
                dtm.addRow(new Object[]{rs.getInt("cod_diagnostico"), rs.getString("tipo_exame_encam"), rs.getString("descricao"), rs.getDate("data_diagnostico"), rs.getString("informacao")});
                listDiagnostico.add(diagnostico);

            }
            conecta.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return listDiagnostico;
    }

    public void excluirDiagnostico(Diagnostico ch) {
        String sql = "delete from diagnostico where cod_diagnostico=" + ch.getIdDiagnostico();
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Deletado com sucesso!");
        } catch (SQLException e) {
            ch.setRetorno("Ocorreu um erro, tente novamente! " + e.getMessage());
            conecta.desconecta();
        }
    }

}
