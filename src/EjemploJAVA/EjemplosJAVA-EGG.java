/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJAVA-EGG.pkg7;
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
        
        

    }
    
}
