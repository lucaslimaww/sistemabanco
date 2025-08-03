

public class CaixaFila {
 private final int id;
 private Cliente clienteAtual;
 private final FilaBancaria fila;
 private boolean atendimento_Atual = false;
 public CaixaFila(int id, FilaBancaria fila, boolean atendimento_Atual) {
 this.id = id;
 this.fila = fila;
 this.clienteAtual = null;
 this.atendimento_Atual = atendimento_Atual;
 }
 public void chamarProximoCliente() {
  if (clienteAtual == null) {
   clienteAtual = fila.chamarProximo();
   this.atendimento_Atual = true;
   System.out.println("Caixa " + id + " chamou o cliente: " + clienteAtual.getNome());
  } else if (this.atendimento_Atual == true) {
   System.out.println("Caixa " + id + ": Um atendimento está sendo realizado no momento!");
  } else {
   System.out.println("Caixa " + id + ": Nenhum cliente na fila.");
  }
 }

 public void finalizarAtendimento() {
 if (clienteAtual != null) {
 System.out.println("Caixa " + id + " finalizou atendimento de: " +
clienteAtual.getNome());
 clienteAtual = null;
 }
 }
}