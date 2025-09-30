public class PagamentoCartaoCredito implements IPagamento {

    private String NumeroCartao;

    public String getNumeroCartao() {
        return NumeroCartao;
    }

    public void setNumeroCartao(String NumeroCartao) {
        this.NumeroCartao = NumeroCartao;
    }

    public boolean processarPagamento(double valor) {

        if (valor < 200.0) {
            return true;
        } else {
            return false;
        }
    }

}
