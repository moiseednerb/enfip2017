package tp14;

import tp14.Employe;

public final class Cadre extends Employe
{
	
	
	/**
	 * 
	 * 
	 * 
	 */
	///////////////////////////////////////////////////////////////////
	
	private double prime;
	
	/**
	 * 
	 * 
	 */
	
	public  Cadre(String nom, int num, int indice, double taux, double prime) {
		super(nom,num,taux,indice);
		this.prime = prime;
		 
	}
	
	////////////////////////////////////////////////////////////////////
	public double calcSalaire(int nbHeures) {
		
		 return (double) (super.calcSalaire(nbHeures) + this.prime);
	}
	
	///////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		String objString;
		
		objString = "Cadre ["+super.toString()+" - Prime:"+this.prime+"]";
		
		return objString;
	}

}
