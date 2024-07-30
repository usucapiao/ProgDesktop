// SistemaEletricoAvancado.java
public class SistemaEletricoAvancado implements SistemaEletrico {
    @Override
    public void exibirTipo() {
        System.out.println("Sistema Elétrico Avançado");
    }

    @Override
    public double calcularPreco() {
        return 3000.0;// Preço do sistema elétrico básico.
    }

    @Override
    public String toString() {
        return "Sistema Elétrico Avançado";
    }
}
