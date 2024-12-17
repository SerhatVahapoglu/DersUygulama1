public class SporArabaFactory implements IAracFactory {
    public IMotor motorOlustur() {
        return new SporArabaMotor();
    }

    public ILastik lastikOlustur() {
        return new SporArabaLastik();
    }

    public IIçMekan icMekanOlustur() {
        return new SporArabaIcMekan();
    }
}