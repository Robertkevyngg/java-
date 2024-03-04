import javax.swing.JOptionPane;

public class exercicio {
    public static void main(String[] args) {
        // Obter a cotação do dólar
        String inputCotacao = JOptionPane.showInputDialog("Informe a cotação do dólar:");
        double cotacaoDolar = Double.parseDouble(inputCotacao);

        // Obter a quantidade de dólares
        String inputQuantidade = JOptionPane.showInputDialog("Informe a quantidade de dólares:");
        double quantidadeDolares = Double.parseDouble(inputQuantidade);

        // Calcular o valor em reais
        double valorEmReais = cotacaoDolar * quantidadeDolares;

        // Exibir o resultado
        String resultado = String.format("O valor em reais é: R$ %.2f", valorEmReais);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
