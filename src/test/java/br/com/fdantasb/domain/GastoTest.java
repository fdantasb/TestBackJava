package br.com.fdantasb.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GastoTest {

    @Test(expected = IllegalArgumentException.class)
    public void dataFutura(){

        Calendar dataFutura = Calendar.getInstance();
        int hoje = dataFutura.get(Calendar.DAY_OF_MONTH);
        dataFutura.set(Calendar.DAY_OF_MONTH, hoje + 1);

        Gasto gasto = new Gasto();

        gasto.setData(dataFutura.getTime());
    }

    @Test
    public void dataPassada(){

        Calendar calendar = Calendar.getInstance();
        int mes = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONDAY, mes-1);

        Gasto gasto = new Gasto();
        gasto.setData(calendar.getTime());

        assertNotNull(gasto.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void valorNegativo(){
        Double negativo = new Double(-150);

        Gasto gasto = new Gasto();
        gasto.setValor(negativo);
    }

    
}