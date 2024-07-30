public class AssentosTecido implements Assentos {
    @Override
    public void exibirTipo() {
        System.out.println("Assentos de Tecido");
    }

    @Override
    public double calcularPreco() {
        return 800.0; // Preço dos assentos de tecido.
    }

    @Override
    public String toString() {
        return "Assentos de Tecido";
    }
}
