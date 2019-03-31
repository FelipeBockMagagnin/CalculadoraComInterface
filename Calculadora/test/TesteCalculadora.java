/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felpi
 */
public class TesteCalculadora {
    
    Calculadora calc;
    
    public TesteCalculadora() {
        calc = new Calculadora();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example
    
    
    ArrayList<String> numeros = new ArrayList();
    ArrayList<String> operacoes = new ArrayList();
    String str;
    
    @Test
    public void TesteSoma() 
    {
        numeros.clear();
        numeros.add("3");
        numeros.add("4");
        operacoes.add("+");
        str = "3+4";
        String resultEsperado = "7";
        String resultado = calc.Soma(str, numeros, operacoes);
        assertEquals(resultado, resultEsperado);
        ParaBonito(str, resultado, resultEsperado, "Soma");
    }
    
    @Test 
    public void TesteSub()
    {
        numeros.clear();
        numeros.add("3");
        numeros.add("4");
        operacoes.add("-");
        str = "3-4";
        String resultEsperado = "-1";
        String resultado = calc.Sub(str, numeros, operacoes);
        assertEquals(resultado, resultEsperado);
        ParaBonito(str, resultado, resultEsperado, "Sub");
    }
    
    @Test 
    public void TesteDiv()
    {
        numeros.clear();
        numeros.add("8");
        numeros.add("4");
        operacoes.add("/");
        str = "8/4";
        String resultEsperado = "2";
        String resultado = calc.Div(str, numeros, operacoes);
        assertEquals(resultado, resultEsperado);
        ParaBonito(str, resultado, resultEsperado, "Divisão");
    }
    
    @Test (expected = ArithmeticException.class)
    public void TesteDivZero()
    {
        numeros.clear();
        numeros.add("8");
        numeros.add("0");
        operacoes.add("/");
        str = "8/0";
        String resultEsperado = "0";
        String resultado = calc.Div(str, numeros, operacoes);
        assertEquals(resultado, resultEsperado);
        ParaBonito(str, resultado, resultEsperado, "Divisão");
    }
    
    @Test 
    public void TesteMulti()
    {
        numeros.clear();
        numeros.add("8");
        numeros.add("2");
        operacoes.add("*");
        str = "8*2";
        String resultEsperado = "16";
        String resultado = calc.Multi(str, numeros, operacoes);
        assertEquals(resultado, resultEsperado);
        ParaBonito(str, resultado, resultEsperado, "Multiplicação");
    }    
    
    void ParaBonito(String str, String resultEsperado, String resultado, String conta){
        System.out.println("***********Teste " + conta + "***********");
        System.out.println("Expressão: " + str);
        System.out.println("Resultado Esperado: " + resultEsperado);
        System.out.println("Resultado Obtido: " + resultado);
        System.out.println("*******************************");
    }
}
