/*

 */
package problema_1;


public class Formula2 extends Movimiento{

    public Formula2(double V0, double VF, double A, double T) {
        super(V0, VF, A, T);
    }

    public Formula2() {
       super();
    }

//------------------------------------------------------------------------------
    
    @Override
    public double CalcularDistancia() {
    double CalcularDistancia =((V0+VF)/2)*T;
    return CalcularDistancia;
    }











    
}
