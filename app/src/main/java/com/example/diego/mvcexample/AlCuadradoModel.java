package com.example.diego.mvcexample;

/**
 * Created by diego on 6/03/18.
 */

public class AlCuadradoModel {

    private String resultado;

    public String alCuadrado(String r)
    {
        double d = Double.valueOf(r)* Double.valueOf(r);
        return String.valueOf(d);
    }
}
