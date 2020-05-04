public abstract class Rectangle {
	private double longueur;
	private double largeur;
 
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
 
	public double getLongueur() {
		return longueur;
	}
 
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
 
	public double getLargeur() {
		return largeur;
	}
 
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
 
	public double perimetre() {
		return (this.longueur + this.largeur) * 2;
	}
 
	public double aire() {
		return longueur * largeur;
	}
 
