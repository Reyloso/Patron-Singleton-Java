
package Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Reinaldo
 */
public class Main {

    public static void main(String[] args) {
     
        /* se declara una variable y con la libreria swing se pide el nombre instanciar en la clase */
        String nombre1 = JOptionPane.showInputDialog(null, "ingrese El nombre a registrar");
        /* se declara una variable de tipo Persona(la clase persona) y se llama al metodo de la clase persona llamado getinstance
         * y se le pasa como parametro el nombre que se solicito en el paso anterior, esto lo que hace crear e instanciar un 
         * objeto de tipo Persona llamado empleado y su nombre sera el ingresado en el punto anterior*/
        Persona Empleado1 = Persona.getInstance(nombre1);

        /* se repite de nuevo todo el proceso anterior varias veces para intentar ingresar otra persona al sistema 
         * y corroborar que no deje instanciar mas de una vez */
        String nombre2 = JOptionPane.showInputDialog(null, "ingrese El nombre a registrar");
        Persona Empleado2 = Persona.getInstance(nombre2);

        String nombre3 = JOptionPane.showInputDialog(null, "ingrese El nombre a registrar");
        Persona Empleado3 = Persona.getInstance(nombre3);
        
        /* se crea una variable y se llama al metodo get de la primera persona registrada para obtener el nombre
         * de esa persona y luego se utiliza la libreria swing para mostrarlo por pantalla*/
        String nombre = Empleado1.getNombre();
        JOptionPane.showMessageDialog(null, nombre);
        
        System.exit(0);

       
    }
}
