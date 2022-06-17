package prodigy.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import prodigy.model.Preventivo;

@Repository
public interface PreventivoRepository extends CrudRepository<Preventivo, Integer> {
	
	Preventivo findByIdPreventivo(Integer idPreventivo);
	Preventivo deleteByIdPreventivo(Integer idPreventivo);

}
