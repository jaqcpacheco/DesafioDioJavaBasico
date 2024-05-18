
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha que o nextInt não consome
        
        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo: ");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                          agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}
