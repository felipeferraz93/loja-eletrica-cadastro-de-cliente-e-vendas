/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Felipe
 */
public class DataFormatter {
    
    public String dataBrasil(String d){
        String[] separado = d.split("-");
        String junta = separado[2] + "/" + separado[1] + "/" + separado[0];
        
        return junta;
    }
    
}
