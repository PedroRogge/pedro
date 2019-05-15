package sp.senac.br.pedro.repositories;

import org.springframework.data.repository.CrudRepository;
import sp.senac.br.pedro.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
