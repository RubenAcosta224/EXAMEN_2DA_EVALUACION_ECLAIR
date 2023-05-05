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
public abstract class Empleados {
    private String nombre;
    private int id;
    private double salario;

    public Empleados(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
        public Empleados(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.salario = 0;
    }

    public Empleados() {
        this.nombre = "---";
        this.id = 0;
        this.salario = 0;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    public abstract double calcularSalario();
    
    public abstract void imprimirDatos();
}
