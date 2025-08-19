import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();
        CurrencyConverter converter = new CurrencyConverter(service);

        int option;
        do {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1. Converter USD -> BRL");
            System.out.println("2. Converter BRL -> USD");
            System.out.println("3. Converter EUR -> BRL");
            System.out.println("4. Converter BRL -> EUR");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            if (option != 0) {
                System.out.print("Digite o valor: ");
                double amount = scanner.nextDouble();
                double result = 0;

                switch (option) {
                    case 1 -> result = converter.convert("USD", "BRL", amount);
                    case 2 -> result = converter.convert("BRL", "USD", amount);
                    case 3 -> result = converter.convert("EUR", "BRL", amount);
                    case 4 -> result = converter.convert("BRL", "EUR", amount);
                    default -> System.out.println("Opção inválida.");
                }

                if (result != 0) {
                    System.out.printf("Resultado: %.2f%n", result);
                }
            }

        } while (option != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
