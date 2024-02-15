/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**     
 *
 * @author Criss
 */
public class Calculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        Scanner datos2 = new Scanner(System.in);
        Scanner bu = new Scanner(System.in);
        String opc,n1,n2,opc2,buc1;
        int tr,buc,n11,n22;
        float d1,d2,div;
        boolean v=true;
        
        while (v==true){
            System.out.println("CALCULADORA");
            System.out.println("Ingresa un número para opcion que deseas: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            opc=scanner.nextLine();

            while(opc.chars().anyMatch(c -> !Character.isDigit(c))){
                    //si hay caracter que no sea un numero se pide de nuevo la entrada
                    System.out.print("Ingreso un caracter, ingrese un numero por favor: ");
                    opc = scanner.nextLine();
                } //FIN DEL VERIFICADOR
            tr = Integer.parseInt(opc); //convierte el caracter en numero

            if (tr==1){
                System.out.println();
                System.out.println("SUMA");
                System.out.println("Ingresa un número: ");
                d1=datos.nextFloat();
                System.out.println("Ingresa un número: ");
                d2=datos2.nextFloat();
                float suma =d1+d2;
                System.out.println("La suma de los dos numeros ingreados es: "+suma);
            }else if (tr==2){
                System.out.println();
                System.out.println("RESTA");
                System.out.println("Ingresa un número: ");
                d1=datos.nextFloat();
                System.out.println("Ingresa un número: ");
                d2=datos2.nextFloat();
                float resta =d1-d2;
                System.out.println("La resta de los dos numeros ingreados es: "+resta);
            }else if (tr==3){
                System.out.println();
                System.out.println("MULTIPLICACIÓN");
                System.out.println("Ingresa un número: ");
                d1=datos.nextFloat();
                System.out.println("Ingresa un número: ");
                d2=datos2.nextFloat();
                float multi =d1*d2;

                System.out.println("La multiplicación de los dos numeros ingreados es: "+multi);
            }else if (tr==4){

                try{
                    System.out.println();
                    System.out.println("DIVISIÓN");
                    System.out.println("Ingresa un número: ");
                    n11=datos.nextInt();
                    System.out.println("Ingresa un número: ");
                    n22=datos2.nextInt();
                    div =n11/n22;
                    System.out.print("La división de los dos numeros ingreados es: "+div);
                }catch(java.lang.ArithmeticException e){
                    System.out.println("No es posible dividir entre cero");
                }
                
            }else{
                System.out.println();
                System.out.println("Ingresaste una opcion invalida");
            }
            
            System.out.println("");
            System.out.println("¿Desea continuar en la calculadora? (Si=1, No=2 o un  numero mayor)");
            buc1=bu.nextLine();
            while(buc1.chars().anyMatch(c -> !Character.isDigit(c))){
                //si hay caracter que no sea un numero se pide de nuevo la entrada
                System.out.print("Ingreso un caracter, ingrese un numero por favor: ");
                buc1 = scanner.nextLine();
            } //FIN DEL VERIFICADOR
            buc=Integer.parseInt(buc1);
            
            if(buc==1){
                System.out.println();
                v=true;
            }else if(buc>1){
                System.out.println();
                System.out.println("Hasta pronto :)");
                v=false;
            }else{
                System.out.println("Opción inválida, de regreso al menú");
            }
            
    }
    }
    
}
