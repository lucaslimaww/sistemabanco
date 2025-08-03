
public enum TipoCliente {
 PADRAO("Padrão"),
 PRIORITARIO("Prioritário"),
 VIP("VIP");
 private final String descricao;
 TipoCliente(String descricao) {
 this.descricao = descricao;
 }
 public String getDescricao() {
 return descricao;
 }
}