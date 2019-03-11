/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
/**
 *
 * @author felipe.090999
 */
public class Calculadora {
    
    //expressão para separar em camadas
    //(\w++\+)|(\w++\*)|(\w++\/)|(\w++\-)|(\w++)
    
    //expressão para retornar apenas os numeros
    //\w++
    
    String Soma(String expressao){
        
        return "Somou";
       
    }
    
    String Sub(String expressao){
        return "Subtraiu";
    }
    
    String Multi(String expressao){
        //pega uma string
        //resolver a parte da string com a multiplicação
        //tirar da strign os valores n resolvidos 
        //e por de volta os valores resolvidos       
        return "Multiplicou";
    }
    
    String Div (String expressao){
        return "Dividiu";
    }
}
