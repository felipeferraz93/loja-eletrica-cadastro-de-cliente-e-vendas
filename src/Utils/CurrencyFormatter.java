/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.NumberFormat;

/**
 *
 * @author Felipe
 */
public class CurrencyFormatter {    
    public String real(Double d){
         
        String valor = NumberFormat.getCurrencyInstance().format(d);
    
        return valor;        
    }
}
