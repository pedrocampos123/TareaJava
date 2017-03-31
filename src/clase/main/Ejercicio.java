/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.main;
import java.util.*;

/**
 *
 * @author Pedro Arturo Campos Rivas 379415
 */
public class Ejercicio {
    
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        
        int mat1[][]= new int[5][5];
        int mat2[][]= new int[5][5];
        int res[][]= new int[5][5];
        int i,j;
        
        System.out.println("Ingrese elementos de la primera matriz");
        for (i = 0; i < mat1.length; i++) {
            for (j = 0; j < mat1.length; j++) {
                System.out.println("Columna "+(i+1)+" fila "+(j+1)+"= ");
                mat1[i][j]=lector.nextInt();
            }
        }
        
        System.out.println("Ingrese elementos de la segunda matriz");
        for (i = 0; i < mat2.length; i++) {
            for (j = 0; j < mat2.length; j++) {
                System.out.println("Columna "+(i+1)+" fila "+(j+1)+"= ");
                mat2[i][j]=lector.nextInt();
            }
        }
        
        System.out.println("La suma de las dos matrices es ");
        System.out.println("Ingrese elementos de la primera matriz");
        for (i = 0; i < res.length; i++) {
            for (j = 0; j < res.length; j++) {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        
        for (i = 0; i < res.length; i++) {
            for (j = 0; j < res.length; j++) {
                System.out.println("Columna "+(i+1)+" fila "+(j+1)+"= "+res[i][j]);
            }
            
        }
        
        
        
        
    }
}
    
    
    

