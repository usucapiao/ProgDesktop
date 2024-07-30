public class RodasAro20 implements Rodas {
    @Override
    public void exibirTipo() {
        System.out.println("Rodas Aro 20");
    }

    @Override
    public double calcularPreco() {
        return 3000.0; // Preço das rodas aro 20.
    }

    @Override
    public String toString() {
        return "Rodas Aro 20";
    }
}
