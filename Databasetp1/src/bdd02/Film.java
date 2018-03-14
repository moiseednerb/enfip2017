package bdd02;

public class Film
{

        /**
         * 
         *   Local variables' definition
         * 
         */
    
            private String titre;
    
    
            
            
          /**
           * 
           *    CONSTRUCTOR AND METHODS  
           *   
           */
            
            public Film(String titre){
                
                this.titre = titre;
                
            }  
            
            ////////////////////// METHOD 1 ////////////////////////////////////////
            @Override
            public String toString(){
                
                String objString = "";
                
                objString = this.titre;
                
                return objString;
            }
}
