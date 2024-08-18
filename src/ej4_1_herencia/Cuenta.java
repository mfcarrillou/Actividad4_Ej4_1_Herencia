package ej4_1_herencia;

public class Cuenta {
    protected float saldo;
    protected int numConsig = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    
    protected Cuenta(float saldo_, float tasa_anual){
        saldo = saldo_;
        tasaAnual = tasa_anual;
    }
    
    protected void consignarDinero(float dinero){
        saldo = saldo + dinero;
        numConsig = numConsig + 1;
    }
    
    protected void retirarDinero(float dinero){
        if(dinero <= saldo){
            saldo = saldo - dinero;
            numRetiros = numRetiros + 1;
        } else{
            System.out.println("\nLa cantidad de dinero a retirar excede el saldo de la cuenta.");
        }
    }
    
    protected void calcularInteresMensual(){
        float tasaMensual, interesMensual;
        tasaMensual = tasaAnual/12;
        interesMensual = saldo * tasaMensual;
        saldo = saldo + interesMensual;
    }
    
    protected void extractoMensual(){
        saldo = saldo - comisionMensual;
        calcularInteresMensual();
    }
    
    protected void imprimir(){
        System.out.println("\nSaldo: $" + saldo);
        System.out.println("Número de consignaciones: " + numConsig);
        System.out.println("Número de retiros: " + numRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión Mensual: $" + comisionMensual);        
    }
    
}
