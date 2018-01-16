package be.vdab.services;

import java.util.List;

import org.springframework.stereotype.Service;

import be.vdab.entities.Brouwer;
import be.vdab.repositories.BrouwerRepository;

@Service
public class DefaultBrouwerService implements BrouwerService {

	BrouwerRepository repo;
	
	public DefaultBrouwerService(BrouwerRepository repo) {
		this.repo = repo;
	}
	
	public void create(Brouwer brouwer) {
		
		repo.create(brouwer);
				
	}	
	
	public List<Brouwer> findAll(){
		return repo.findAll();
	}
	public List<Brouwer> findByNaam(String naam){
		return repo.findByNaam(naam);
	}
}
