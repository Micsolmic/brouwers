package be.vdab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.entities.Alfabet;
import be.vdab.services.BrouwerService;

@Controller
@RequestMapping("/brouwers")
public class BrouwerController {
	
	private static final String BROUWERS_VIEW = "brouwers/brouwers";
	private static final String OPNAAM_VIEW = "brouwers/beginnaam";
	private static final String TOEVOEGEN_VIEW = "brouwers/toevoegen";
	
	private BrouwerService service;
	
	public BrouwerController(BrouwerService bs) {
		service = bs;
	}
	
	@GetMapping 
	ModelAndView findAll() {
		System.out.println(service.findAll());
	return new ModelAndView(BROUWERS_VIEW, "allBrouwers", service.findAll()); 
		
	}
	
	
	@GetMapping("beginnaam")
	ModelAndView perLetter(@RequestParam(value="beginletter", required=true) String beginletter) {
		System.out.println(service.findByNaam(beginletter));
		return new ModelAndView(OPNAAM_VIEW, "alfabet", Alfabet.getAlfabet('a','z'))
				.addObject("metletter", service.findByNaam(beginletter));
		
	}
	/*
	@GetMapping("beginnaam") 
	ModelAndView sortAll() {
		System.out.println("ba");
	return new ModelAndView(OPNAAM_VIEW, "alfabet", Alfabet.getAlfabet('a','z')); 
	}
	*/
	
// multiple request attributes .addObject("werknemers", werknemerService.findAll()); 	
// this to inject parameter	@RequestParam("foo")
	
	@GetMapping("toevoegen")
	String createForm() {
		return TOEVOEGEN_VIEW;		
	}
	

}



