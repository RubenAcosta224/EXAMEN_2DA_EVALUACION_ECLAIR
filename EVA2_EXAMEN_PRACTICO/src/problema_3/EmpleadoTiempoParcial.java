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
public class EmpleadoTiempoParcial extends Empleados{
    
    private int pagoPorHora;
    private int horasTrabajadas;

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //como el salario no se define al crear, se define con las horas y pago por hora, no se puede poner en el constructor
    public EmpleadoTiempoParcial(int pagoPorHora, int horasTrabajadas, String nombre, int id) {
        super(nombre, id);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = 0;
        this.horasTrabajadas = 0;
    }
    
    
    
    

    @Override
    public double calcularSalario() {
        return pagoPorHora*horasTrabajadas;
    }

    @Override
    public void imprimirDatos() {
                System.out.println("");
        System.out.println("Empleado tiempo parcial");
        System.out.println("id: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Pago por hora: "+pagoPorHora);
        System.out.println("Horas trabajadas: "+horasTrabajadas);
        System.out.println("Salario: "+calcularSalario());
                System.out.println("");
    }
    
}
