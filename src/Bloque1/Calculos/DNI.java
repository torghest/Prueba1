/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bloque1.Calculos;

/**
 *
 * @author alumno
 */
public class DNI {
    
    private int n_DNI;
    private String letra;
    
    public DNI(String n_DNI){
        this.n_DNI = Integer.parseInt(n_DNI);
        calcularLetra();
    }
    
    private void calcularLetra(){
        String dniLetra = "TRWAGMYFPDXBNJZSQVHLCKET";
        letra = dniLetra.charAt(n_DNI - (((int)(n_DNI/23)) * 23)) + "";
    }
    
    public String getDNI(){
        return String.valueOf(n_DNI);
    }
    
    public int getNumDNI(){
        return n_DNI;
    }
    
    public String getLetra(){
        return letra;
    }
    
}
