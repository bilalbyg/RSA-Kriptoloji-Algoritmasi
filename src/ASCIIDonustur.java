import java.util.ArrayList;

public class ASCIIDonustur {
    private static ASCIIDonustur asciiDonustur;
    private ASCIIDonustur() {}
    public static ASCIIDonustur getInstance()
    {
        if(asciiDonustur == null)
        {
            asciiDonustur = new ASCIIDonustur();
        }
        return  asciiDonustur;
    }

    public ArrayList<String> asciiDonustur(String s)
    {
        ArrayList<String> ascii = new ArrayList<>();
        for(int i = 0;i < s.length();i++)
        {
            String asciiString = String.valueOf((int) s.charAt(i));
            ascii.add(asciiString);
        }
        tip_duzenle(ascii);
        return ascii;
    }

    public ArrayList<String> tip_duzenle(ArrayList<String> asciiDizi)
    {
        for(String s : asciiDizi)
        {
            if(Integer.parseInt(s) < 100)
            {
                String sıfırEkle = "0" + s;
                asciiDizi.set(asciiDizi.indexOf(s),sıfırEkle);
            }
        }
        return asciiDizi;
    }
}
