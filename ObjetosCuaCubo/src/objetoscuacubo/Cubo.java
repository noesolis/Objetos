
package objetoscuacubo;

/**
 *
 * @author noefdo.solismay
 */
public class Cubo extends Cuadrado{
    public static void  calculaPerimetroCubo(){
        System.out.println("El valor del lado es: ---> "+l );
        perimetro=12*l;
        System.out.println("El perimetro del cubo es: "+perimetro);
    }
    
    public static void  calculaVolumenCubo(){
        area=l*l*l;
        System.out.println("El área del cubo es: "+area+"\n");
    }
}
