package boletin;

import java.util.Scanner;

public class Boletin {

    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String alumno,fechanac;
        int dni;
        
       
        System.out.print("Ingresar nombre del alumno: ");
        alumno = ingreso.nextLine();
         
        System.out.print("Ingresar la fecha de nacimiento : ");
        fechanac = ingreso.nextLine();
        
        System.out.print("Ingresar el numero de DNI : ");
        dni = ingreso.nextInt();
        
        System.out.print("ingresar el numero de Materias que desea cargar al boletín :");
        int nmaterias = ingreso.nextInt();
        
        String materias[] = new String [nmaterias];
        int notas [][] = new int [nmaterias][3];
        int mnotas = notas[0].length;
        float promedios[] = new float[nmaterias];
          
        
        
        for (int i=0;i<nmaterias;i++){
            System.out.print(+ (i+1) + "/" + nmaterias + "  Ingresar el nombre de la Materia : ");
            materias[i]=ingreso.next();
                 
        //solicitar materias 
        for(int j=0;j<mnotas;j++){
            do{
            System.out.print((j+1)+"  Ingresar nota:  ");
            notas[i][j]= ingreso.nextInt();
            }while(notas[i][j]<=0 || notas[i][j]>10);
            promedios[i]+= notas [i][j] ;
        }
            promedios[i]/=3;
        }
        
        
        System.out.println("============ Boletín del Alumno ================");
        System.out.println("====Alumno : "+alumno+ "===========");
        System.out.println("====Fecha de Nacimiento : "+fechanac+ "===========");
        System.out.println("====DNI : "+dni+ "==============");
           
        
        
        for(int i=0;i<nmaterias;i++){
            System.out.println("===" +materias[i]+ "==");
            for (int j=0;j<mnotas;j++){
            System.out.println(" ="+(j+1)+"= "+notas[i][j]+" ===" );
            }
        
        System.out.println("Promedio: " +Math.round(promedios[i]));
        
        
        }
        
        
        
        
    }
    
}
