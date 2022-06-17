package prodigy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import prodigy.db.OffertaRepository;
import prodigy.model.Offerta;
import prodigy.service.OffertaService;


@RestController
public class OffertaController {
	
	@Autowired
	OffertaRepository offertaRepo;
	
	@Autowired
	OffertaService offertaService;
	
	@PostMapping("/nuovaofferta")
	public void nuovaOfferta(@RequestBody Offerta o) {
		offertaService.inserisciOfferta(o);
	}
	
	@GetMapping("/listaofferte")
	public Iterable<Offerta> listaOfferte() {
		return offertaRepo.findAll();
	}
	
	@PutMapping("/modificaofferta/{idOfferta}")
	public void modificaOfferta(@PathVariable("idOfferta")Integer idOfferta, @RequestBody Offerta o) {
		offertaService.modificaOfferta(idOfferta, o);			
	}
	
	@DeleteMapping("/cancellaofferta/{idOfferta}")
	public void  cancellaOfferta(@PathVariable("idOfferta")Integer idOfferta) {
		offertaService.cancellaOfferta(idOfferta);
	}

}
