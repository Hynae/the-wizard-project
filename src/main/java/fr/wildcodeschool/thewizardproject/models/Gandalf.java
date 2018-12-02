package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements WizardInterface{
	private Outfit _outfit;
	
	public Gandalf( @Qualifier("Outfit") Outfit outfit ) {
		_outfit = outfit;
	}
	
	
	@Override
	public String giveAdvice() {
		return "Fuyez pauvres fous...";
	}

	@Override
	public String changeDress(String couleur) {
		
		return _outfit.dress(couleur);
	}
}
