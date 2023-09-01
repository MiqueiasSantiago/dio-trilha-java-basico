import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Numero: ");
        int id = sc.nextInt();
        System.out.print("Agencia: ");
        String agencia = sc.next();
        System.out.print("Saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Óla " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + id + " e o seu saldo " + saldo + " já esta disponivel para saque.");

        sc.close();
    }
}
