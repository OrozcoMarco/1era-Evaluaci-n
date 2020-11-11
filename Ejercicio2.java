import java.util.Scanner;

public class Ejercicio2{
    
    public static void main(String args[]){
        
        int fila=0, columna = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("BIENVENIDO");
        System.out.println("_________________");
        System.out.println("Matriz identidad");
        System.out.println("______________________________________________________________________________");
        System.out.println("Una matriz identidad o unidad de orden n es una matriz cuadrada donde todos");
        System.out.println("sus elementos son ceros (0)menos los elementos de la diagonal principal que"); 
        System.out.println("son unos (1). ... Además, la matriz identidad se reconoce por tener ");
        System.out.println("forma a cuadrado dado que es una matriz cuadrada");
        System.out.println("______________________________________________________________________________");
        
        
        System.out.println("Ingrese el número de filas");
        fila=entrada.nextInt();
        
        System.out.println("Ingrese el número de columnas");
        columna=entrada.nextInt();
        
        int matriz[][] = new int[fila][columna];

        
        if(fila==columna){
            
        
            for (int i=0;i<fila;i++){
                
               for(int j=0;j<columna;j++){
            
                
            matriz[i][j] = (int) (Math.random() * 2 ); 
                
                
               }
            
            }
        
            for (int i=0;i<fila;i++){
               for(int j=0;j<columna;j++){
                 
                
             System.out.print("["+matriz[i][j]+"]");    
                
             }
            
            System.out.println("");
            }
            

            for (int contador = 0;contador<columna;contador++){
    
                
                if (matriz[contador][contador]==1){
                    
                    contador++;
                    
                    System.out.println("");
                    
                    
                }else{
                    System.out.println("No se cumplio la condición");
                    
                }
                
                
                
                
            }
            
            
        }else{
            
            System.out.println("AVISO__________________________________________________");
            System.out.println("No cumple con la condición de ser una matriz identidad");
            System.out.println("ya que una matriz identidad es una matriz cuadratica.");
            System.out.println("_______________________________________________________");
        }
        
        
        
        

        
        
        
    }
    
    
}