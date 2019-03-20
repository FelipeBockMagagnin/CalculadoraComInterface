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
public class TesteInterpretador {
    
    Interpretador inter;
    
    
    public TesteInterpretador() {
        inter = new Interpretador();        
    }   
    
    @Test
    public void TesteSepararOperacoes()
    {
        String expressao = "13-233+54-34+434*4/2";
        
        ArrayList<String> ResultEsperado = new ArrayList(); 
        ResultEsperado.add("-");
        ResultEsperado.add("+");
        ResultEsperado.add("-");
        ResultEsperado.add("+");
        ResultEsperado.add("*");
        ResultEsperado.add("/");
        
        ArrayList<String> ResultEncontrado = new ArrayList();
        ResultEncontrado = inter.SepararOperacoes(expressao);
        
        assertEquals(ResultEsperado, ResultEncontrado);       
    }
    
    @Test
    public void TesteSepararNumeros()
    {
        String expressao = "13-233+54-34+434*4/2";
        
        ArrayList<String> ResultEsperado = new ArrayList(); 
        ResultEsperado.add("13");
        ResultEsperado.add("233");
        ResultEsperado.add("54");
        ResultEsperado.add("34");
        ResultEsperado.add("434");
        ResultEsperado.add("4");
        ResultEsperado.add("2");
        
        ArrayList<String> ResultEncontrado = new ArrayList();
        ResultEncontrado = inter.SepararNumeros(expressao);
        
        assertEquals(ResultEsperado, ResultEncontrado);       
    }
    
    @Test
    public void TesteContar()
    {
        String expressao = "13-233+54-34+434*4/2";
        
        String ResultEsperado = "668";
        
        while(inter.SaberConta(expressao) != 0)
        {
            expressao = inter.Contar(expressao);
        }
        
        String ResultEncontrado= expressao;
        
        assertEquals(ResultEsperado, ResultEncontrado);   
    }    
}
