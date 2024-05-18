package AvaliacaoPratica.Q1;

class Fatura {

    private String numero;
    private String descricao;
    private int quantItem = 0;
    private double precoItem = 0.0;

    Fatura (String numero, String descricao, int quantItem, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantItem = quantItem;
        this.precoItem = precoItem;
    }

    public String getNumero() {
        return numero;
    }
    public String getDescricao(){
        return descricao;
    }

    public int getQuantItem(){
        return quantItem;
    }

    public double getPrecoItem(){
        return precoItem;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }
    double getTotalFatura() {
        return precoItem * quantItem;
    }
    
}