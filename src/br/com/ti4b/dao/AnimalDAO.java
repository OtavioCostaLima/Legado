package br.com.ti4b.dao;

import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Animal;
import br.com.ti4b.util.ConexaoUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author HELBECY
 */
public class AnimalDAO extends DAOGenerico<Animal> {

    ConectaBanco conecta1 = new ConectaBanco();

    public List<Animal> retornaAnimalLeftSaida() {
        EntityManager em = ConexaoUtil.getEntityManager();
        String sql = "SELECT a FROM Animal a WHERE a not in (SELECT an FROM Saida s join s.animais an)";
        return em.createQuery(sql).getResultList();
    }

    /* public Ent_HistoricoReproducao retornaTudoAnimal(int codOrigem) {
     Ent_HistoricoReproducao ent_HistoricoReproducao = new Ent_HistoricoReproducao();
     String sql = "select a.cod_animal,a.nome as mae,fe.cod_fecundacao,p.quantidade_crias,p.cod_parto,p.data_parto,g.cod_gestacao,n.cod_nascimento,cu.pai,cu.cod_animal_mae,og.cod_origem,og.cod_for_animal from origem og\n"
     + "join nascimento n using(cod_nascimento) \n"
     + "join parto p using(cod_parto)\n"
     + "join gestacao g using(cod_gestacao)\n"
     + "join fecundacao fe using (cod_fecundacao)\n"
     + "join cruzamento cu using(cod_cruzamento)\n"
     + "join animal a on a.cod_animal=cu.cod_animal_mae where og.cod_origem=" + codOrigem;
     try {
     conecta1.conexao();
     PreparedStatement pst = conecta1.conn.prepareStatement(sql);
     ResultSet RS = pst.executeQuery();
     while (RS.next()) {
     ent_HistoricoReproducao.setIdFornecedor(RS.getInt("cod_for_animal"));
     ent_HistoricoReproducao.setIdNascimento(RS.getInt("cod_nascimento"));
     ent_HistoricoReproducao.setIdOrigem(RS.getInt("cod_origem"));
     ent_HistoricoReproducao.setIdFecundacao(RS.getInt("cod_fecundacao"));
     ent_HistoricoReproducao.setIdParto(RS.getInt("cod_parto"));
     ent_HistoricoReproducao.setQuantidadeCrias(RS.getInt("quantidade_crias"));
     ent_HistoricoReproducao.setIdGestacao(RS.getInt("cod_gestacao"));
     ent_HistoricoReproducao.setNome(RS.getString("mae"));
     ent_HistoricoReproducao.setPai(RS.getString("pai"));
     ent_HistoricoReproducao.setData_parto(RS.getDate("data_parto"));
    
     }
     conecta1.desconecta();
     } catch (SQLException sQLException) {
     JOptionPane.showMessageDialog(null, "erro:  " + sQLException.getMessage());
     conecta1.desconecta();
     }
     return ent_HistoricoReproducao;
     }*/
}
