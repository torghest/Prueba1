/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bloque1;

import Bloque1.Calculos.DNI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class Cliente {
    
    public static void main(String[] args){
        String leido = "";
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el DNI:");
        try {
            leido=teclado.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DNI dni = new DNI(leido);
        System.out.println("La letra del DNI: "+ dni.getDNI() +" es: " + dni.getLetra());
    }
    
}
