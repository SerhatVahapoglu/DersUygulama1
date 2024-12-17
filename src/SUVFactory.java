public class SUVFactory implements IAracFactory {
    public IMotor motorOlustur() {
        return new SUVMotor();
    }

    public ILastik lastikOlustur() {
        return new SUVLastik();
    }

    public IIçMekan icMekanOlustur() {
        return new SUVIcMekan();
    }
}
