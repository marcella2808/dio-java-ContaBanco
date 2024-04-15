import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo. Para prosseguir, insira seus dados");
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Número: ");
        int numero = sc.nextInt();

        System.out.println("Agência: ");
        String agencia = sc.next();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
