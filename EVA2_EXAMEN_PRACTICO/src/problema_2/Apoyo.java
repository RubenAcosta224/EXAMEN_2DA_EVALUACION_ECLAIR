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
public class Apoyo extends Empleados {

    public Apoyo() {
        super();
        setSalarioBase(50.0);
    }

    public Apoyo(String nombre, String apellido, int edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }
}
