// FabricaCarros.java
public class FabricaCarros implements VeiculoFactory {
    @Override
    public Motor criarMotor() {
        return new MotorCombustao();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSedan();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasAro17();
    }

    @Override
    public Assentos criarAssentos() {
        return new AssentosCouro();
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
