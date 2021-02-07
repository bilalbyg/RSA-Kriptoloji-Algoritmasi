import java.util.ArrayList;

public class Gui {
    public static void main(String[] args) {
        //Form f = new Form();
        ASCIIDonustur asciiDonustur = ASCIIDonustur.getInstance();
        ArrayList<String> ascii = asciiDonustur.asciiDonustur("java");
        for(String s : ascii)
        {
            System.out.println(s);
        }
        //Algoritma algoritma = Algoritma.getInstance();
        //System.out.println(algoritma.gcd(36,79));
    }
}

