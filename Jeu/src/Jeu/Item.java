package Jeu;

public class Item extends Objet {
	private boolean Etat;
	private int Niveau;
	
	public Item(boolean _Etat, int _Niveau, boolean _Ramass�) {
		this.setEtat(_Etat);
		this.setNiveau(_Niveau);
		this.setRamass�(_Ramass�);
	}
	
	public boolean isEtat() {
		return Etat;
	}

	public void setEtat(boolean etat) {
		Etat = etat;
	}

	public int getNiveau() {
		return Niveau;
	}

	public void setNiveau(int niveau) {
		Niveau = niveau;
	}
	
}
