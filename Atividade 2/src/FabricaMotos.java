// FabricaMotos.java
public class FabricaMotos implements VeiculoFactory {
    @Override
    public Motor criarMotor() {
        return new MotorCombustao();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSedan(); // Pode ser uma implementação mais adequada para motos
    }

    @Override
    public Rodas criarRodas() {
        return new RodasAro17(); // Pode ser alterado para um tipo mais adequado para motos
    }

    @Override
    public Assentos criarAssentos() {
        return new AssentosCouro(); // Pode ser alterado para um tipo mais adequado para motos
    }

    @Override
    public SistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoBasico();
    }

    @Override
    public double calcularPrecoTotal() {
        return criarMotor().calcularPreco() +
                criarCarroceria().calcularPreco() +
                criarRodas().calcularPreco() +
                criarAssentos().calcularPreco() +
                criarSistemaEletrico().calcularPreco();
    }
}
