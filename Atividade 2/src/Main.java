// Importa a classe Scanner do pacote java.util para ler a entrada do usuário.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Cria instâncias das fábricas de veículos.
        VeiculoFactory fabricaCarros = new FabricaCarros();
        VeiculoFactory fabricaMotos = new FabricaMotos();
        VeiculoFactory fabricaCaminhoes = new FabricaCaminhoes();

        // Solicita ao usuário que escolha o tipo de veículo para personalizar.
        System.out.println("Escolha o tipo de veículo para personalizar:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");
        int escolhaVeiculo = scanner.nextInt();

        // Seleciona a fábrica apropriada com base na escolha do usuário.
        VeiculoFactory fabricaEscolhida = null;
        switch (escolhaVeiculo) {
            case 1:
                fabricaEscolhida = fabricaCarros;
                break;
            case 2:
                fabricaEscolhida = fabricaMotos;
                break;
            case 3:
                fabricaEscolhida = fabricaCaminhoes;
                break;
            default:
                System.out.println("Escolha inválida.");
                System.exit(1);
        }

        // Solicita ao usuário que escolha os componentes do veículo.
        Motor motor = escolherMotor(scanner);
        Carroceria carroceria = escolherCarroceria(scanner);
        Rodas rodas = escolherRodas(scanner);
        Assentos assentos = escolherAssentos(scanner);
        SistemaEletrico sistemaEletrico = escolherSistemaEletrico(scanner);

        // Exibe as escolhas do usuário e calcula o preço total do veículo.
        System.out.println("\nVeículo Personalizado:");
        motor.exibirTipo();
        carroceria.exibirTipo();
        rodas.exibirTipo();
        assentos.exibirTipo();
        sistemaEletrico.exibirTipo();
        System.out.println("Preço Total: " + (motor.calcularPreco() + carroceria.calcularPreco() + rodas.calcularPreco() + assentos.calcularPreco() + sistemaEletrico.calcularPreco()));
    }

    // Método para permitir ao usuário escolher o tipo de motor.
    private static Motor escolherMotor(Scanner scanner) {
        System.out.println("Escolha o tipo de motor:");
        System.out.println("1. Motor Elétrico");
        System.out.println("2. Motor à Combustão");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new MotorEletrico();
            case 2:
                return new MotorCombustao();
            default:
                System.out.println("Escolha inválida.");
                return escolherMotor(scanner);
        }
    }

    // Método para permitir ao usuário escolher o tipo de carroceria.
    private static Carroceria escolherCarroceria(Scanner scanner) {
        System.out.println("Escolha o tipo de carroceria:");
        System.out.println("1. Carroceria Sedan");
        System.out.println("2. Carroceria SUV");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new CarroceriaSedan();
            case 2:
                return new CarroceriaSUV();
            default:
                System.out.println("Escolha inválida.");
                return escolherCarroceria(scanner);
        }
    }

    // Método para permitir ao usuário escolher o tipo de rodas.
    private static Rodas escolherRodas(Scanner scanner) {
        System.out.println("Escolha o tipo de rodas:");
        System.out.println("1. Rodas Aro 17");
        System.out.println("2. Rodas Aro 20");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new RodasAro17();
            case 2:
                return new RodasAro20();
            default:
                System.out.println("Escolha inválida.");
                return escolherRodas(scanner);
        }
    }

    // Método para permitir ao usuário escolher o tipo de assentos.
    private static Assentos escolherAssentos(Scanner scanner) {
        System.out.println("Escolha o tipo de assentos:");
        System.out.println("1. Assentos de Couro");
        System.out.println("2. Assentos de Tecido");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new AssentosCouro();
            case 2:
                return new AssentosTecido();
            default:
                System.out.println("Escolha inválida.");
                return escolherAssentos(scanner);
        }
    }

    // Método para permitir ao usuário escolher o tipo de sistema elétrico.
    private static SistemaEletrico escolherSistemaEletrico(Scanner scanner) {
        System.out.println("Escolha o tipo de sistema elétrico:");
        System.out.println("1. Sistema Elétrico Básico");
        System.out.println("2. Sistema Elétrico Avançado");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new SistemaEletricoBasico();
            case 2:
                return new SistemaEletricoAvancado();
            default:
                System.out.println("Escolha inválida.");
                return escolherSistemaEletrico(scanner);
        }
    }
}

