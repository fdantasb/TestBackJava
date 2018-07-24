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
}