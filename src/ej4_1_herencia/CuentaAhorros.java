package ej4_1_herencia;

public class CuentaAhorros extends Cuenta{
    private boolean activa;

    protected CuentaAhorros(float saldo_, float tasa_anual) {
        super(saldo_, tasa_anual);
        estadoCuentaAhorros();
    }
    
    protected void estadoCuentaAhorros(){
        if (saldo < 10000){
            activa = false;
        } else {
            activa = true;
        }
    }
    
     protected void consignarDinero(float dinero){
        if (activa){
            super.consignarDinero(dinero);
        } else {
            System.out.println("\nSu cuenta esta inactiva, no se puede consignar dinero");
        }
    }
    
    protected void retirarDinero(float dinero){
        if (activa){
            super.retirarDinero(dinero);
        } else {
            System.out.println("\nSu cuenta esta inactiva, no se puede retirar dinero");
        }
    }
       
    protected void extractoMensual(){
        if (numRetiros > 4) {
            int retirosAdicionales;
            retirosAdicionales = numRetiros - 4;
            comisionMensual = 1000 * retirosAdicionales;
        }
        super.extractoMensual();
        estadoCuentaAhorros();
    }
    
    protected void imprimir(){
        int transaccionesRealizadas = numConsig + numRetiros;
        System.out.println("\nSaldo: $" + saldo);
        System.out.println("Comisión Mensual: $" + comisionMensual); 
        System.out.println("Número de transacciones realizadas: " + transaccionesRealizadas);
        System.out.println();
    }
    
}
