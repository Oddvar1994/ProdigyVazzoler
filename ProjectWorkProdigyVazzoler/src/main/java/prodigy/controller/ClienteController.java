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

import prodigy.db.ClienteRepository;
import prodigy.dto.ClienteDto;
import prodigy.model.Cliente;
import prodigy.service.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepo;
	
	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping("/listaclienti")
	public List<ClienteDto> listaClienti() {
		return clienteService.listaClientiDto();
	}
	
	@PostMapping("/nuovocliente")
	public void nuovoCliente(@RequestBody Cliente c) {
		clienteService.inserisciCliente(c);
	}
			
	@PutMapping("/modificacliente/{idCliente}")
	public void modificaCliente(@PathVariable("idCliente")Integer idCliente, @RequestBody Cliente c) {
		clienteService.modificaCliente(idCliente, c);			
	}
	
	@DeleteMapping("/cancellacliente/{idCliente}")
	public void  cancellaCliente(@PathVariable("idCliente")Integer idCliente) {
		clienteService.cancellaCliente(idCliente);
	}
}
