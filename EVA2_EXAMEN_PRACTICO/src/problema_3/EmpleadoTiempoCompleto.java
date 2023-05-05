/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3;

/**
 *
 * @author dell
 */
public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto(String nombre, int id, double salario) {
        super(nombre, id, salario);
    }

    public EmpleadoTiempoCompleto() {
        super();
    }
    
    
    
    

    @Override
    public double calcularSalario() {
        return getSalario();
    }

    @Override
    public void imprimirDatos() {
        System.out.println("");
        System.out.println("Empleado tiempo completo");
        System.out.println("id: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Salario: "+getSalario());
        System.out.println("");
    }


    
}
