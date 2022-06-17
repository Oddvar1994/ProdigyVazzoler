package prodigy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import prodigy.db.PreventivoRepository;
import prodigy.dto.PreventivoDto;
import prodigy.model.Preventivo;
import prodigy.service.PreventivoService;

@RestController
public class PreventivoController {

	
	@Autowired
	PreventivoRepository prevRepo;
	
	@Autowired
	PreventivoService prevService;
	
	
	@GetMapping("/listapreventivi")
	public List<PreventivoDto> listaPreventivi() {
		return prevService.listaPreventiviDto();
	}
	
	@PostMapping("/nuovopreventivo")
	public void nuovoPreventivo(@RequestBody Preventivo p) {
		prevService.inserisciPreventivo(p);
	}
	
	@PutMapping("/modificapreventivo/{idPreventivo}")
	public void modificaPreventivo(@PathVariable("idPreventivo")Integer idPreventivo, @RequestBody Preventivo p) {
		prevService.modificaPreventivo(idPreventivo, p);			
	}
	
	@DeleteMapping("/cancellapreventivo/{idPreventivo}")
	public void  cancellaPreventivo(@PathVariable("idPreventivo")Integer idPreventivo) {
		prevService.cancellaPreventivo(idPreventivo);
	}
	
}
