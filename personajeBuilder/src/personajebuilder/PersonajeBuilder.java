
package personajebuilder;


public abstract class PersonajeBuilder {
    protected Personaje personaje; 
    
    public void fabricarNewPersonaje(){
        personaje = new Personaje(); 
    }
    
    public abstract void construirRaza(String raza);
    public abstract void construirTipo(String arma);
    
    public Personaje getPersonaje() { 
        return personaje; 
    }
} 
 

