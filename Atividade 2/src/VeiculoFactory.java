// VeiculoFactory.java
public interface VeiculoFactory {
    Motor criarMotor();
    Carroceria criarCarroceria();
    Rodas criarRodas();
    Assentos criarAssentos();
    SistemaEletrico criarSistemaEletrico();
    double calcularPrecoTotal();
}
