package prodigy.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import prodigy.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	Cliente findByIdCliente(Integer idCliente);
	Cliente deleteByIdCliente(Integer idCliente);
}
