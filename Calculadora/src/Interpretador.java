/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felpi
 */
public class Interpretador {

    //retorna o valor da primeira conta 
    // 0 = Nenhuma conta
    // 1 = parenteses
    // 2 = multiplicação
    // 3 = divisão
    // 4 = soma 
    // 5 = subtração
    public int SaberPrimeiraConta(String str)
    {
        if(str.contains("(") || str.contains(")"))
        {
            return 1;
        }
        else if (str.contains("*"))
        {
            return 2;
        } 
        else if (str.contains("/"))
        {
            return 3;
        } 
        else if (str.contains("+"))
        {
            return 4;
        } 
        else if (str.contains("-"))
        {
            return 5;
        } 
        else 
        {
            return 0; 
        }
    }
    
    Interpretador()
    {
        Calculadora calc = new Calculadora();
    }
}
