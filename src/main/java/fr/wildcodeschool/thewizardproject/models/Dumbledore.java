package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Dumbledore")
public class Dumbledore implements WizardInterface {
	

private Outfit _outfit;
	
	public Dumbledore( @Qualifier("Outfit")Outfit outfit ) {
		_outfit = outfit;
	}
	
	@Override
	public java.lang.String giveAdvice() { 
		return "50 points pour Grifondor ... ! ";
	}
	@Override
	public java.lang.String changeDress(String couleur) {
		return _outfit.dress(couleur);

	}
	
}
