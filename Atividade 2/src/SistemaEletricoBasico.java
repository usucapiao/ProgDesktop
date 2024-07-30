// SistemaEletricoBasico.java
public class SistemaEletricoBasico implements SistemaEletrico {
    @Override
    public void exibirTipo() {
        System.out.println("Sistema Elétrico Básico");
    }

    @Override
    public double calcularPreco() {
        return 1000.0;// Preço do sistema elétrico básico.
    }

    @Override
    public String toString() {
        return "Sistema Elétrico Básico";
    }
}
