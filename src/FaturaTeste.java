package AvaliacaoPratica.Q1;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura Teste = new Fatura("001", "Caneta Bic", 10 , 1.50);
        Teste.setNumero("001");
        System.out.println("Código do Item: " + Teste.getNumero());
        Teste.setDescricao("Caneta Bic");
        System.out.println("Descrição do Item: " + Teste.getDescricao());
        Teste.setQuantItem(10);
        System.out.println("Quantidade do Item: " + Teste.getQuantItem());
        Teste.setPrecoItem(1.50);
        System.out.println("Preço do Item: " + Teste.getPrecoItem());
        System.out.println("O total da compra foi de: " + Teste.getTotalFatura());
    }
}