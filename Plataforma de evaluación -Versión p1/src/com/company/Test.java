package com.company;
import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Test {

    public String[] getEvaluacion()
    {
        String p[] = {"Suelo preocuparme en lugares con muchas personas","Me molesta la compañia de otros", "Todos son molestos", "No tengo pregunta bro", " Lo siento falle "};

        return(p);

    }

    public int Sumatoria(int[] resp)
    {
        int acum=0;

        for (int i = 0; i < 5; i++){
            acum = acum+resp[i];
        }

        return(acum);
    }

    public int CalcularPorcentaje(int sum)
    {

        int por;

        por=(sum*100)/25;

         return(por);
    }

    public int CalcularRadio(int sum)
    {
        int radio;

        radio = (sum*360)/25;

        return(radio);
    }

}
