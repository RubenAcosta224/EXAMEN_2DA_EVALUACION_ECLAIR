/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_examen_practico;

import problema_1.Formula1;
import problema_1.Formula2;
import problema_1.Formula3;
import problema_1.Movimiento;
import problema_2.Apoyo;
import problema_2.Empleados;
import problema_2.Jefe;
import problema_2.Manufactura;
import problema_3.EmpleadoTiempoCompleto;
import problema_3.Administrador;
import problema_3.EmpleadoTiempoParcial;

/**
 *
 * @author dell
 */
public class EVA2_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n-------------------------------Problema 1-----------------------------------\n"); 
//Problema 1: Cálculo de la distancia en un problema de movimiento   
      
    // Sin parámetros (Fórmula 1)
     Movimiento movimientoF11 = new Formula1();
     System.out.println("Fórmula 1.");
     System.out.println("(V0*T) + ((A*Math.pow(T, 2))/2)");
     System.out.println("Distancia recorrida con fórmula 1: " + movimientoF11.CalcularDistancia());
        
     // Con parámetros (Fórmula 1)
    Movimiento movimientoF12 = new Formula1(2.0, 1.0, 5.0, 3.0);
    System.out.println("Distancia recorrida con fórmula 1: " + movimientoF12.CalcularDistancia());    
           
    System.out.println("\n----------------------------------\n"); 
        
        
    //Sin parámetros (Fórmula 2)
    Movimiento movimientoF21 = new Formula2();
    System.out.println("Fórmula 2.");
    System.out.println("((V0+VF)/2)*T");
    System.out.println("Distancia recorrida con fórmula 2: " + movimientoF21.CalcularDistancia());   
    
    //Con parámetros (Fórmula 2) 
    Movimiento movimientoF22 = new Formula2(2.0, 1.0, 5.0, 3.0);
    System.out.println("Distancia recorrida con fórmula 2: " + movimientoF22.CalcularDistancia());  
    
    System.out.println("\n--------------------------------------\n"); 
    
    
     //Sin parámetros (Fórmula 3)
    Movimiento movimientoF31 = new Formula3();
    System.out.println("Fórmula 3.");
    System.out.println("(VF-V0)/(2*A)");
    System.out.println("Distancia recorrida con fórmula 3: " + movimientoF31.CalcularDistancia()); 
    
    //Con parámetros (Fórmula 3)
    Movimiento movimientoF32 = new Formula3(2.0, 1.0, 5.0, 3.0);
    System.out.println("Distancia recorrida con fórmula 3: " + movimientoF32.CalcularDistancia()); 
    
        
        
    
    
    System.out.println("\n\n\n\n-------------------------------Problema 2-----------------------------------\n"); 
//problema 2
    
    
    Empleados empleado1 = new Manufactura("Ruben", "Acosta", 25, 50.0);
    Empleados empleado2 = new Apoyo("Yessly", "Mayorga", 30, 60.0);
    Empleados empleado3 = new Jefe("Julio", "Jacinto", 40, 10000.0);
        
   imprimirDatos(empleado1);
   imprimirDatos(empleado2);
   imprimirDatos(empleado3);
        






        System.out.println("\n\n\n\n-------------------------------Problema 3-----------------------------------\n"); 
//problema 3
        
        //no pide salario porque lo tiene que calcular
        EmpleadoTiempoParcial empPar1=new EmpleadoTiempoParcial(300, 4, "Roberto", 3);
        empPar1.imprimirDatos();
        
        EmpleadoTiempoCompleto empComp1=new EmpleadoTiempoCompleto("Juan", 2, 7000);
        empComp1.imprimirDatos();
        
        Administrador admin1=new Administrador(10, "Pedro", 1, 5000);
        admin1.imprimirDatos();
        
    }
    
    
    
        //del problema 2
        public static void imprimirDatos(Empleados empleado) {
        System.out.println("El salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es de: $" + empleado.getSalarioBase());

    }
    
}
