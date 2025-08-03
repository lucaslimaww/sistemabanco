
import java.util.LinkedList;
import java.util.Queue;
public class FilaBancaria {
 private Queue<Cliente> filaVip = new LinkedList<>();
 private Queue<Cliente> filaPrioritaria = new LinkedList<>();
 private Queue<Cliente> filaPadrao = new LinkedList<>();
 public void adicionarCliente(Cliente cliente) {
 switch (cliente.getTipo()) {
 case VIP -> filaVip.add(cliente);
 case PRIORITARIO -> filaPrioritaria.add(cliente);
 case PADRAO -> filaPadrao.add(cliente);
 }
 }
 public Cliente chamarProximo() {
 if (!filaVip.isEmpty()) return filaVip.poll();
 if (!filaPrioritaria.isEmpty()) return filaPrioritaria.poll();
 return filaPadrao.poll();
 }
 public void exibirFila() {
  System.out.println("=-=-=-=-=-=-=  Fila VIP =-=-=-=-=-=-=");
  if (filaVip.isEmpty()) {
   System.out.println("Vazia...");
  } else {
   filaVip.forEach(filaVip -> System.out.println("Cliente: " + filaVip.getNome()));
  }
  System.out.println("=-=-=-=-=-=-= Fila Prioritária =-=-=-=-=-=-=");
  if (filaPrioritaria.isEmpty()) {
   System.out.println("Vazia...");
  } else {
   filaPrioritaria.forEach(filaPrioritaria -> System.out.println("Cliente: " + filaPrioritaria.getNome()));
  }
  System.out.println("=-=-=-=-=-=-= Fila Padrão =-=-=-=-=-=-=");
  if (filaPadrao.isEmpty()) {
   System.out.println("Vazia...");
  } else {
   filaPadrao.forEach(filaPadrao -> System.out.println("Cliente: " + filaPadrao.getNome()));
  }


 }
 public boolean filaVazia() {
 return filaVip.isEmpty() && filaPrioritaria.isEmpty() && filaPadrao.isEmpty();
 }
}
