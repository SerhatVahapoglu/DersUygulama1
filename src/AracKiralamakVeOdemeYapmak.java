public class AracKiralamakVeOdemeYapmak {

    public void aracKirala(String aracTipi) {
        if (aracTipi.equalsIgnoreCase("sedan")) {
            System.out.println("SEDAN hazırlanıyor:");
            IAracFactory factory = new SedanFactory();
            factory.motorOlustur().motorUret();
            factory.lastikOlustur().lastigiUret();
            factory.icMekanOlustur().dizaynEt();
        }
        else if (aracTipi.equalsIgnoreCase("suv")) {
            System.out.println("SUV hazırlanıyor:");
            IAracFactory factory = new SUVFactory();
            factory.motorOlustur().motorUret();
            factory.lastikOlustur().lastigiUret();
            factory.icMekanOlustur().dizaynEt();
        }
        else if (aracTipi.equalsIgnoreCase("spor araba")) {
            System.out.println("SPOR ARABA hazırlanıyor:");
            IAracFactory factory = new SporArabaFactory();
            factory.motorOlustur().motorUret();
            factory.lastikOlustur().lastigiUret();
            factory.icMekanOlustur().dizaynEt();
        }
        else {
            System.out.println("Hatalı araç tipi seçimi: " + aracTipi);
        }
    }

    public void odemeYap(String odemeYontemi, double tutar) {
        if (odemeYontemi.equalsIgnoreCase("kredi kartı")) {
            IOdemeStratejisi odeme = new KrediKartiOdeme();
            odeme.odemeYap(tutar);
        }
        else if (odemeYontemi.equalsIgnoreCase("banka kartı")) {
            IOdemeStratejisi odeme = new BankaKartiOdeme();
            odeme.odemeYap(tutar);
        }
        else if (odemeYontemi.equalsIgnoreCase("nakit")) {
            IOdemeStratejisi odeme = new NakitOdeme();
            odeme.odemeYap(tutar);
        }
        else {
            System.out.println("Geçersiz ödeme yöntemi: " + odemeYontemi);
        }
    }
}
