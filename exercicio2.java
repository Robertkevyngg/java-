import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        // Obter o preço unitário da peça
        String inputPrecoUnitario = JOptionPane.showInputDialog("Informe o preço unitário da peça:");
        double precoUnitario = Double.parseDouble(inputPrecoUnitario);

        // Obter a quantidade vendida
        String inputQuantidade = JOptionPane.showInputDialog("Informe a quantidade vendida:");
        int quantidadeVendida = Integer.parseInt(inputQuantidade);

        // Calcular o total da venda
        double totalVenda = precoUnitario * quantidadeVendida;

        // Calcular a comissão (5% do total da venda)
        double comissao = 0.05 * totalVenda;

        // Exibir o resultado
        String resultado = String.format("O pagamento de comissão é: R$ %.2f", comissao);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
