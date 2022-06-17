package prodigy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prodigy.db.OffertaRepository;
import prodigy.model.Offerta;


@Service
public class OffertaService {
	
	@Autowired
	OffertaRepository offertaRepo;
	
	public Offerta inserisciOfferta(Offerta o) {
		System.out.println(o);
		return offertaRepo.save(o);
	}
	
	public Offerta modificaOfferta(Integer idOfferta, Offerta o) {
		Offerta daModificare = offertaRepo.findByIdOfferta(idOfferta);
		
		daModificare.setDescrizione(o.getDescrizione());
		
		return offertaRepo.save(daModificare);		
	}
	
	public void cancellaOfferta(Integer idOfferta) {
		Offerta daCancellare = offertaRepo.findByIdOfferta(idOfferta);
		offertaRepo.delete(daCancellare);
	}
	
}
