import java.util.Scanner;

public class Ejercicio1{
    
    public static void main(String args[]){
        
        System.out.println("_____Bienvenido_____");
        
        int fila = 2, columna = 3;
        
        int excepcion1 = 3, excepcion2= 2;
        
        String opc="si";
        
        Scanner entrada = new Scanner (System.in);
        
        int matriz1[][] = new int[fila][columna];
        
        System.out.println("Vamos a darle los valores a la primera Matriz");
        
        for (int i=0;i<fila;i++){
            
        
            
            for (int j=0;j<columna;j++){
                
                System.out.println("Ingrese el valor correspondiente en la posición [ "+ i +" ] [ "+ j +" ]");
                matriz1[i][j] = entrada.nextInt();
                
                
            }
            
          System.out.println("");
        
        }
        System.out.println("_______________");
        System.out.println("Primera Matriz" );
        System.out.println("_______________");
        
        for (int i=0;i<fila;i++){
            
            for (int j=0;j<columna;j++){
                
                System.out.print("["+matriz1[i][j]+"]");
                
                
                
            }
            
          System.out.println("");
        
        }
        System.out.println("_______________");
        
        
        System.out.println("");
        System.out.println("Procedemos a darle el valor a la segunda matriz");
        
        int matriz2[][] = new int[fila][columna];
        
        for (int i=0;i<fila;i++){
            
        
            
            for (int j=0;j<columna;j++){
                
                System.out.println("Ingrese el valor correspondiente en la posición [ "+ i +" ] [ "+ j +" ]");
                matriz2[i][j] = entrada.nextInt();
                
                
            }
            
          System.out.println("");
        
        }
        
        System.out.println("_______________");
        System.out.println("Segunda Matriz" );
        System.out.println("_______________");
        
        for (int i=0;i<fila;i++){
            
            for (int j=0;j<columna;j++){
                
                System.out.print("["+matriz2[i][j]+"]");
                
                
                
            }
            
          System.out.println("");
        
        }
        System.out.println("_______________");
       
        
        System.out.println("");
        System.out.println("A continuación vamos a realizar la suma de matrices");
        System.out.println("basandonos en el hecho de que es necesario que ambas matrices");
        System.out.println("posean las mismas dimensiones");
        System.out.println("______________________________________________________________");
        
        
    int matriz3[][] = new int[fila][columna];
        
        for (int i=0;i<fila;i++){
            
        
            
            for (int j=0;j<columna;j++){
                
                
                
                
                System.out.println("El valor correspondiente en la posición [ "+ i +" ] [ "+ j +" ]");
                matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
                
                System.out.println("El resultado de la suma es: "+matriz3[i][j]);
                
            }
            
        
            
          System.out.println("");
        
        }
        
        System.out.println("________________");
        System.out.println("(Matriz1+Matriz2)" );
        System.out.println("________________");
        
        for (int i=0;i<fila;i++){
            
            for (int j=0;j<columna;j++){
                
                System.out.print("["+matriz3[i][j]+"]");
                
                
                
            }
            
          System.out.println("");
        
        }
        System.out.println("_______________");
        
        System.out.println("Procedemos a darle el valor a la tercera matriz");
        System.out.println("");
       
        int matriz4[][] = new int[excepcion1][excepcion2];
        
        for (int i=0;i<excepcion1;i++){
            
        
            
            for (int j=0;j<excepcion2;j++){
                
                System.out.println("Ingrese el valor correspondiente en la posición [ "+ i +" ] [ "+ j +" ]");
                matriz4[i][j] = entrada.nextInt();
                
                
            }
            
          System.out.println("");
        
        }
        
        System.out.println("_______________");
        System.out.println("Tercera Matriz" );
        System.out.println("_______________");
        
        for (int i=0;i<excepcion1;i++){
            
            for (int j=0;j<excepcion2;j++){
                
                System.out.print("["+matriz4[i][j]+"]");
                
                
                
            }
            
          System.out.println("");
        
        }
        System.out.println("_______________");

        System.out.println("Lo siguiente que se va a hacer es multiplicar la tercera matriz");
        System.out.println("por la suma de (Matriz1+Matriz2)");
        System.out.println("");
        System.out.println("Siendo el ejercicio a resolver (Matriz1+Matriz2)*Matriz3");
        
        int matrizresultante[][] = new int[2][2];
        
        
                matrizresultante[0][0]= (matriz3[0][0]*matriz4[0][0])+(matriz3[0][1]*matriz4[1][0])+(matriz3[1][0]*matriz4[2][1]);
                matrizresultante[0][1]= (matriz3[1][0]*matriz4[0][0])+(matriz3[1][1]*matriz4[1][0])+(matriz3[1][0]*matriz4[2][0]);
                matrizresultante[1][0]= (matriz3[0][0]*matriz4[0][1])+(matriz3[0][1]*matriz4[1][1])+(matriz3[1][0]*matriz4[2][1]);
                matrizresultante[1][1]= (matriz3[1][0]*matriz4[0][1])+(matriz3[1][1]*matriz4[1][1])+(matriz3[1][0]*matriz4[2][1]);
                
                
                System.out.println("");
                System.out.println("El resultado de (Matriz1+Matriz2)*Matriz3 es:  ");
                
                
                System.out.println("["+matrizresultante[0][0]+"] ["+matrizresultante[0][1]+"] ");
                System.out.println("["+matrizresultante[1][0]+"] ["+matrizresultante[1][1]+"] ");
                System.out.println("");
                
        
    }
    
    
    
}