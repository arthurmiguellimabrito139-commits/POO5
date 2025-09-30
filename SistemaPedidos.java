
public class SistemaPedidos {
        public static void main(String[] args) {

                Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 150, 15);
                Produto MousePad = new Produto("Mouse Pad Preto", 8.90, 4);
                Produto mouse = new Produto("Mouse Dell sem fio - WM118", 50, 999);
                Produto PCchina = new Produto("PC da china", 1500.00, 10);

                ItemPedido itemTeclado = new ItemPedido(teclado, 1);
                ItemPedido itemMousePad = new ItemPedido(MousePad, 2);
                ItemPedido itemMouse = new ItemPedido(mouse, 10);
                ItemPedido itemPCchina = new ItemPedido(PCchina, 1);
                ItemPedido itemMousepromo = new ItemPedido(mouse, 16);

                ItemPedido itens[] = new ItemPedido[5];
                itens[0] = itemTeclado;
                itens[1] = itemMousePad;
                itens[2] = itemMouse;
                itens[3] = itemPCchina;
                itens[4] = itemMousepromo;

                ClientePF clientePF = new ClientePF("Crystian", "flamengotetracampeaodalibertadores2025@gmail.com",
                                "123.123.123-12");
                ClientePJ clientePJ = new ClientePJ("Arthur", "saopaulodocrespo@gmail.com", "321321123131.032");

                /*
                 * System.out.println(
                 * "Nome: " + clientePF.getNome() + ", Email: " + clientePF.getEmail() +
                 * ", CPF: "
                 * + clientePF.getCpf());
                 * System.out.println(
                 * "Nome: " + clientePJ.getNome() + ", Email: " + clientePJ.getEmail() +
                 * ", CNPJ: "
                 * + clientePJ.getCnpj());
                 */

                Pedido pedido1 = new Pedido(clientePF);
                Pedido pedido2 = new Pedido(clientePJ);
                Pedido pedido3 = new Pedido(clientePF);
                Pedido pedido4 = new Pedido(clientePJ);

                PagamentoCartaoCredito pagamento1 = new PagamentoCartaoCredito();
                PagamentoCartaoCredito pagamento2 = new PagamentoCartaoCredito();
                PagamentoBoleto pagamento3 = new PagamentoBoleto();
                PagamentoBoleto pagamento4 = new PagamentoBoleto();

                pedido1.adicionarItem(itemTeclado);
                pedido1.exibiritens();
                pedido1.setmetodoPagamento(pagamento1);
                pagamento1.processarPagamento(pedido1.CalcularTotal());
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido1.CalcularTotal());
                System.out.println(pagamento1.processarPagamento(pedido1.CalcularTotal()) + "\n");

                pedido2.adicionarItem(itemMouse);
                pedido2.exibiritens();
                pedido2.setmetodoPagamento(pagamento2);
                pagamento2.processarPagamento(pedido2.CalcularTotal());
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido2.CalcularTotal());
                System.out.println(pagamento2.processarPagamento(pedido2.CalcularTotal()) + "\n");

                pedido3.adicionarItem(itemMousepromo);
                pedido3.exibiritens();
                pedido3.setmetodoPagamento(pagamento3);
                pagamento3.processarPagamento(pedido3.CalcularTotal());
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido3.CalcularTotal());
                System.out.println(pagamento3.processarPagamento(pedido3.CalcularTotal()) + "\n");

                pedido4.adicionarItem(itemPCchina);
                pedido4.exibiritens();
                pedido4.setmetodoPagamento(pagamento4);
                pagamento4.processarPagamento(pedido4.CalcularTotal());
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido4.CalcularTotal());

                System.out.println(pagamento4.processarPagamento(pedido4.CalcularTotal()) + "\n");

        }

}