package pl.edu.pg.eti.ksg.po.lab1.transformacje;
import java.lang.Math;

public class Obrot implements Transformacja{
    private final double  alpha;
    public Obrot(double alpha) {
        this.alpha = Math.toRadians(alpha);
    }

    public double getAlpha() {
        return alpha;
    }

    @Override
    public Punkt transformuj(Punkt p)
    {
        return new Punkt(p.getX()*Math.cos(getAlpha()) - p.getY()*Math.sin(getAlpha()), p.getX()*Math.sin(getAlpha()) + p.getY()*Math.cos(getAlpha()));
    }
    @Override
    public Transformacja getTransformacjaOdwrotna()
    {
        return new Obrot(-getAlpha());
    }
}
