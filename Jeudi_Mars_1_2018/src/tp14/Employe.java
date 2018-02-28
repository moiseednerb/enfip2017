package tp14;

import tp14.Personne;

public abstract class Employe extends Personne{
	
	private int num;
	private double taux;
	private int indice;
	
	
	/**
	 * 
	 * 
	 */
	//////////////// CONSTRUCTOR 1 ////////////////////////////////////////////
	public Employe(String nom, int num, double taux, int indice){
		super(nom);
		this.num = num;
		this.taux = taux;
		this.indice = indice;
		
	}
	
	/////////////////////  MODIFIERS //////////////////////////////////////////
	public double calcSalaire (int nbHeures) {
		
		
		 return (double) (this.indice * this.taux * nbHeures);
	}

	
	////////////////////////////////////////////////////////////////////////////
	@Override
	
	public String toString() {
		
		return super.toString() + " - Num:"+ this.num +" - Ind:"+this.indice+" - Tx:"+this.taux;
	}
}
