public class KrediKartiOdeme implements IOdemeStratejisi {
    public void odemeYap(double tutar) {
        System.out.println("Kredi kartı ile " + tutar + " TL ödendi.");
    }
}