public class Tarjeta
{
    private float saldo;
    
    /**
     * Se inicializa la variable saldo a 0 en el constructor.
     */
    public Tarjeta()
    {
        saldo=0;
    }
    
    /**
     * Este metodo se encarga de sumar el saldo actual mas lo depositado.
     * @param dinero Recibe un valor flotante y lo suma al saldo actual.
     */
    public void depositar(float dinero)
    {
        saldo=saldo+dinero;
    }
    
    /**
     * Este metodo se encarga de retirar dinero del saldo actual.
     * @param dinero Recibe un valor flotante a retirar.
     * @return Regresa la variable dinero que es la cantidad a retirar.
     */
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            return dinero;
        }
        else
            return 0;
    }
    
    /**
     * Este metodo imprime el saldo actual.
     * @return Regresa el valor del saldo.
     */
    public float consultar()
    {
        System.out.print("\nTu saldo es: "+saldo +"pesos");
        return saldo;
    }
}