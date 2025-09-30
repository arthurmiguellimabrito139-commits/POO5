import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private ItemPedido[] itens;
    private Cliente cliente;
    private IPagamento metodoPagamento;

    public void setmetodoPagamento(IPagamento metodIpagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public IPagamento getmetodoPagamento() {
        return metodoPagamento;
    }

    public Pedido(Cliente cliente) {
        this.itens = new ItemPedido[100];
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNome() {
        this.numero = numero;
    }

    public void setData() {
        this.data = data;
    }

    public void setStatus() {
        this.status = status;
    }

    public int getNome() {
        return this.numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getStatus() {
        return this.status;
    }

    public double CalcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += itens[i].getProduto().getPreco() * itens[i].getquantidade();
        }
        return total;
    }

    void exibirDetalhesp() {
        System.out.println("Numero: " + getNome());
        System.out.println("Data: " + getData());
        System.out.println("Status: " + getStatus());
        System.out.println(String.format("Preço: %.2f", CalcularTotal()));

    }

    private int indice = 0;

    void adicionarItem(ItemPedido item) {
        itens[indice] = item;
        indice++;

    }

    void exibiritens() {

        System.out.println("Cliente: " + this.cliente.getNome() + "\n");
        for (int i = 0; i < indice; i++) {
            System.out.println("Nome: " + this.itens[i].getProduto().getNome());
            System.out.println("Preço: R$ " + this.itens[i].getProduto().getPreco());
            System.out.println("Quantidade: " + this.itens[i].getquantidade());
            System.out.println("");
        }
    }
}
