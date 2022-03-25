package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja{
    public Transformacja tab[];
    public final int n;
    public ZlozenieTransformacji(int n)
    {
        this.n = n;
        this.tab = new Transformacja[n];
    }
    public Transformacja[] getTab()
    {
        return tab;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        return null;
    }
    @Override
    public Punkt transformuj(Punkt p)
    {
        return null;
    }
}
