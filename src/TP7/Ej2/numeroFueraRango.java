package TP7.Ej2;

public class numeroFueraRango extends RuntimeException
{
    public numeroFueraRango() { }

    public numeroFueraRango(String msjError)
    {
        super(msjError);
    }
}