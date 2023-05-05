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
public class Manufactura extends Empleados {

    public Manufactura() {
        super();
        setSalarioBase(40.0);
    }

    public Manufactura(String nombre, String apellido, int edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() * 1.2;
    }
}
