
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
    
    public String Soma(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        
        int indexSoma = operadores.indexOf("+");
        
        System.out.println("Index of soma: " + indexSoma);  
        
        //montar a string e adicionar valores resolvidos

        String num1;

        if(indexSoma > 0)
        {
            if("-".equals(operadores.get(indexSoma-1)))
            {
                num1 = numeros.get(indexSoma);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexSoma);
                System.out.println("Num1: " + num1);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexSoma);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexSoma);
                System.out.println("Num1: " + num1);
            }
        }

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
                if(num1.startsWith("-") && resultSoma > 0)
                {
                    expressao.replace(expressao.length()-1, expressao.length() , "+");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
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
    
    public String Sub(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        int indexSub = operadores.indexOf("-");
        System.out.println("Index of Sub: " + indexSub);            

        //montar a string e adicionar valores resolvidos
        String num1;

        if(indexSub > 0)
        {
            if("-".equals(operadores.get(indexSub-1)))
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
        } else {
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
                if(num1.startsWith("-") && resultSoma > 0)
                {
                    expressao.replace(expressao.length()-1, expressao.length() , "+");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
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
    
    public String Multi(String str, ArrayList<String> numeros, ArrayList<String> operadores){
        //multi
        int indexMulti = operadores.indexOf("*");
        System.out.println("Index of Multi: " + indexMulti);            

        //montar a string e adicionar valores resolvidos
        String num1;

        if(indexMulti > 0)
        {
            if("-".equals(operadores.get(indexMulti-1)))
            {
                num1 = numeros.get(indexMulti);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexMulti);
                System.out.println("Num1: " + num1);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexMulti);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexMulti);
                System.out.println("Num1: " + num1);
            }
        }    

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
    
    String Div (String str, ArrayList<String> numeros, ArrayList<String> operadores){
        int indexDiv = operadores.indexOf("/");
        System.out.println("Index of soma: " + indexDiv);            

        //montar a string e adicionar valores resolvidos
        String num1;

        if(indexDiv > 0)
        {
            if("-".equals(operadores.get(indexDiv-1)))
            {
                num1 = numeros.get(indexDiv);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexDiv);
                System.out.println("Num1: " + num1);
            }
        } else {
            if(str.startsWith("-"))
            {
                num1 = numeros.get(indexDiv);
                num1 = "-" + num1;
                System.out.println("Num1: " + num1);
            } 
            else 
            {
                num1 = numeros.get(indexDiv);
                System.out.println("Num1: " + num1);
            }
        }          

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
}
