/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       System.out.print("ingrese el dia de la semana ");
        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
                

        switch (opcion){

            case "lunes":{

                System.out.println(" el dia de la semana es laboral.");

                break;

            }

            case "martes":{

                System.out.println("el dia de la semana es laboral.");

                break;

            }

            case "miercoles":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            
            case "jueves":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            
            case "viernes":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            case "sabado":{

                System.out.println("el dia de la semana no es laboral.");

                break;
                

            }
            case "domingo":{

                System.out.println("el dia de la semana no es laboral.");

                break;
                

            }

            default: {

                System.out.println("Opcion incorrecta");

            }

      }
    }
    
}
