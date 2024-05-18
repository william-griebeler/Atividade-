



// Classe principal para interação com o usuário

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Aeronave aeronave = new Aeronave();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a fileira e a poltrona desejadas (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                String[] partes = entrada.split(" ");
                int fileira = Integer.parseInt(partes[0]);
                int poltrona = Integer.parseInt(partes[1]);
                String resultado = aeronave.reservarAssento(fileira, poltrona);
                System.out.println(resultado);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos para fileira e poltrona.");
            }
        }
        scanner.close();
    }
}