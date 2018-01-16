package be.vdab.entities;

import java.util.ArrayList;

public class Alfabet {

	
	
	public static ArrayList<String> getAlfabet(char start, char end){
		ArrayList<String> alfabet = new ArrayList<>();
		
		for(char letter = start; letter <= end; letter++) {
			alfabet.add(String.valueOf(letter));
		}
		return alfabet;
	}
	
	
	
}
