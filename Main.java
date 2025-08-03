import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  FilaBancaria fila = new FilaBancaria();
  CaixaFila caixa = new CaixaFila(1, fila, false);
  Scanner scanner = new Scanner(System.in);
  int opcao;

  do {
   System.out.println("### Menu de Gerenciamento Bancário ###");
   System.out.println("1. Adicionar cliente");
   System.out.println("2. Chamar próximo cliente");
   System.out.println("3. Finalizar atendimento do cliente atual");
   System.out.println("4. Exibir fila");
   System.out.println("0. Sair");
   System.out.print("Escolha uma opção: ");

   opcao = scanner.nextInt();
   scanner.nextLine();

   switch (opcao) {
    case 1:
     System.out.print("Digite o nome do cliente: ");
     String nome = scanner.nextLine();
     System.out.println("Escolha o tipo de cliente:");
     System.out.println("1 - Padrão");
     System.out.println("2 - Prioritário");
     System.out.println("3 - VIP");
     System.out.print("Opção: ");
     int tipoOpcao = scanner.nextInt();
     TipoCliente tipo;
     switch (tipoOpcao) {
      case 1:
       tipo = TipoCliente.PADRAO;
       break;
      case 2:
       tipo = TipoCliente.PRIORITARIO;
       break;
      case 3:
       tipo = TipoCliente.VIP;
       break;
      default:
       System.out.println("Opção inválida. Cliente adicionado como PADRÃO.");
       tipo = TipoCliente.PADRAO;
       break;
     }
     fila.adicionarCliente(new Cliente(nome, tipo));
     System.out.println("Cliente " + nome + " adicionado com sucesso!");
     break;
    case 2:
     caixa.chamarProximoCliente();
     break;
    case 3:
     caixa.finalizarAtendimento();
     break;
    case 4:
     fila.exibirFila();
     break;
    case 0:
     System.out.println("Saindo do sistema. Obrigado!");
     break;
    default:
     System.out.println("Opção inválida. Por favor, tente novamente.");
     break;
   }
   System.out.println();
  } while (opcao != 0);
  scanner.close();
 }
}