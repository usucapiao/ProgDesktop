// FabricaCaminhoes.java
public class FabricaCaminhoes implements VeiculoFactory {
    @Override
    public Motor criarMotor() {
        return new MotorCombustao(); // Pode ser alterado para um tipo mais potente
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSUV(); // Pode ser alterado para um tipo mais adequado para caminhões
    }

    @Override
    public Rodas criarRodas() {
        return new RodasAro20(); // Pode ser alterado para um tipo mais adequado para caminhões
    }

    @Override
    public Assentos criarAssentos() {
        return new AssentosTecido(); // Pode ser alterado para um tipo mais adequado para caminhões
    }

    @Override
    public SistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoAvancado();
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
