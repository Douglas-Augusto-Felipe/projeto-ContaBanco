import java.util.Locale;
import java.util.Scanner;

public class ContarTerminal {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Conta ");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o seu Nome ");
            String nome = scanner.next();

            System.out.println("Digite o seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " +
                    numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}
