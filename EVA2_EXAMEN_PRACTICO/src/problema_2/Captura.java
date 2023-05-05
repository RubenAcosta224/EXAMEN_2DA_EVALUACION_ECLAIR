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
public interface Captura {

    void setNombre(String nombre);

    void setApellido(String apellido);

    void setEdad(int edad);

    void setSalarioBase(double salarioBase);

    String getNombre();

    String getApellido();

    int getEdad();

    double getSalarioBase();
}
