/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bloque1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class ValidacionISBN {
    
    public static void main(String[] args){
        String isbn;
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        try{
            boolean valido = false;
            do {
                System.out.println("Introduzca el ISBN de 10 digitos:");
                isbn = teclado.readLine().trim();
                if (isbn.length() == 10)
                    valido = true;
                else
                    System.out.println("El ISBN introducido no es de 10 digitos");
            } while (!valido);
            int suma = 0;
            String auxISBN = isbn;
            for (int i =1; i <= 10; i++){
                int aux = auxISBN.charAt(0);
                auxISBN = auxISBN.substring(1);
                suma += i*aux;
            }
            if (suma%11 == 0)
                System.out.println("ISBN Valido");
            else
                System.out.println("ISBN No Valido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
