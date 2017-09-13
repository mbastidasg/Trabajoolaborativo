/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase3;
import java.util.*;

/**
 *
 * @author Lina Velasquez
 */


public class Arreglos {
    
public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEnt = new Scanner (System.in);
        // declarar varibles
        
       double Patrimonio;
       double [][] Matriz = new double [10] [6] ;
        
        
       
       double RentaLiquida = 0;
       
       int Nombre, NumCred ;
       double ValorPagar, ValorMatricula;
    int ka = 0;
      while ( ka < 10 ) {
                
        
          
          
        System.out.println("Codigo del estudiante:");
        Nombre = flujoEnt.nextInt();
          
        Matriz [ ka ] [ 0 ] = Nombre;
        
        System.out.println("Numero de creditos a cursar:");
        NumCred = flujoEnt.nextInt();
        
        Matriz [ ka ] [ 3 ] = NumCred;
        
        System.out.println("Patrimonio:");
        Patrimonio = flujoEnt.nextDouble();
        
        Matriz [ ka ] [ 2 ] = Patrimonio;
       
        System.out.println("Renta Liquida: ");
        RentaLiquida = flujoEnt.nextDouble();
        
        Matriz [ ka  ] [ 1 ] = RentaLiquida;
        
        ValorPagar = CalcularCred ( Patrimonio, RentaLiquida );
        System.out.println("Codigo: " + Nombre + " Pago:  " + ValorPagar);
        
        Matriz [ ka ] [ 4 ] = ValorPagar ;
        
        ValorMatricula = CalcularMatricula (ValorPagar, NumCred); 
        System.out.println ("Codigo: " + Nombre + " Valor Matricula: " + ValorMatricula ); 
        
        Matriz [ ka ] [ 5 ] = ValorMatricula ;
        
        for ( int i = 0 ; i < 10 ; i++ ){
           
            for ( int j = 0; j < 6; j ++){
                 System.out.println( i + "," + j + "[" + Matriz [i] [j] + "]");
            } 
        }
        
        int ke = 0;
         System.out.println("Si desea inscribir otro estudiante presione ´2 ´, para salir presione ´1 ´ : ");
        ke = flujoEnt.nextInt();
        
        if (ke == 2){
            ka  ++;
            
        }
        else {
            System.out.println("Gracias.");
            ka = 15;
        }
            
        }
        
        
 } 
   public static double CalcularCred (double Patrimonio, double RentaLiquida ){
   double ValorCredito ;
       if (RentaLiquida < 25000 && Patrimonio < 100000){
      
           ValorCredito = 130;
           return ValorCredito ;
       }
        
        else if ( RentaLiquida > 25000 && RentaLiquida < 30000 && Patrimonio > 100000 && Patrimonio < 150000) {
        
            ValorCredito = 200;
            return ValorCredito ;
          }
       
        else {
             ValorCredito = 280;
            return ValorCredito ;
        }
     
   }
   
    public static double CalcularMatricula (double ValorCredito, int NumCred ){
        // VARIABLE TOTAL COSTO DE TODOS LOS CREDITOS 
        double VALOR2;
              VALOR2  = ValorCredito * NumCred ;
        return VALOR2;
        
    }
}








/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosq;
import java.util.*;
/**
 *
 * @author Maicol Velasquez
 */
public class EjerciciosQ {
    Scanner cv = new Scanner(System.in);   

    /**
     * @param args the command line arguments
     */
    
    
    
    public EjerciciosQ(){
        float col =0;
    int [][] matriz = {{2,5,5},{3,5,6},{4,4,1},{3,2,1}};
    int vectorF[] = new int [4];
    int vectorC[] = new int [4];
        System.out.println("desea ver filas 1 \n desea ver columnas 2\n:");
        int fd = cv.nextInt();
        switch (fd ){
            case 1:   
                for (int i = 0; i<4; i++){
      int aux = sum (matriz, i);
     vectorF[i] = aux;
             System.out.println("vector filas:" + vectorF[i]);
             
    }
                break;
            case 2:
                for (int i = 0; i<3; i++){
                    
       int aux1 = sumC (matriz, i);
     vectorC[i] = aux1;
             System.out.println("vector columnas:" + vectorC[i]);
             
                }
                break;
         
               
    }
    
        
    
}
    
    
    
    
    
  public int sum(int[][] matriz, int fila) {
 
  int sumac = 0;
 
for(int i=0; i <3 ; i++){ 

    int aux = matriz[fila][i];

sumac += aux;
} 

 
   
  return sumac;
 }
    
 public int sumC(int[][] matriz, int col) {
 
  int sumac = 0;
 
for(int i=0; i <4 ; i++){ 

    int aux = matriz[i][col];

sumac += aux;
} 

    
   
  return sumac;
 }
    
    public  static void main(String[] args) {
        // TODO code application logic here
        
     EjerciciosQ hola = new EjerciciosQ();
    
        
 
}
    
   
    
    }
    

