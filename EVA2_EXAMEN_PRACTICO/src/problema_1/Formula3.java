/*

 */
package problema_1;


public class Formula3 extends Movimiento{
  
    public Formula3(double V0, double VF, double A, double T) {
        super(V0, VF, A, T);
    }

    public Formula3() {
        super();
    }  
    
//------------------------------------------------------------------------------  
    
    @Override
    public double CalcularDistancia() {
     double CalcularDistancia=(VF-V0)/(2*A);
     return CalcularDistancia;
    }    
    
    
    
    
    
}
