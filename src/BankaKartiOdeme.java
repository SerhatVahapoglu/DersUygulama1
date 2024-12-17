public class BankaKartiOdeme implements IOdemeStratejisi {
    public void odemeYap(double tutar) {
        System.out.println("Banka kartı ile " + tutar + " TL ödendi.");
    }
}
