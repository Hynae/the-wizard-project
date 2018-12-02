package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("Outfit")
public class Outfit {
	


	public String dress(String couleur) {
		return "the wizard's dress is " + couleur;
	}


}
