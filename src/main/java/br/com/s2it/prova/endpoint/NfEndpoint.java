package br.com.s2it.prova.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.s2it.prova.model.Nf;
import br.com.s2it.prova.service.NfService;

@RestController
@RequestMapping("/ed/nf")
public class NfEndpoint {

	@Autowired
	private NfService service;	
	
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody Nf nf){
		
		service.save(nf);
		
		return new ResponseEntity<Nf> (HttpStatus.OK);
	}
		
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> list(){
		
		return new ResponseEntity<List<Nf>>(service.listAll(),HttpStatus.OK);
		}	
	
	@RequestMapping(value = "", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody Nf nf){
		
		service.update(nf);
		
		return new ResponseEntity<Nf> (HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		
		service.delete(new Nf(id));
		
		return new ResponseEntity<Nf> (HttpStatus.OK);
	}
	
}
