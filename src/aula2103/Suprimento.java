package aula2103;

public class Suprimento {
    private  int numeroItem ;
    private String descricao ;
    private static int quantidade ;
    private static double precoPorItem ;

    public Suprimento(int numeroItem, String descricao, int quantidade, double precoPorItem) {
        if (quantidade < 0) {
            quantidade = 0;
        }
        if (precoPorItem < 0.0) {
            precoPorItem = 0.0;
        }
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            quantidade = 0;
        }
        this.quantidade = quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0.0) {
            precoPorItem = 0.0;
        }
        this.precoPorItem = precoPorItem;
    }

    public static double getInvoiceAmount() {
        return quantidade * precoPorItem;

    }
}
