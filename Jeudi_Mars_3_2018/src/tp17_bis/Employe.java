package tp17_bis;

public class Employe extends Personne
{
    // Attributs
    private int num;

    private double taux;

    private int indice;

    // Constructeurs
    public Employe(String nom, int num, double taux, int indice)
    {
        super(nom);
        this.num = num;
        this.taux = taux;
        this.indice = indice;
    }

    // Méthodes
    public double calcSalaire()
    {
        return this.taux * this.indice;
    }

    public String toString()
    {
        return this.num + "\t: " + super.toString()
            + "\tSalaire de base : " + this.calcSalaire() + " Euros";
    }
}
