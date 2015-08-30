package br.com.s2it.prova.controller.view;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.s2it.prova.model.Nf;
import br.com.s2it.prova.service.NfService;


@Controller
@RequestMapping("/nf")
public class NfController {
	
	
	public static final String VIEW = "nf";
	
	
	@Autowired
	private NfService service;
	
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView save(Nf nf){    	
    	
    	service.save(nf);
    	
        return listAll();
    }    
  
    @RequestMapping(value = "" , method = RequestMethod.DELETE)
    public void delete(Nf nf){  
    	
    	service.delete(nf);
    	
       }
    
    @RequestMapping(value = "", method = RequestMethod.PATCH)
    public ModelAndView update(Nf nf){    	
    	
    	service.update(nf);
    	
    	
        return listAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView listAll(){    	
    	
    	ModelAndView modView = new ModelAndView(VIEW);
    	//modView.addObject("nf", service.listAll());
    	return modView;
    }
}
