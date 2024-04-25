import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Olá, vamos iniciar o cadastro da sua conta.");
        
        System.out.println("Digite o número da sua Agencia: ");
        String Agencia = scan.nextLine();
        
        System.out.println("Conta: ");
        int Conta = Integer.parseInt(scan.nextLine());
        
        System.out.println("Nome Completo: ");
        String Nome = scan.nextLine();
        
        System.out.println("Saldo: ");
        Float Saldo = Float.parseFloat(scan.nextLine());
        
        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", Conta " + Conta + " e seu saldo de R$" + Saldo + " já está disponível para saque");
    }
}