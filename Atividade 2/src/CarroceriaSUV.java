public class CarroceriaSUV implements Carroceria {
    @Override
    public void exibirTipo() {
        System.out.println("Carroceria SUV");
    }

    @Override
    public double calcularPreco() {
        return 10000.0; // Preço da carroceria SUV.
    }

    @Override
    public String toString() {
        return "Carroceria SUV";
    }
}
