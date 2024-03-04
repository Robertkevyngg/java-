import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        // Obter a idade em anos
        String inputIdadeAnos = JOptionPane.showInputDialog("Informe a idade em anos:");
        
        try {
            // Converter a entrada para um valor inteiro
            int idadeAnos = Integer.parseInt(inputIdadeAnos);

            // Calcular a idade em dias (considerando que um ano tem 365 dias)
            int idadeDias = idadeAnos * 365;

            // Exibir o resultado
            String resultado = String.format("A idade em dias é: %d dias", idadeDias);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma idade válida em anos.");
        }
    }
}
