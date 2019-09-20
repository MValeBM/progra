package TP7.Ej3;

import java.util.InputMismatchException;

public class valorNoNumerico extends InputMismatchException
{
    //public valorNoNumerico() { }

    public valorNoNumerico(String msjError)
    {
        super(msjError);
    }
}