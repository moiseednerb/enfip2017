package tp14;

import tp14.Cadre;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///  CREATION OF A CADRE
		
	 Cadre objCadre = new Cadre("Moise Edner Brutus", 7, 5, 7.5, 500.78);
	 System.out.println(objCadre.toString() + " Sal:"+objCadre.calcSalaire(400));
	 
	 
	 Personne objPersonne = new Personne("test");
	 
	 Ouvrier objOuvrier = new Ouvrier("Moise Edner Brutus", 7, 5, 7.5, 400);
	 System.out.println(objOuvrier.toString()+ " Sal:"+objOuvrier.calcSalaire());
	 
	 System.out.println(testFolie(objPersonne));
	}
	
	////////////////////////////////////////////////////////////////////////////////
	public static boolean testFolie(Personne p)
	{
		return true;
	}

}
