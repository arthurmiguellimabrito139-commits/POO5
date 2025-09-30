
public class PagamentoBoleto implements IPagamento {

    private String codigoBarra;

    public void setcodicoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getcodigoBarra() {
        return codigoBarra;
    }

    public boolean processarPagamento(double valor) {

        if (valor < 1000) {
            return true;
        } else {
            return false;
        }

    }

}