
package Metodos;

/* se importan las librerias a utilizar */
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Reinaldo
 */

/* se crea una clase llamada persona */
public class Persona {
    /* hace encapsulamiento de los datos con el atributo private 
     * y se declaran las variables a utilizar.
     * se crea una variable de tipo string para almacenar el nombre 
     * y otra del mismo tipo de la clase donde se va a guardar ese nombre*/
    private String Nombre;
    private static Persona Empleado;
    
    /* se declara un metodo constructor con parametros de tipo private para que el compilador no genere
     * automaticamente su metodo constructor*/
    private Persona(String Nombre){
        this.Nombre = Nombre;
    }
    
    /* se crea un metodo publico del mismo tipo de la clase y le asignamos un nombre
     * este metodo lo que harà serà recibir el nombre de la persona por parametro y verificar si la variable
     * empleado que es de tipo persona, existe, si no existe creara un empleado y le asignara el nombre
     * que le fue pasado por parametro, si ya existe retornara un mensaje que ya existe un empleado registrado*/
    public static Persona getInstance(String Nombre){
        if(Empleado == null){
        Empleado = new Persona(Nombre);
        JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
        
        }else{
            JOptionPane.showMessageDialog(null, "Ya Existe Una Persona registrada");
        }
        return Empleado;
    }
    
    /* metodo get para obtener el nombre del objeto */
    String getNombre(){
        return Nombre;
    }
    
}
