
package objetoscuacubo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author noefdo.solismay
 */
public class ObjetosCuaCubo extends Cuadrado{

   
    public static void main(String[] args) {
       
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        leerDatos(); // Método que lee y valida los datos
        
        while (!salir) {   
            System.out.println("                   ==== Menú ====");
            System.out.println("1.- Cuadrado    2.- Cubo    3.- Cancelar    4.- Salir\\n");
           /* System.out.println("2.- Cubo");
            System.out.println("3.- Cancelar");
            System.out.println("4.- Salir\n");*/
            
            try {
                System.out.println("Escoja una opción: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Cuadrado");
                        // Cálculos del cuadrado
                        Cuadrado.calculaPerimetro();
                        Cuadrado.calculaArea();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción Cubo");
                        //Calculos del cubo
                        Cubo.calculaPerimetroCubo();
                        Cubo.calculaVolumenCubo();
                        break;
                    case 3:
                        System.out.println("Has seleccionado Cancelar y regresar al inicio");
                        leerDatos();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número [1..4]");
                sn.next();
            }
       
        
    
   }
 }
    public static void leerDatos(){
        boolean esDouble=false;
        Scanner valor=new Scanner(System.in);
        do{
            System.out.println("Introduce un el valor del lado: ");
            String cadena = valor.nextLine();         
            try{                                    //Captura posible error de escritura de alguna letra
                l=Double.parseDouble(cadena);
                esDouble=true;
                if(l==0){
                    esDouble=false;
                    System.out.println("¡Solo se pueden digitar números positivos!... ");
                }

            }catch (NumberFormatException nfe){
                System.out.println("¡Solo se pueden digitar números positivos!... ");
                }
            } while (l<=0 && !esDouble);
        
    }
}
