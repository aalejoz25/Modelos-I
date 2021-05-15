
package personajebuilder;

public class PersonajeLuchadorBuilder extends PersonajeBuilder{

   
    public void construirRaza(String raza) {
        personaje.setRaza(raza);
    }

    
    public void construirTipo(String arma) {
        personaje.setTipo(arma);
       
    }
    
}
