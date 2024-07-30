public class MotorEletrico implements Motor {
    @Override
    public void exibirTipo() {
        System.out.println("Motor Elétrico");
    }

    @Override
    public double calcularPreco() {
        return 5000.0; // Preço do motor elétrico.
    }

    @Override
    public String toString() {
        return "Motor Elétrico";
    }
}
