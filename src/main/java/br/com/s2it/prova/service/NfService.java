package br.com.s2it.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.s2it.prova.model.Nf;
import br.com.s2it.prova.repository.NfRepository;

@Service
@Transactional
public class NfService {

	@Autowired
	private NfRepository repository;
	
	public void save(Nf nf){
		
		
		repository.persist(nf);
	}
	
	public List<Nf> listAll(){
		return repository.listAll();
	}
	
	public void update(Nf nf){		
		repository.update(nf);
	}
	
	public void delete(Nf nf){
		repository.delete(nf);
	}
	
	
}
