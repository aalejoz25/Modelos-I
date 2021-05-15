
package personajebuilder;


public class PersonajeMagoBuilder  extends PersonajeBuilder{

    
    public void construirRaza(String raza) {
        personaje.setRaza(raza);
    }

    
    public void construirTipo(String arma) {
        personaje.setTipo(arma);
    }
    
    
}
