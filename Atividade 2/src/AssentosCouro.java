public class AssentosCouro implements Assentos {
    @Override
    public void exibirTipo() {
        System.out.println("Assentos de Couro");
    }

    @Override
    public double calcularPreco() {
        return 1500.0; // Preço dos assentos de couro.
    }

    @Override
    public String toString() {
        return "Assentos de Couro";
    }
}
