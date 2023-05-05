/*

 */
package problema_1;


public abstract class Movimiento implements Captura {
 
 //Atributos
    
 double V0;
 double VF;
 double A;
 double T;
  
 public abstract double CalcularDistancia(); 
 
 //Con parámetros

 public Movimiento(double V0, double VF, double A, double T) {
    this.V0 = V0;
    this.VF = VF;
    this.A = A;
    this.T = T;
    }
 
 //Sin parámetros
 
     public Movimiento() {
      V0 = 10.0; 
      VF = 5.0; 
      A = 2.0; 
      T = 1.0; 
    }

 //implementcación  
     
 @Override
    public double getV0() {
        return V0;
    }

 @Override
    public void setV0(double V0) {
        this.V0 = V0;
    }

 @Override
    public double getVF() {
        return VF;
    }

 @Override
    public void setVF(double VF) {
        this.VF = VF;
    }

 @Override
    public double getA() {
        return A;
    }

 @Override
    public void setA(double A) {
        this.A = A;
    }

 @Override
    public double getT() {
        return T;
    }

 @Override
    public void setT(double T) {
        this.T = T;
    }
     
 
    
}
