/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;

import br.com.ti4b.modelo.Consulta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GC
 */
public class ConsultaDAO {

    ConectaBanco conecta = new ConectaBanco();

    public void Cadastrar(Consulta ch, int tipo) {
        String sql = null;
        if (tipo == 1) {
            sql = "INSERT INTO consulta (cod_animal, crmv, data_consulta, tipo_exame_encam, informacao"
                    + ") VALUES(?,?,?,?,?)";
        }
        if (tipo == 2) {
            sql = "update consulta set cod_animal=?, crmv=?, data_consulta=?, tipo_exame_encam=?,informacao=? where cod_consulta=" + ch.getCod_consulta();
        }
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, ch.getCod_animal());
            pst.setString(2, ch.getCrmv());
            pst.setDate(3, ch.getData_consulta());
            pst.setString(4, ch.getTipo_exame_encam());
            pst.setString(5, ch.getInformacao());
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
            } else if (tipo == 2) {
                ch.setRetorno("Erro ao Alterar!");
            }
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluir(Consulta ch) {
        String sql = "delete from consulta where cod_consulta=" + ch.getCod_consulta();
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conecta.desconecta();
            ch.setRetorno("Deletado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            ch.setRetorno("Erro ao Deletar!");
            conecta.desconecta();
        }
    }

}
