package com.progra2.tarea2.examen_parciak;

import com.progra.Matriz.Cls_Matriz;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cls_Main 
{
    public static void main(String[] args) 
    {
        Cls_Matriz imp = new Cls_Matriz();
        int opcion;
        Scanner std = new Scanner(System.in);
        
        imp.imprimir();
        System.out.println("");
        System.out.println("");
        
        try
        {
            do
            {
                System.out.println("Seleccione que resultados desea ver");
                System.out.println("1. Total Ventas");
                System.out.println("2. Comisiones del 20% y 30%");
                System.out.println("3. Total Venta y Comiciones");
                System.out.println("4. ISR del 5%");
                System.out.println("5. Liquido a Recibir");
                System.out.println("6. El vendedor que más recibio");
                System.out.println("7. El vendedor que menos recibio");
                System.out.println("8. Mostrar Matriz");
                System.out.println("9. Salir");
                opcion = std.nextInt();
                
                switch(opcion)
                {
                    case 1:
                        imp.totalv();
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 2:
                        imp.porcentajes();;
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 3:
                        imp.totalvc();
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 4:
                        imp.isr();
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 5:
                        imp.liquido();
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 6:
                         imp.masrecibio();
                         System.out.println("");
                         System.out.println("");
                        break;
                    case 7:
                        imp.menosrecibio();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 8:
                        imp.total();
                        imp.imprimir();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 9:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }    
            }while(opcion != 9);
            
        }catch(Exception e)
        {
            System.out.println("Hubo un error");
        }
        
    }
}
