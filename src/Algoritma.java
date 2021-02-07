import javax.print.DocFlavor;
import java.util.ArrayList;

public class Algoritma {
    public static Algoritma algoritma;
    private int p; // Birinci asal sayi
    private int q; // İkinci asal sayi
    private int n; // p * q
    private int fi;
    private int e;
    private int d;
    private int[] asal_sayilar;
    private Algoritma()
    {
        asal_sayilar = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        p = asal_sayilar[(int) (Math.random() * 24)];
        q = asal_sayilar[(int) (Math.random() * 24)];
        fi = (p-1)*(q-1);
        e = e_bul(fi);
        d = d_bul(e,fi);
        System.out.println(" p : " + p );
        System.out.println(" q : " + q );
        System.out.println(" fi : " + fi );

    }

    public static Algoritma getInstance()
    {
        if(algoritma == null)
        {
            algoritma = new Algoritma();
        }
        return algoritma;
    }

    public int e_bul(int fi)
    {
        ArrayList<Integer> aralarindaAsal = new ArrayList<>();
        for(int i = 1;i < fi;i++)
        {
            if(gcd(i,fi) == 1)
            {
                aralarindaAsal.add(i);
            }
        }
        int e = aralarindaAsal.get((int) (Math.random() * aralarindaAsal.size()));
        //for(Integer a : aralarindaAsal){System.out.println(a);}
        System.out.println(" e : " + e);
        return e;
    }

    public int d_bul(int e,int fi)
    {
        int d = 1;
        for(int i = 1;i < fi;i++)
        {
            if((e * i ) % fi == 1)
            {
                d = i;
            }
        }
        System.out.println(" d : " + d);
        return d;
    }

    public int gcd(int x,int y)
    {
        if(x == 0 || y == 0)
        {
            return 0;
        }
        if(x == y)
        {
            return x;
        }
        if(x > y)
        {
            return gcd(x-y,y);
        }
        else
        {
            return gcd(x,y-x);
        }
    }

    public ArrayList<String> parcala(ArrayList<String> parcalanmamisDizi, int n)
    {
        ArrayList<String> parcalanmisDizi = new ArrayList<>();
        int l_clear = 0;
        String text = "";
        if(n > 10 && n < 100)
        {
            l_clear = 1;
        }
        else if(n < 10)
        {
            l_clear = 1;
        }
        else if(n >= 100 && n < 1000)
        {
            l_clear = 2;
        }
        else if(n >= 1000 && n < 10000)
        {
            l_clear = 3;
        }

        for(String s : parcalanmamisDizi)
        {
            text = text + s;
            if(text.length() % l_clear == 0)
            {
                text = text + ".";
            }
        }

        while(text.length() != 0)
        {
            String parca = String.valueOf(text.split("."));
            parcalanmamisDizi.add(parca);
        }
        return parcalanmisDizi;
    }
}
