package bdd02;

public class test
{
    /**
     * a - int, DOCUMENTEZ_MOI
     */
    private int a;
    /**
     * z - String, DOCUMENTEZ_MOI
     */
    private String z;
    
    
    
    public test(int a, String z)
    {
        super();
        this.a = a;
        this.z = z;
    }
    /**
     * Accesseur de a
     *
     * @return a
     */
    public int getA()
    {
        return a;
    }
    /**
     * Mutateur de a
     *
     * @param a a
     */
    public void setA(int a)
    {
        this.a = a;
    }
    /**
     * Accesseur de z
     *
     * @return z
     */
    public String getZ()
    {
        return z;
    }
    /**
     * Mutateur de z
     *
     * @param z z
     */
    public void setZ(String z)
    {
        this.z = z;
    }
    
    
}
