package bdd02;

import java.sql.*;

public class Cxo{
    private static Connection db = null;
    private static final String objConnexion =  "jdbc:oracle:thin:@oracle:1521:orcl"+","+"sakila15"+","+"sakila15";
    
    public static Connection getCxo() {
        try {
                if (db == null || db.isClosed()) {
                        db = DriverManager.getConnection("jdbc:oracle:thin:@oracle:1521:orcl","sakila15", "sakila15");
                }
        }
        catch (Exception e){System.out.println(e.getMessage());}
        return db;
    }

    public static void closeCxo(){
        try {
                db.close();
        }
        catch (Exception e){System.out.println(e.getMessage());}
        }
}