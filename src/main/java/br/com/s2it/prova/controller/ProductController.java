package br.com.s2it.prova.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.s2it.prova.model.Product;
import br.com.s2it.prova.service.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {
	
	
	public static final String VIEW = "product";
	
	
	@Autowired
	private ProductService service;
	
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView save(Product product){    	
    	
    	service.save(product);
    	
        return listAll();
    }
    

    @RequestMapping(value = "" , method = RequestMethod.DELETE)
    public void delete(Product product){  
    	
    	service.delete(product);
    	
       }
    
    @RequestMapping(value = "", method = RequestMethod.PATCH)
    public ModelAndView update(Product product){    	
    	
    	service.update(product);
    	
    	
        return listAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView listAll(){    	
    	
    	ModelAndView modView = new ModelAndView(VIEW);
    	modView.addObject("product", service.listAll());
    	return modView;
    }
}
