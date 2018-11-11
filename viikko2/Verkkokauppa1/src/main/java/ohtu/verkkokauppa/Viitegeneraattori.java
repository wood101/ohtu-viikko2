package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitteenGenerointi {

    private static Viitegeneraattori instanssi;
    
    private int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
