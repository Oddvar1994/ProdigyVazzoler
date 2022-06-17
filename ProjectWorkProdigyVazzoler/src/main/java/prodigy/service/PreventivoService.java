package prodigy.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prodigy.db.ClienteRepository;
import prodigy.db.PreventivoRepository;
import prodigy.dto.PreventivoDto;
import prodigy.model.Cliente;
import prodigy.model.Preventivo;

@Service
public class PreventivoService {

	
	@Autowired
	ClienteRepository clienteRepo;
	
	@Autowired
	PreventivoRepository prevRepo;
	
	
	public Preventivo inserisciPreventivo(Preventivo p) {
		System.out.println(p);
		return prevRepo.save(p);
	}
	
	public Preventivo modificaPreventivo(Integer idPreventivo, Preventivo p) {
		Preventivo daModificare = prevRepo.findByIdPreventivo(idPreventivo);
		
		daModificare.setDescrizione(p.getDescrizione());
		daModificare.setPrezzo(p.getPrezzo());
		daModificare.setIdCliente(p.getIdCliente());
		
		return prevRepo.save(daModificare);		
	}
	
	public void cancellaPreventivo(Integer idPreventivo) {
		Preventivo daCancellare = prevRepo.findByIdPreventivo(idPreventivo);
		prevRepo.delete(daCancellare);
	}
	
public List<PreventivoDto> listaPreventiviDto() {
		
		List<PreventivoDto> listDto = new ArrayList<>();
		Iterable<Preventivo> liste = prevRepo.findAll();
		
		for(Preventivo preventivo: liste) {
			PreventivoDto preventivoDto = new PreventivoDto();
			
			preventivoDto.setIdPreventivo(preventivo.getIdPreventivo());
			preventivoDto.setDescrizione(preventivo.getDescrizione());
			preventivoDto.setPrezzo(preventivo.getPrezzo());
			preventivoDto.setIdCliente(preventivo.getIdCliente());
			preventivoDto.setEmail(clienteRepo.findById(preventivo.getIdCliente()).orElse(new Cliente()).getEmail());
			
			listDto.add(preventivoDto);
	}
		return listDto;
  }
	
	
	
}
