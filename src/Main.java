public class Main {
    public static void main(String[] args) {
        Suprimento meuItem = new Suprimento(501, "Cabo HDMI", 10, 201.00);
        Suprimento.getInvoiceAmount();
        System.out.println("O valor total da fatura é " + meuItem.getInvoiceAmount() );
    }

}