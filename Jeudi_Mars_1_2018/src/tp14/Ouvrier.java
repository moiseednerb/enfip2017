package tp14;

public final class Ouvrier extends Employe{
	
	private int nbHeures;
	
	/**
	 * 
	 * 
	 */
	
	public Ouvrier(String nom, int num, int indice, double taux, int nbHeures) {
		super(nom,num,taux,indice);
		
		this.nbHeures = nbHeures;
		
	}
	
	//////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		String objString;
		
		objString = "Ouvrier ["+super.toString()+" - nbHeures:"+this.nbHeures+"]";
		
		return objString;
	}
	
	public double calcSalaire () {
		
		 return (double) (super.calcSalaire(nbHeures));
	}
}
