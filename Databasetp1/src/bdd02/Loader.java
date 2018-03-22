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
        private static String objQuery = "select * from actor";

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
                     

            }
            catch (SQLException e)
            {
                //  Action to ...
            }
            
            return objResult;

    }
}
