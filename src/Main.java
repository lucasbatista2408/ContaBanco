import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        ContaTerminal c1 = new ContaTerminal();

        System.out.println("Digite seu Nome:");
        String nome = sc.nextLine();
        c1.setNome(nome);

        System.out.println("Digite sua Conta:");
        int conta = sc.nextInt();
        c1.setNumero(conta);

        System.out.println("Digite sua Agencia:");
        int agencia = sc.nextInt();
        c1.setAgencia(agencia);

        System.out.println("Digite seu Saldo:");
        double saldo = sc.nextDouble();
        c1.setSaldo(saldo);

        System.out.println(c1.toString());
    }
}