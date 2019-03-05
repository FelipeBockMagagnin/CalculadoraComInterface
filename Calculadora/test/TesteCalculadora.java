/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TesteSoma() 
    {
        double a = 5;
        double b = 5;
        double resultEsperado = 10;
        //double resultado = calc.Soma("5 + 5");
        //(resultado, 0, resultEsperado);
    }
    
    @Test 
    public void TesteSub()
    {
        double a = 5;
        double b = 5;
        double resultEsperado = 0;
        //double resultado = calc.Sub("5 - 5");
        //assertEquals(resultado, 0, resultEsperado);
    }
    
    @Test 
    public void TesteDiv()
    {
        double a = 5;
        double b = 5;
        double resultEsperado = 1;
        //double resultado = calc.Div(a,b);
        //assertEquals(resultado, 0, resultEsperado);
    }
    
    @Test 
    public void TesteMulti()
    {
        double a = 5;
        double b = 5;
        double resultEsperado = 25;
        //double resultado = calc.Div(a,b);
        //assertEquals(resultado, 0, resultEsperado);
    }    
}
