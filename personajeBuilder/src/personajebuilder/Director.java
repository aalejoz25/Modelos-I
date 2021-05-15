
package personajebuilder;

public class Director {
    
   private PersonajeBuilder personajeBuilder;
   
   public void personajeBuilder(PersonajeBuilder pb){
       personajeBuilder = pb; 
   }
   
   public void construirPersonaje(String raza, String arma){ 
       personajeBuilder.fabricarNewPersonaje(); 
       personajeBuilder.construirRaza(raza); 
       personajeBuilder.construirTipo(arma); 
       
   }
    
   public Personaje getPersonaje() { 
       return personajeBuilder.getPersonaje();
   }
}
