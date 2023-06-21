/*
 A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la 
persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables(arrays), para después calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas 
en su peso ideal y cuantos, por encima, y también calculaf
remos un porcentaje 
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear 
unos métodos adicionales.

 */
package Main;

import Entidad.Persona;
import ServicioPersona.ServicioPersona;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona sp = new ServicioPersona();
        
        //sp.crearPersona();
        
        //System.out.println(sp.crearPersona());
        System.out.println("*****************");
        Persona p1 = null;
        Persona p2 = new Persona("Oscar", 46, "M", 78, 170);
        
        
        try{
          System.out.println("Es mayor de edad?:"+sp.esMayor(p1)+"\n");
        }catch(Exception e){
            System.out.println("Error de sistema\n");
        }
        try{
          System.out.println("Es mayor de edad?:"+sp.esMayor(p2)+"\n");
        }catch(Exception e){
            System.out.println("Error de sistema\n");
        }
        
    }
    
}
