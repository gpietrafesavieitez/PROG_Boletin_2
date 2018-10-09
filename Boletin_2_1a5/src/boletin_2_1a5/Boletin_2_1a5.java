package boletin_2_1a5;
import java.util.Scanner;

public class Boletin_2_1a5 {
    
    public static Scanner leer = new Scanner(System.in);

    //Porcentaje compra
    public static void ejer1(){
        float precioTarifa, precioPagado, descuento;
        System.out.print("Introduce el precio de la tarifa: "); precioTarifa = leer.nextFloat();
        System.out.print("Introduce el precio pagado: "); precioPagado = leer.nextFloat();
        descuento = 100 - ((precioPagado * 100) / precioTarifa);
        System.out.println("- El descuento aplicado ha sido del " + descuento + "%.");
    }
    
    //Temperatura Fahrenheit & Kelvin
    public static void ejer2(){
        float gradosCelsius, gradosFahrenheit, gradosKelvin;
        System.out.print("Introduce los grados centígrados: "); gradosCelsius = leer.nextFloat();
        System.out.println("- " + gradosCelsius + " grados Centígrados son aproximadamente " + ((gradosCelsius * 9 / 5) + 32) + " grados Fahrenheit y " + (gradosCelsius + 273.15) + " grados Kelvin.");
    }
    
    //Conversión a euros
    public static void ejer3(){
        int cien, veinte, cinco, uno;
        System.out.print("Billetes de 100 euros: "); cien = leer.nextInt();
        System.out.print("Billetes de 20 euros: "); veinte = leer.nextInt();
        System.out.print("Billetes de 5 euros: "); cinco = leer.nextInt();
        System.out.print("Monedas de 1 euro: "); uno = leer.nextInt();
        System.out.println("- La cantidad total es de " + ((100 * cien) + (20 * veinte) + (5 * cinco) + (1 * uno)) + " euros.");
    }
    
    //Conversión a billetes y monedas
    public static void ejer4(){//
        int cantidad, c = 0;
        
        do{
            System.out.print("Introduce la cantidad a desglosar en euros: ");
            while (!leer.hasNextInt()){
                System.out.print("Valor incorrecto. Introduce la cantidad a desglosar en euros:");
                leer.next();
            }
            cantidad = leer.nextInt();
        }while (cantidad <= 0);
        
        while(cantidad - 100 >= 0){
            c++;
            cantidad -= 100;
        }System.out.println("- " + c + " billete(s) de 100 euros."); c=0;

        while(cantidad - 20 >= 0){
            c++;
            cantidad -= 20;
        }System.out.println("- " + c + " billete(s) de 20 euros."); c=0;

        while(cantidad - 5 >= 0){
            c++;
            cantidad -= 5;
        }System.out.println("- " + c + " billete(s) de 5 euros."); c=0;

        while(cantidad - 1 >= 0){
            c++;
            cantidad -= 1;
        }System.out.println("- " + c + " moneda(s) de 1 euro.");
    }
    
    //Sueldo bruto y líquido
    public static void ejer5(){
        double sueldoFijo, importeVentas, kiloMetraje, diasDesplaza, sueldoBruto, sueldoLiquido;
        
        System.out.print("Introduce el sueldo fijo en euros: "); sueldoFijo = leer.nextFloat();
        System.out.print("Introduce el importe de ventas en euros: "); importeVentas = leer.nextFloat();
        System.out.print("Introduce los kilómetros: "); kiloMetraje = leer.nextFloat();
        System.out.print("Introduce los días de desplazamiento: "); diasDesplaza = leer.nextFloat();
        
        sueldoBruto = sueldoFijo + (0.05 * importeVentas) + (2 * kiloMetraje) + (30* diasDesplaza);
        sueldoLiquido = sueldoBruto - (36 + 0.18 * sueldoBruto);
        
        System.out.println("- El sueldo bruto es de: " + sueldoBruto + " euros y el líquido es de " + sueldoLiquido + " euros.");
    }
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            System.out.println("\n[1] Ejercicio 1\n[2] Ejercicio 2\n[3] Ejercicio 3\n[4] Ejercicio 4\n[5] Ejercicio 5\n[0] Salir\n"); opcion = leer.nextInt();
            
            switch(opcion){
                case 0: System.out.print("Hasta luego!"); break;
                case 1: ejer1(); break;
                case 2: ejer2(); break;
                case 3: ejer3(); break;
                case 4: ejer4(); break;
                case 5: ejer5(); break;
                default: System.out.print("Selecciona una opción válida!"); break;
            }
            
        }while(opcion != 0);
    }
}