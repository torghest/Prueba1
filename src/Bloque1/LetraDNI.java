/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bloque1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class LetraDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String DNI = "";
        String dniLetra = "TRWAGMYFPDXBNJZSQVHLCKET";
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Introduzca el número de DNI ('s' para salir):");
            try {
                DNI=teclado.readLine();
                int num=Integer.parseInt(DNI);
                int aux = num/23;
                int letra = num - (aux * 23);
                System.out.println("La letra del DNI "+DNI+" es: "+dniLetra.charAt(letra));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!DNI.equals("s"));
    }
    
}
