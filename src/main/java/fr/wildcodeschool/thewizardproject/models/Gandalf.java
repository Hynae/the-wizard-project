package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface{
	private Outfit _outfit;
	
	public Gandalf( Outfit outfit ) {
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
