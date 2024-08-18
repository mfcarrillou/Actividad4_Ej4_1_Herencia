package ej4_1_herencia;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        float saldo, tasa ,dinero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.print("\tIngrese su saldo inicial: $");
        saldo = entrada.nextFloat();
        System.out.print("\tIngrese la tasa de interés: ");
        tasa = entrada.nextFloat();
        CuentaAhorros cuenta_ahorros = new CuentaAhorros(saldo,tasa);
        System.out.print("\tIngrese cantidad de dinero a consignar: $");
        dinero = entrada.nextFloat();
        cuenta_ahorros.consignarDinero(dinero);
        System.out.print("\tIngrese cantidad de dinero a retirar: $");
        dinero = entrada.nextFloat();
        cuenta_ahorros.retirarDinero(dinero);
        cuenta_ahorros.extractoMensual();
        cuenta_ahorros.imprimir();       
    }
    
}
