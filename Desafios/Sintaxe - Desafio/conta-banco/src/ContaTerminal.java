import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();
        System.out.println("Entre com o NÚMERO da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite o NOME do titular da conta: ");
        nomeCliente = sc.next();
        sc.nextLine();
        System.out.println("Digite o SALDO da conta: ");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
