package bdd02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Loader
{
    
    /**
     * 
     * 
     */
        private static Connection objConnexion = null;
        private static ResultSet objResult;
        private static Statement objStatement = null;
        private static String objQuery = "select first_name, last_name, mov.title "
            +"from actor a, film_actor link, film mov "
            +"where a.ACTOR_ID = link.ACTOR_ID "
            +"and mov.FILM_ID = link.FILM_ID "
            +"group by first_name, last_name, mov.title";

    /**
     * 
     */
    public static ResultSet loading(){
            objConnexion = Cxo.getCxo();
            try
            {
                   objStatement = objConnexion.createStatement();
                    

            }
            catch (SQLException e)
            {
                //  Action to ...
            }
    
            try
            {
                    objResult = objStatement.executeQuery(objQuery);
                    if (objResult !=null){
                        System.out.println("The RecordSet is not empty, query executed successfully");
                    }
                    else{
                        System.out.println("RecordSet is empty, , query executed not working properly");
                    }
                        

            }
            catch (SQLException e)
            {
                //  Action to ...
            }
            
            return objResult;

    }
}
