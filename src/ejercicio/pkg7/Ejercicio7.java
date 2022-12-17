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
        //Condisional simple if
        if (20>18) {
            System.out.println("20 es mayor que 18 por tanto la condicion es verdadera");
        }
        //Condisional else
        int hora = 20;
        if (hora<18) {
            System.out.println("Buenos dias");
            
        }else {
            System.out.println("Buenas noches"); //Salta a la linea de codigo else debido a que la primeria linea es falsa xq no cumple la condicion
        }
        //Condisional else if
        if (hora <10){
            System.out.println("Buenos dias");
        }else if (hora>18){
            System.out.println("Buenas tardes");
        }else {
            System.out.println("Buenas noches");
        }
        //Forma corta del si .... sino  if ... else
        
        String resultado = (hora<18) ? "Buenos dias" : "Buenas noches";
        System.out.println(resultado);
        // Condicional Switch (Condisional Segun)
        
        int dia ;
        System.out.println("Ingrese el numero establecido segun el dia de la semana");
        dia=leer.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingreso fuera de rango");
        }
        
        //BUCLES JAVA 
        //WHILE (mIENTRAS)
        
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++; //variable Contador para evitar un bucle infinito
        }
        //BUCLE DO /WHILE (HACER / MIENTRAS QUE)
        
        int h =0;
        do {
            System.out.println(h);
            h++;
        }
        while (h<5);
        
        //BUCLE FOR (BUCLE PARA.... HASTA....CON PASO...)
        
        for (int g=0 ; g<5 ; g++){ //declaracion 1: Establece una variable antes de comenzar el bucle (int g=0;)
            System.out.println(g); //declaracion 2: Define la condicion para que se ejecute el bucle si es verdadero caso contrario no se ejecuta por ser falso (g<5;)
        }                          //declaracion 3: Se coloca un contador que incrementa el valor cada vez que se ejecute el bucle (i++)
        
        
    }
    
}
