
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    Calculadora calc = new Calculadora();
    
    //retorna o valor da primeira conta 
    // 0 = Nenhuma conta
    // 1 = parenteses
    // 2 = multiplicação
    // 3 = divisão
    // 4 = soma 
    // 5 = subtração
    public int SaberConta(String str)
    {
        if(str.contains("(") || str.contains(")"))
        {
            System.out.println("Parenteses");
            return 1;            
        }
        else if (str.contains("*"))
        {
            System.out.println("Multi");
            return 2;            
        } 
        else if (str.contains("/"))
        {
            System.out.println("Div");
            return 3;
        } 
        else if (str.contains("+"))
        {
            System.out.println("soma");
            return 4;
        } 
        else if (str.contains("-"))
        {
            System.out.println("Sub");
            return 5;
        } 
        else 
        {
            System.out.println("Fim");
            return 0; 
        }       
    }
    
    public String ResolveParenteses(String str){
        String expressaoCompleta = str;
        String expressaoRetirada = RetiraParenteses(str);   
        
        expressaoRetirada = Contar(expressaoRetirada);  

        expressaoCompleta = expressaoCompleta.replaceAll("\\([^()]+\\)", expressaoRetirada);
        System.out.println("Expressao completa: "+ expressaoCompleta);
        return expressaoCompleta;
    }
    
    public String RetiraParenteses(String str){              
        Pattern p = Pattern.compile("\\([^()]+\\)", Pattern.MULTILINE);        
        Matcher m = p.matcher(str);
        System.out.println("Expressao: " + str);
        String expressaoRetirada;     
        
        if(m.find()){
            expressaoRetirada = m.group();
            expressaoRetirada = expressaoRetirada.replaceAll("\\(|\\)", "");
            System.out.println("Expressao Retirada: " + expressaoRetirada);
            return expressaoRetirada;
        } 
        else {
            System.out.println("Não deu match");
            return "0";
        }        
    }
    
    public String Contar(String str)
    {
        System.out.println("**************************************************************");
        System.out.println("Expressao: " + str);
        //corrige pequenos bugs
        str = str.replaceAll("--", "-");        
        
        //cria arrays de numeros e operadores
        ArrayList<String> numeros;
        ArrayList<String> operadores;     
        
        numeros = SepararNumeros(str);
        System.out.println("");
        operadores = SepararOperacoes(str);
        System.out.println("");
     
        //Descobre a primeira conta a ser resolvida
        int conta = SaberConta(str);    
        
        if(conta == 1){
            return ResolveParenteses(str);
        }
        else if(conta == 2)
        {
            return calc.Multi(str, numeros, operadores);
        }  
        else if (conta == 3)
        {
            return calc.Div(str, numeros, operadores);
        }
        else if(conta == 4)
        {   
            return calc.Soma(str, numeros, operadores);
        }
        else if(conta == 5 && operadores.size() > 0)
        {
            return calc.Sub(str, numeros, operadores);
        }
        else 
        {
            return str.replace("-", "negative");
        }        
    }
    
    public ArrayList<String> SepararNumeros(String str)
    {
        //separa todos os numeros da expressao e retorna um array
        ArrayList<String> numeros = new ArrayList();        
        Pattern p = Pattern.compile("(?<=-|\\+|\\*|\\/)\\-\\d+|\\d+");        
        Matcher m = p.matcher(str);
                
        while(m.find())
        {
            numeros.add(m.group());
        }
        
        for(String num:numeros)
        {
            System.out.print("Numero: " + num + ", ");
        }
        
        //numeros foram separados no arraylist numeros        
        return numeros;      
    }
    
    public ArrayList<String> SepararOperacoes(String str)
    {
        //Separa todos os operadores da expressão sem contar o - de numeros
        ArrayList<String> operacoes = new ArrayList();        
        Pattern p = Pattern.compile("((?<!\\-)\\+|\\*|\\/)|((?<=\\d|\\n)\\-)");        
        Matcher m = p.matcher(str);
                
        while(m.find())
        {
            operacoes.add(m.group());
        }
        
        for(String num:operacoes)
        {
            System.out.print("Operacao: " + num + ", ");
        }
        
        //numeros foram separados no arraylist numeros        
        return operacoes;      
    }
}
