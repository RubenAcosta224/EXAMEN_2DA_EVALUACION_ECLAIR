/*

 */
package problema_1;



public class Formula1 extends Movimiento {

   public Formula1(double V0, double VF, double A, double T) {
        super(V0, VF, A, T);
    }

    public Formula1() {
        super();
    }

//------------------------------------------------------------------------------   
    
    
  @Override
   public double CalcularDistancia() {
    double CalcularDistancia = (V0*T) + ((A*Math.pow(T, 2))/2);
    return CalcularDistancia;
   
    }










    
}
