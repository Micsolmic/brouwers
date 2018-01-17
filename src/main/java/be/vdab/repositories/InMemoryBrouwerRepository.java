package be.vdab.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import be.vdab.entities.Brouwer;
import be.vdab.valueobjects.Adres;

@Repository
public class InMemoryBrouwerRepository implements BrouwerRepository{

	ConcurrentHashMap<Long, Brouwer> brouwers = new ConcurrentHashMap<>();
	
	public InMemoryBrouwerRepository() {
		
		brouwers.put(1L, new Brouwer(1L, "InBev", 5000, new Adres("Kouter", "12", 9300, "Aalst")));
		brouwers.put(2L, new Brouwer(2L, "Jupiler", 1000, new Adres("Kouter", "12", 9300, "Aalst")));
		brouwers.put(3L, new Brouwer(3L, "Affligem", 75, new Adres("Kouter", "12", 9300, "Aalst")));
		brouwers.put(4L, new Brouwer(4L, "AsseBlond", 75, new Adres("Mert", "65", 9654, "Asse")));
	}
	
	public void create(Brouwer bro) {
		brouwers.put(Collections.max(brouwers.keySet())+1, bro);
	}
	
	public List<Brouwer> findAll() {
		return new ArrayList(brouwers.values());
	}
	
	public List<Brouwer> findByNaam(String beginletter){
		
		beginletter = beginletter.toUpperCase();
		
		
		List<Brouwer> gevondenBrouwers = new ArrayList<>();
		
		for(Brouwer b: brouwers.values()) {
			
		
			if(b.getNaam().charAt(0) == beginletter.charAt(0)) {
				gevondenBrouwers.add(b);
			}
			
		}
		return gevondenBrouwers;
	}
}
