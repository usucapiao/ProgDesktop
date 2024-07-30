public class MotorCombustao implements Motor {
    @Override
    public void exibirTipo() {
        System.out.println("Motor à Combustão");
    }

    @Override
    public double calcularPreco() {
        return 3000.0; // Preço do motor à combustão.
    }

    @Override
    public String toString() {
        return "Motor à Combustão";
    }
}
