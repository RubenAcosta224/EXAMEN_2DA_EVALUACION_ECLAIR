/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

/**
 *
 * @author hp
 */
public class Jefe extends Empleados {

    public Jefe() {
        super();
        setSalarioBase(5000.0);
    }

    public Jefe(String nombre, String apellido, int edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() * 2;
    }
}

