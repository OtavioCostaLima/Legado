package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.AnimalDAO;
import br.com.ti4b.modelo.Animal;

/**
 *
 * @author Otavio Costa
 */
public class AnimalRN {
    
    AnimalDAO animalDAO;
    
    public boolean cadastrar(Animal animal) {
        animalDAO = new AnimalDAO();
        return animalDAO.cadastrar(animal);
    }
    
    public boolean atualizar(Animal animal) {
        animalDAO = new AnimalDAO();
        return animalDAO.atualizar(animal);
    }
    
    public boolean deletar(long id) {
        animalDAO = new AnimalDAO();
        return animalDAO.deletar(id);
    }
    public boolean deletar(String idInstituicao) {
        animalDAO = new AnimalDAO();
        return animalDAO.deletarRegistro(idInstituicao);
    }
    
    public Animal buscarPorId(long id) {
        animalDAO = new AnimalDAO();
        return animalDAO.buscarPorId(id);
    }
    
    public java.util.List<Animal> buscarTodos() {
        animalDAO = new AnimalDAO();
        return animalDAO.buscarTodos();
    }
    
    public java.util.List<Animal> retornaAnimalPorQuery(String query) {
        animalDAO = new AnimalDAO();
        return animalDAO.retornaAnimalPorQuery(query);
    }
}
