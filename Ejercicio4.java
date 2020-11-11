import java.util.Scanner;

public class Ejercicio4{
    
    public static void main(String args[]){
        
        int fila=0, columna = 0, x = 0, y = 0, a=0, b=0, c=0, r=0;
        
        Scanner entrada = new Scanner(System.in);
    
        
        
        System.out.println("Ingrese el número de filas");
        fila=entrada.nextInt();
        
        System.out.println("Ingrese el número de columnas");
        columna=entrada.nextInt();
        
        System.out.println("Tenemos la función 23X4+20Y3-3");
        System.out.println("");
        int matriz[][] = new int[fila][columna];

        for (int i=0;i<fila;i++){
            
            for(int j=0;j<columna;j++){
                
                System.out.println("Ingrese el valor de X ");
                x = entrada.nextInt();
                
                System.out.println("Ingrese el valor de Y ");
                y = entrada.nextInt();
                
                System.out.println("___________________________");
                
                System.out.println(Math.pow(x,4));
                System.out.println(Math.pow(y,3));
                System.out.println(x+ "___________________________"+x*23);
                
                a=x*23;                             
                b=y*20;
                c=a+b;    
                r=c-3;
                matriz[i][j]=r;
                
                System.out.println("El resultado es ["+matriz[i][j]+"]");
                

    
                
                
            }
            
            System.out.println("");
        }
        
        for (int i=0;i<fila;i++){
            
            for(int j=0;j<columna;j++){
                
                System.out.println("["+matriz[i][j]+"]");
    
    
                
                
            }
            
            System.out.println("");
        }
    }
    
    
}