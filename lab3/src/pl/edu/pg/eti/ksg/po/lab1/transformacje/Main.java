package pl.edu.pg.eti.ksg.po.lab1.transformacje;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Skalowanie;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.BrakTransformacjiOdwrotnejException;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Transformacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Obrot;

public class Main {

    public static void main(String[] args) {
	/*Punkt a = new Punkt(11, 9);
    Punkt b = new Punkt(1, -3);

    System.out.println(a);
    System.out.println("Porównanie punktów");
    if(a.equals(b)) {
        System.out.println("Punkty A" + a + " oraz B" + b + " są równe");
    }else
    {
        System.out.println("Punkty A" + a + " oraz B" + b + " nie są równe");
    }
    System.out.println("Funkcja hashcode: " + a.hashCode());*/

        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);

        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Punkt p1 = new Punkt(10, 3);
            Transformacja tr3 = new Obrot(30);
            System.out.println(tr3);
            System.out.println(p1);
            Punkt p2 = tr3.transformuj(p1);
            System.out.println(p2);
            Transformacja trr3 = tr3.getTransformacjaOdwrotna();
            System.out.println(trr3);
            Punkt p3 = trr3.transformuj(p2);
            System.out.println(p3);
        }catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }

        try
        {
            ZlozenieTransformacji zlozenie = new ZlozenieTransformacji(3);

            zlozenie.tab[0] = new Translacja(5, 3);
            zlozenie.tab[1] = new Skalowanie(10, 11);
            zlozenie.tab[2] = new Obrot(90);


            Punkt p = new Punkt(2, 3);
            p = zlozenie.tab[0].transformuj(p);
            System.out.println(p);
            p = zlozenie.tab[1].transformuj(p);
            System.out.println(p);
            p = zlozenie.tab[2].transformuj(p);
            System.out.println(p);

            zlozenie.tab[0] = zlozenie.tab[0].getTransformacjaOdwrotna();
            Punkt p1 = new Punkt(21, 33);
            p1 = zlozenie.tab[0].transformuj(p1);
            System.out.println(p1);

        }catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
    }
}
