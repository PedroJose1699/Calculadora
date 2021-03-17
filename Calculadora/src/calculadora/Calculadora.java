/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author pjdgs
 */
public class Calculadora {
          //Hola Mundo(Trabajo Git-Netbeans)

          //atributos
    /**
     * primer número a a operar
     */
    private int num1;
    /**
     * Segundo número a operar
     */
    private int num2;
    //Metodos públicos
    /**
     * 
     * @param a
     * Primer numero a operar
     * @param b 
     * segundo numero a operar
     */
    
    
    public Calculadora(int a, int b){
         num1 = a;
         num2 = b;
}
    /**
     * Este metodo Suma los dos números
     * @return 
     * Devuelve el reultado de la suma de los dos números
     */
public int suma(){
int result = num1 +num2;
return result;
}
/**
 * Este metodo Resta los dos números
 * @return 
 * Devuelve el resultado de la resta de los dos números
 */

public int resta(){
    int result = num1 + num2;
    return result;
}
/**
 * Este metodo multiplica los dos números
 * @return 
 * devuelve el resultado de la multiplicacion de los dos números
 */
public int multiplica(){
    int result = num1+num2;
    return result;
}
/** 
 * Este metodo divide los dos números
 * @return 
 * Devuelve el resyltado de la división de los dos números
 */

public int division(){
    int result = num1/num2;
    return result;
}
    }
    



