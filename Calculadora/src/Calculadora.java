
import java.util.ArrayList;

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
    
    /**
     * Retorna o resultado da primeira soma encontrada
     * 
     * @param str expressão completa
     * @param numeros numeros separados em um arraylist
     * @param operadores operações separadas em uma arraylist
     * @return 
     */
    public String Soma(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        //Descobre index da Soma
        int indexSoma = operadores.indexOf("+");
        System.out.println("Index of soma: " + indexSoma);  
        
        //Separa os 2 numeros, o depois da operação e o anterior a ela
        String num1;
        if(indexSoma > 0)
        {
            if("-".equals(operadores.get(indexSoma-1)))
            {
                num1 = numeros.get(indexSoma);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexSoma);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexSoma);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexSoma);
            }
        }
        System.out.println("Num1: " + num1);
        
        //Num 1 separado agora separa-se p numero 2
        String num2 = numeros.get(indexSoma+1);
        System.out.println("Num2: " + num2);           

        //Resultado colocado em uma variavel e transformado em String novamente
        int resultSoma = Integer.parseInt(num1) + Integer.parseInt(num2);            
        String result = Integer.toString(resultSoma);            
        System.out.println("Result soma: " + result);

        //A expressão é montada passo a passo usando StringBuilder
        StringBuilder expressao = new StringBuilder();
        for(int x = 0; x < numeros.size(); x++)
        {
            if(indexSoma == x){
                
            }
            else if(x== (indexSoma+1))
            {
                if(num1.startsWith("-") && resultSoma > 0)
                {
                    expressao.replace(expressao.length()-1, expressao.length() , "+");
                }
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
        System.out.println("Parte expressão: " + expressao);
        return expressao.toString();
    }
    
    /**
     * Retorna o resultado da primeira subtração encontrada
     * 
     * @param str expressão completa
     * @param numeros numeros separados em um arraylist
     * @param operadores operações separadas em uma arraylist
     * @return  
     */
    public String Sub(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        //Descobre index da subtração
        int indexSub = operadores.indexOf("-");
        System.out.println("Index of Sub: " + indexSub);            
        
        //separa os dois numeros da conta, antes e depois do "-"
        String num1;
        if(indexSub > 0)
        {
            if("-".equals(operadores.get(indexSub-1)))
            {
                num1 = numeros.get(indexSub);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexSub);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexSub);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexSub);
            }
        }
        System.out.println("Num1: " + num1);           

        //Numero 1 separado, agora é a vez do numero 2
        String num2 = numeros.get(indexSub+1);
        System.out.println("Num2: " + num2);           

        //bota o resultado em uma variavel e transforma em int novamente
        int resultSub = Integer.parseInt(num1) - Integer.parseInt(num2);            
        String result = Integer.toString(resultSub);            
        System.out.println("Result sub: " + result);
        
        //monta a expressão passo a passo colocando a expressão resolvida
        StringBuilder expressao = new StringBuilder();
        for(int x = 0; x < numeros.size(); x++)
        {
            if(indexSub == x){
                
            }
            else if(x == (indexSub+1))
            {
                if(num1.startsWith("-") && resultSub > 0)
                {
                    expressao.replace(expressao.length()-1, expressao.length() , "+");
                }
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
            System.out.println("Parte expressão: " + expressao);
        }
        System.out.println("Expressao subtração resolvida, resultado: " + expressao);
        return expressao.toString();
    }
    
    /**
     * Retorna o resultado da primeira multiplicação encontrada
     * 
     * @param str expressão completa
     * @param numeros numeros separados em um arraylist
     * @param operadores operações separadas em uma arraylist
     * @return  
     */
    public String Multi(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        //procura o index da primeira multiplicação
        int indexMulti = operadores.indexOf("*");
        System.out.println("Index da Multiplicação: " + indexMulti);            

        //Procura o numero anterior e posterior a "*"
        String num1;

        if(indexMulti > 0)
        {
            if("-".equals(operadores.get(indexMulti-1)))
            {
                num1 = numeros.get(indexMulti);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexMulti);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexMulti);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexMulti);
            }
        }    
        System.out.println("Num1: " + num1);
        
        //agora é encontrado o segundo numero
        String num2 = numeros.get(indexMulti+1);
        System.out.println("Num2: " + num2);           

        int resultMulti = Integer.parseInt(num1) * Integer.parseInt(num2);            
        String result = Integer.toString(resultMulti);            
        System.out.println("Result Multi: " + result);

        //é montada a expressão passo a passa
        StringBuilder expressao = new StringBuilder();

        for(int x = 0; x < numeros.size(); x++)
        {
            if(indexMulti == x){
                
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
            System.out.println("Parte expressão: " + expressao);
        }
        System.out.println("Expressao multi resolvida pronto: " + expressao);
        return expressao.toString();  
    }
    
    /**
     * Retorna o resultado da primeira Divisão encontrada
     * 
     * @param str expressão completa
     * @param numeros numeros separados em um arraylist
     * @param operadores operações separadas em uma arraylist
     * @return  
     */
    public String Div (String str, ArrayList<String> numeros, ArrayList<String> operadores){
        //procura o index da primeira divisão
        int indexDiv = operadores.indexOf("/");
        System.out.println("Index of soma: " + indexDiv);            

        //procura o numero anterior e posterior ao "/"
        String num1;
        if(indexDiv > 0)
        {
            if("-".equals(operadores.get(indexDiv-1)))
            {
                num1 = numeros.get(indexDiv);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexDiv);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexDiv);
                num1 = "-" + num1;
            } 
            else 
            {
                num1 = numeros.get(indexDiv);
            }
        }       
        System.out.println("Num1: " + num1);

        //hora de encontrar o segundo numero
        String num2 = numeros.get(indexDiv+1);
        System.out.println("Num2: " + num2); 
        
        //é feita a divisão e se tiver /0 é jogada uma exception que é tratada 
        //na main
        int resultDiv;
        try {
            resultDiv = Integer.parseInt(num1) / Integer.parseInt(num2);    
            System.out.println("resultado da divisão é: " + resultDiv);
        } catch (ArithmeticException e) { 
            resultDiv = 0; 
            System.out.println("Divisão por 0");
            throw e;
        }     
        String result = Integer.toString(resultDiv);  
        
        //a expressão é montada agora com o resultado no lugar
        StringBuilder expressao = new StringBuilder();

        for(int x = 0; x < numeros.size(); x++)
        {
            if(indexDiv == x){
                
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
            System.out.println("Parte expressão: " + expressao);
        }
        System.out.println("Expressao multi resolvida pronto: " + expressao); 
        return expressao.toString();
    }
}
