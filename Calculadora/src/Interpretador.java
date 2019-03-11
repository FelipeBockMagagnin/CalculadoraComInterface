
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
            return 1;
        }
        else if (str.contains("*"))
        {
            calc.Multi(str);
            return 2;            
        } 
        else if (str.contains("/"))
        {
            calc.Div(str);
            return 3;
        } 
        else if (str.contains("+"))
        {
            calc.Soma(str);
            return 4;
        } 
        else if (str.contains("-"))
        {
            calc.Sub(str);
            return 5;
        } 
        else 
        {
            return 0; 
        }       
    }
    
    
    public String Contar(String str)
    {
        //separar em camadas
        ArrayList<String> numeros = new ArrayList();
        ArrayList<String> operadores = new ArrayList();     
        
        numeros = SepararNumeros(str);
        System.out.println("");
        operadores = SepararOperacoes(str);
        System.out.println("");
        
        int conta = SaberConta(str);
        
        if(conta == 2)
        {
            //multi
            int indexMulti = operadores.indexOf("*");
            System.out.println("Index of Multi: " + indexMulti);            
            
            //montar a string e adicionar valores resolvidos
            String num1 = numeros.get(indexMulti);
            System.out.println("Num1: " + num1);
            String num2 = numeros.get(indexMulti+1);
            System.out.println("Num2: " + num2);           
            
            int resultMulti = Integer.parseInt(num1) * Integer.parseInt(num2);            
            String result = Integer.toString(resultMulti);            
            System.out.println("Result Multi: " + result);
            
            
            StringBuilder expressao = new StringBuilder();
            
            for(int x = 0; x < numeros.size(); x++)
            {
                if(x == indexMulti)
                {
                    //nao faz nada
                } 
                else if(x== (indexMulti+1))
                {
                    //adiciona resultado
                    expressao.append(result);
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }
                }
                else 
                {
                    expressao.append(numeros.get(x));
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }                    
                }
                System.out.println(expressao);
            }
            System.out.println("Expressao multi resolvida pronto: " + expressao);
            return expressao.toString();
        }  
        else if (conta == 3)
        {
            int indexDiv = operadores.indexOf("/");
            System.out.println("Index of soma: " + indexDiv);            
            
            //montar a string e adicionar valores resolvidos
            String num1 = numeros.get(indexDiv);
            System.out.println("Num1: " + num1);
            String num2 = numeros.get(indexDiv+1);
            System.out.println("Num2: " + num2);           
            
            int resultSoma = Integer.parseInt(num1) / Integer.parseInt(num2);            
            String result = Integer.toString(resultSoma);            
            System.out.println("Result div: " + result);
            
            
            StringBuilder expressao = new StringBuilder();
            
            for(int x = 0; x < numeros.size(); x++)
            {
                if(x == indexDiv)
                {
                    //nao faz nada
                } 
                else if(x== (indexDiv+1))
                {
                    //adiciona resultado
                    expressao.append(result);
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }
                }
                else 
                {
                    expressao.append(numeros.get(x));
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }                    
                }
                System.out.println(expressao);
            }
            System.out.println("Expressao multi resolvida pronto: " + expressao); 
            return expressao.toString();
        }
        else if(conta == 4)
        {            
            int indexSoma = operadores.indexOf("+");
            System.out.println("Index of soma: " + indexSoma);            
            
            //montar a string e adicionar valores resolvidos
            String num1 = numeros.get(indexSoma);
            System.out.println("Num1: " + num1);
            String num2 = numeros.get(indexSoma+1);
            System.out.println("Num2: " + num2);           
            
            int resultSoma = Integer.parseInt(num1) + Integer.parseInt(num2);            
            String result = Integer.toString(resultSoma);            
            System.out.println("Result soma: " + result);
            
            
            StringBuilder expressao = new StringBuilder();
            
            for(int x = 0; x < numeros.size(); x++)
            {
                if(x == indexSoma)
                {
                    //nao faz nada
                } 
                else if(x== (indexSoma+1))
                {
                    //adiciona resultado
                    expressao.append(result);
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }
                }
                else 
                {
                    expressao.append(numeros.get(x));
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }                    
                }
                System.out.println(expressao);
            }
            System.out.println("Expressao soma resolvida pronto: " + expressao);
            return expressao.toString();

        }
        else if(conta == 5 && operadores.size() > 0)
        {
            int indexSub = operadores.indexOf("-");
            System.out.println("Index of Sub: " + indexSub);            
            
            //montar a string e adicionar valores resolvidos
            String num1;
            
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexSub);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexSub);
                System.out.println("Num1: " + num1);
            }
            
            String num2 = numeros.get(indexSub+1);
            System.out.println("Num2: " + num2);           
            
            int resultSoma = Integer.parseInt(num1) - Integer.parseInt(num2);            
            String result = Integer.toString(resultSoma);            
            System.out.println("Result sub: " + result);
            
            
            StringBuilder expressao = new StringBuilder();
            
            for(int x = 0; x < numeros.size(); x++)
            {
                if(x == indexSub)
                {
                    //nao faz nada
                } 
                else if(x == (indexSub+1))
                {
                    //adiciona resultado
                    expressao.append(result);
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }
                }
                else 
                {
                    expressao.append(numeros.get(x));
                    if(x != numeros.size()-1){
                        expressao.append(operadores.get(x));
                    }                    
                }
                System.out.println(expressao);
            }
            System.out.println("Expressao sub resolvida pronto: " + expressao);
            return expressao.toString();
        }
        else 
        {
            return str.replace("-", "negative");
            
        }        
    }
    
    public ArrayList<String> SepararNumeros(String str)
    {
        //expressão para separar em camadas
        //(\w++\+)|(\w++\*)|(\w++\/)|(\w++\-)|(\w++)
        
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
        //expressão para separar em camadas
        //(\w++\+)|(\w++\*)|(\w++\/)|(\w++\-)|(\w++)
                
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
