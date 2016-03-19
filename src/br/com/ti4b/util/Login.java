package br.com.ti4b.util;

import br.com.ti4b.modelo.Usuario;
import br.com.ti4b.visao.telas.MenuPrincipal;
import java.awt.HeadlessException;
import java.sql.SQLException;

/**
 *
 * @author Otavio Costa
 */
public class Login {

    Usuario usuario = new Usuario();
    ConectaBanco banco = new ConectaBanco();

    public Login(Usuario usuario) {
        String sql = ("select * from usuario where nome='" + usuario.getNome() + "' and senha='" + usuario.getSenha() + "'");
        try {
            banco.conexao();
            banco.executaSQL(sql);
            if (banco.rs.next()) {
                usuario.setPrevilegio(banco.rs.getString("previlegio"));
                MenuPrincipal m = new MenuPrincipal();
                m.setVisible(true);
              //  m.retornaUsuario(usuario);
                usuario.setRetorno("Login Efetuado com Sucesso!");
            } else {
                usuario.setRetorno("Usuário não Encontrado!");
            }
        } catch (SQLException | HeadlessException ex) {
            Mensagens.mensagensDeErro(2, ex);

        } finally {
            banco.desconecta();
        }

    }

}
