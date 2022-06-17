package prodigy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prodigy.db.ClienteRepository;
import prodigy.db.OffertaRepository;
import prodigy.dto.ClienteDto;
import prodigy.model.Cliente;
import prodigy.model.Offerta;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepo;
	
	@Autowired
	OffertaRepository offertaRepo;
	
	public Cliente inserisciCliente(Cliente c) {
		System.out.println(c);
		return clienteRepo.save(c);
	}
	
	public Cliente modificaCliente(Integer idCliente, Cliente c) {
		Cliente daModificare = clienteRepo.findByIdCliente(idCliente);
		
		daModificare.setNome(c.getNome());
		daModificare.setCognome(c.getCognome());
		daModificare.setEmail(c.getEmail());
		daModificare.setNumeroTelefono(c.getNumeroTelefono());
		daModificare.setIdOfferta(c.getIdOfferta());
		
		
		return clienteRepo.save(daModificare);		
	}
	
	public void cancellaCliente(Integer idCliente) {
		Cliente daCancellare = clienteRepo.findByIdCliente(idCliente);
		clienteRepo.delete(daCancellare);
	}
	

	public List<ClienteDto> listaClientiDto() {
		
		List<ClienteDto> listDto = new ArrayList<>();
		Iterable<Cliente> liste = clienteRepo.findAll();
		
		for(Cliente cliente: liste) {
			ClienteDto clienteDto = new ClienteDto();
			
			clienteDto.setIdCliente(cliente.getIdCliente());
			clienteDto.setNome(cliente.getNome());
			clienteDto.setCognome(cliente.getCognome());
			clienteDto.setEmail(cliente.getEmail());
			clienteDto.setNumeroTelefono(cliente.getNumeroTelefono());
			clienteDto.setIdOfferta(cliente.getIdOfferta());
			clienteDto.setDescrizione(offertaRepo.findById(cliente.getIdOfferta()).orElse(new Offerta()).getDescrizione());
			
			listDto.add(clienteDto);
	}
		return listDto;
  }

	
}
