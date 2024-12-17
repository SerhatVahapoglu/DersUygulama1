public class SedanFactory implements IAracFactory {
    public IMotor motorOlustur() {
        return new SedanMotor();
    }

    public ILastik lastikOlustur() {
        return new SedanLastik();
    }

    public IIçMekan icMekanOlustur() {
        return new SedanIcMekan();
    }
}