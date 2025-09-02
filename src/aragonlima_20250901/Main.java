/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aragonlima_20250901;

/**
 *
 * @author UFG
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz();
    }
    
    
    public static void matriz(){
        //SE INSTANCIA EL SCANNER PARA LA LECTURA DEL TECLADO
        Scanner scanner = new Scanner (System.in);
        
        //SE INSTANCIA LA MATRIZ DE TIPO INTEGER
        int[][] matriz = new int [3][3];
        int suma = 0; //VARIABLE PARA SUMA DE VALORES DIGITADOS
        int total_elementos = 0; //CONTADOR DE ELEMENTOS DE MATRIZ
        double promedio = 0d;    // CALCULO DEL PROMEDIO DE EDADES DIGITADAS    
        
        //SALIDA AL USUARIO PARA INDICAR QUE DEBE INGRESAR DATOS
        System.out.println("Ingrese los valores para una matriz de 3 x 3");
        
        
        
        //SE RECORRE PRIMERO LAS FILAS CON UNA ESTRUCTURA DE CONTROL INTERATIVA "FOR"
        for(int i = 0; i < matriz.length; i++){
            
            //EN CADA ITERACIÓN DEBERA OBTENER LA CANTIDAD DE ELEMENTOS 
            //QUE EXISTE EN EL ARREGLO (CANTIDAD COLUMNAS)
            total_elementos += matriz[i].length;
            
            
            //SE RECORREN LAS COLUMNAS CON UNA ESTRUCTURA DE CONTROL ITERATIVA "FPR"
            for(int j = 0; j < matriz[i].length; j++){
             //SE VUELVE UN ARRAY-------^
             
                
                //SE IMPRIME LA PETICION AL USUARIO PARA QUE INGRESE DATOS
                System.out.println("Elemento [" + i + "] [" + j + "]");
                //SE HACE LECTURA DE TECLADO
                matriz[i][j] = scanner.nextInt();
                
                
            }//CIERRE DE "FOR" PARA COLUMNAS
            
            
            
        }//CIERRE DE "FOR" PARA FILAS
        
        //SALIDA DE VALORES PARA EL USUARIO
        System.out.println("Matriz ingresada: ");
        
        //SE RECORRE LAS FILAS CON UN "FOR"
        for(int x = 0; x < matriz.length; x++){
            
            
            //SE RECORRE LAS COLUMNAS CON UN "FOR"
            for(int y = 0; y< matriz[x].length; y++){
                
            //SE VULVE UN ARRAY-----^
            
            
                //SE IMPRIME EL VALOR DE CADA CELDA
                // FILAS: X, COLUMNAS:Y
                System.out.print(matriz[x][y]+ " ");
                
                //SE SUMAN LOS VALORES DE CADA CELDA
                suma += matriz[x][y];
            }
            
            //SE IMPRIME UN SALTO DE LINEA
            System.out.println();
            
        }
        
        //CALCULO DE LOS VALORES
        
        
        promedio = (double) suma/total_elementos;
        
        
        
        
        
        System.out.println("La sumatoria total de elementos es: "+ suma);
        System.out.println("La cantidad de elementos digitados es: "+ total_elementos);
        System.out.println("El promedio de edad es: "+ promedio);
        
        
        scanner.close();
        
        
    }
    
    
    
}

