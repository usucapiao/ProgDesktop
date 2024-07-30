public class CarroceriaSedan implements Carroceria {
    @Override
    public void exibirTipo() {
        System.out.println("Carroceria Sedan");
    }

    @Override
    public double calcularPreco() {
        return 7000.0; // Preço da carroceria sedan.
    }

    @Override
    public String toString() {
        return "Carroceria Sedan";
    }
}
