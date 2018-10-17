
package objetoscuacubo;
import java.util.Scanner;
/**
 *
 * @author noefdo.solismay
 */
public class Cuadrado {
    public static double l, perimetro, area;
    
    public static void  calculaPerimetro(){
        System.out.println("El valor del lado es: ---> "+l );
        perimetro=4*l;
        System.out.println("El perimetro es: "+perimetro );
    }
    public static void  calculaArea(){
        area=l*l;
        System.out.println("El área es: "+area+"\n");
    }
}
