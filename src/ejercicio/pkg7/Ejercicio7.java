/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;
import java.util.Scanner;//Invocar Scanner para poder ingresar datos por teclado
/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Manera de definir la variable para ingresar datos Ej. (leer)
        System.out.println("Ingrese un numero decimal");
        double num = leer.nextDouble();
        System.out.println(num);
        //Ejemplo variable CHAR
        // La variable char tiene vinculacion con el diccionario ASCII
        char var=104 , varr=111 , varrr=108 , varrrr=97;
        System.out.println(var);
        System.out.println(varr);
        System.out.println(varrr);
        System.out.println(varrrr);
        //Ejemplo para saber la longitud de la cadena
        String txt ="Hola Mundo";
        System.out.println("La longitud de la cadena de texto es: " + txt.length());
        //Ejemplo para poner MAYUSCULAS y minusculas una cadena
        System.out.println(txt.toUpperCase());//MAYUSCULAS
        System.out.println(txt.toLowerCase());//minusculas
        //Encontrar un caracter de en una cadena
        String txx =" Please locate where 'locate' occurs @";
        System.out.println(txx.indexOf("occurs"));
        System.out.println(txt.indexOf("Mundo"));
        //Ejemplo Concatenacion de cadenas
        //Primer metodo
        System.out.println(txt + " " + txx);
        //Segundo metodo
        System.out.println(txt.concat(txx));
        //Ejemplo concatenar numeros como caracteres
        String x ="20";
        String y ="20";
        String z = x + y;
        System.out.println(z);
        //MATEMATICAS JAVA
        //BUSCAR EL NUMERO MAYOR
        System.out.println(Math.max(5, 20));
        int xx=5;
        int yy=43;
        System.out.println(Math.max(xx, yy));
        //BUSCAR EL NUMERO MENOR
        System.out.println(Math.min(3, 23));
        //RAIZ CUADRADA
        int nu = 9;
        System.out.println(Math.sqrt(nu));
        //VALOR ABSOLUTO (Devuelve un valor positivo)
        int n = -432;
        System.out.println(Math.abs(n));
        //NUMERO AL AZAR
        System.out.println(Math.random());
        //NUMERO AL AZAR CON RANGO
        int azar = (int)(Math.random()*101); //Rango de 0 a 100
        int zar = (int)(Math.random()*11); // Rango de 0 a 10
        System.out.println(azar);
        System.out.println(zar);
        //EJEMPLO DE VARIABKE BOOLEAN
        //Uso de operadores mayor y menor que (<>)
        int a=9;
        int b=20;
        System.out.println(a>b); //Va a dar como resultado "false" porque 9 no es mayor que 20
        
        int c =20;
        System.out.println(c==20); //Uso del operador igual a (==), da como resultado true xq si cumple 20==20
        //Ejemplo practico Boolean
        int d=25;
        int e=18;
        System.out.println(d>=e);//Devuelve verdadero true
        //Ejemplo uso de If ... else (Si... SiNo) ejemplo practico
        if (d>=e){
            System.out.println("Esta en edad para sufragar");
        }else {
            System.out.println("No tiene edad para sufragar");
           
        }
        //CONDICIONALES DE JAVA Y SENTENCIAS IF
        

    }
    
}
