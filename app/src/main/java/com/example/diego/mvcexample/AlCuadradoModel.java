package com.example.diego.mvcexample;

/**
 * Created by diego on 6/03/18.
 */

public class AlCuadradoModel {

    private int resultado;

    AlCuadradoActivity a = new AlCuadradoActivity();

    public void alCuadrado(String data)
    {
        if(data.equals(""))
        {
            a.showError("Campo vacio");
        }
        else
        {
            resultado = Integer.parseInt(data)*Integer.parseInt(data);;
            a.showResult(String.valueOf(resultado));
        }

    }
}
