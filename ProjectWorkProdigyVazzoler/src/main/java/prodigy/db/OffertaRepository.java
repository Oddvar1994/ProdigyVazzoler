package prodigy.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import prodigy.model.Offerta;

@Repository
public interface OffertaRepository extends CrudRepository<Offerta, Integer> {
	
	Offerta findByIdOfferta(Integer idOfferta);
	Offerta deleteByIdOfferta(Integer idOfferta);

}
