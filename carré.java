public class Carré {
	private double coté;
 
	public Carré(double coté) {
		this.coté = coté;
	}
 
	public double getCoté() {
		return coté;
	}
 
	public void setCoté(double coté) {
		this.coté = coté;
	}
 
	public double perimetre() {
		return this.coté * 4;
	}
 
	public double aire() {
		return coté * coté;
	}
 
