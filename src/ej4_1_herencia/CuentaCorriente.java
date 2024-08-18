package ej4_1_herencia;

public class CuentaCorriente extends Cuenta {
    protected float sobregiro;
    
    protected CuentaCorriente(float saldo_, float tasa_anual){
        super(saldo_,tasa_anual);
        sobregiro = 0;
    }
    
    protected void consignarDinero(float dinero){
        if (sobregiro != 0){
            if (sobregiro <= dinero){
                float dineroRestante;
                dineroRestante = dinero - sobregiro;
                sobregiro = 0;
                super.consignarDinero(dineroRestante);
            } else {
                sobregiro = sobregiro - dinero;
            }
        } else {
            super.consignarDinero(dinero);
        }
    }
    
    protected void retirarDinero(float dinero){
        if(dinero > saldo){
            sobregiro = sobregiro + (dinero - saldo);
            saldo = 0;
            numRetiros = numRetiros + 1;
        } else{
            super.retirarDinero(dinero);
        }
    }
    
    protected void extractoMensual(){
        super.extractoMensual();
    }
    
    protected void imprimir(){
        int transaccionesRealizadas = numConsig + numRetiros;
        System.out.println("\nSaldo: $" + saldo);
        System.out.println("Comisión Mensual: $" + comisionMensual); 
        System.out.println("Número de transacciones realizadas: " + transaccionesRealizadas);
        System.out.println("Sobregiro: $" + sobregiro);
    }
}
