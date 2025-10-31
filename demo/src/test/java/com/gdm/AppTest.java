package com.gdm;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSources;

public class AppTest{
    @ParameterizedTest
    @CsvSource({
        "10, 9, X = 19",
        "-10, 4, X = -6",
        "15, -7, X = 8"
    })
    void testaSoma(int a, int b, String resultadoEsperado){
        bee1001 calc = new bee1001();
        assertEquals(resultadoEsperado, calc.soma(a,b));
    }

    @ParameterizedTest
    @CsvSource({
        "2.00, A=12.5664",
        "100.64, A=31819.3103",
        "150.00, A=70685.7750"
    })
    void testaAreaCirculo(int r, String resultadoEsperado){
        bee1002 calc = new bee1002();
        assertEquals(resultadoEsperado, calc.areaCirculo(r));
    }
}
