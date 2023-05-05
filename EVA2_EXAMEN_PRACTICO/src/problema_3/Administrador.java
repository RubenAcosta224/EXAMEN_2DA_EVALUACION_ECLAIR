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
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    
    private int porcentajeDelBono;

    public int getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(int porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
        
        
    }

    public Administrador(int porcentajeDelBono, String nombre, int id, double salario) {
        super(nombre, id, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public Administrador() {
        super();
        this.porcentajeDelBono = 0;
    }
    
    
    
    
    
    
    @Override
    public double calcularBono() {
        return getSalario()*(porcentajeDelBono*0.01);
    }
    

    @Override
    public double calcularSalario() {
        return getSalario()+calcularBono();
    }

    @Override
    public void imprimirDatos() {
                System.out.println("");
        System.out.println("Empleado tiempo completo");
        System.out.println("id: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Salario: "+getSalario());
        
        System.out.println("Porcentaje del bono: "+porcentajeDelBono);
        System.out.println("Bono calculado: "+calcularBono());
        System.out.println("Salario con bono: "+calcularSalario());
        
                System.out.println("");
        
        
    }
    
}
