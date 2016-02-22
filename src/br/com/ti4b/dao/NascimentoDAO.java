package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Nascimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NascimentoDAO {

    ConectaBanco conecta = new ConectaBanco();

    public int trataNascimento(Nascimento nasci, int tipo) {
        int codNascimento = 0;
        try {
            if (tipo == 1) {
                String sql = "select cod_nascimento from nascimento where cod_instituicao=" + nasci.getCod_instituicao();
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement(sql);
                ResultSet RS = pst.executeQuery();
                while (RS.next()) {
                    codNascimento = RS.getInt("cod_nascimento");
                }
                if (codNascimento == 0) {
                    codNascimento = cadastrarNascimento(nasci, tipo);
                } else {
                    JOptionPane.showMessageDialog(null, "NASCIMENTO JÁ ESTÁ CADASTRADO!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                }
                //alterar
            } else if (tipo == 2) {
                codNascimento = cadastrarNascimento(nasci, tipo);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na Funcao trata Nascimento\nErro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        conecta.desconecta();
        return codNascimento;

    }

    public int cadastrarNascimento(Nascimento nasci, int tipo) {
        int codNascimento = 0;
        String sql = null;
        try {
            if (tipo == 1) {
                sql = "insert into nascimento (cod_parto,cod_instituicao,peso_nascer,peso_desmama,cir_testicular) values (?,?,?,?,?)";
            } else if (tipo == 2) {
                sql = "update nascimento set cod_parto=?,cod_instituicao=?,peso_nascer=?,peso_desmama=?,cir_testicular=? where cod_nascimento=" + nasci.getCod_nascimento();
            }
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, nasci.getCod_parto());
            pst.setInt(2, nasci.getCod_instituicao());
            pst.setFloat(3, nasci.getPeso_nasc());
            pst.setFloat(4, nasci.getPeso_desmana());
            pst.setFloat(5, nasci.getCircunferencia_testicular());
            pst.executeUpdate();
            try {
                sql = "select cod_nascimento from nascimento where cod_instituicao=" + nasci.getCod_instituicao();
                pst = conecta.conn.prepareStatement(sql);
                ResultSet RS = pst.executeQuery();
                while (RS.next()) {
                    codNascimento = RS.getInt("cod_nascimento");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro na Funcao Nascimento\nErro: " + e.getMessage());
            }
            if (tipo == 1) {
                nasci.setRetorno("Cadastrado com Sucesso!");
            } else if (tipo == 2) {
                nasci.setRetorno("Alterado com Sucesso!");
            }
            conecta.desconecta();
        } catch (SQLException ex) {
            if (tipo == 1) {
                nasci.setRetorno("Erro ao Cadastrar!");
            } else if (tipo == 2) {
                nasci.setRetorno("Erro ao Alterar!");
            }
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Nascimento\nErro: " + ex.getMessage());
        }

        return codNascimento;
    }

    public List<Nascimento> listaFornecerdor(int tipoDeConsulta) {
        List<Nascimento> List = new ArrayList<>();
        try {
            String sql = null;

            sql = "select * from fornecedor_animal f where f.info='outros'";

            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                Nascimento eho = new Nascimento();
                eho.setCod_instituicao(RS.getInt("cod_for_animal"));
                eho.setCod_parto(RS.getInt("cod_for_animal"));
                eho.setCod_nascimento(RS.getInt("cod_for_animal"));
                eho.setPeso_desmana(RS.getInt("cod_for_animal"));
                eho.setPeso_nasc(RS.getInt("cod_for_animal"));
                eho.setCircunferencia_testicular(RS.getInt("cod_for_animal"));
                List.add(eho);
            }
        } catch (SQLException e) {
        }
        return List;
    }

    public void excluirNascimento(int cod) {
        try {
            String sql = "delete from nascimento where cod_nascimento=" + cod;
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.executeUpdate();
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir nascimeto\nErro: " + ex.getMessage());
        }

    }
}
