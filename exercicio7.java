import javax.swing.JOptionPane;

public class exercicio7 {
    public static void main(String[] args) {
        // Obter a idade em anos
        String inputAnos = JOptionPane.showInputDialog("Informe a idade em anos:");
        
        // Obter a idade em meses
        String inputMeses = JOptionPane.showInputDialog("Informe a idade em meses:");

        // Obter a idade em dias
        String inputDias = JOptionPane.showInputDialog("Informe a idade em dias:");

        try {
            // Converter as entradas para valores inteiros
            int anos = Integer.parseInt(inputAnos);
            int meses = Integer.parseInt(inputMeses);
            int dias = Integer.parseInt(inputDias);

            // Calcular a idade em dias (considerando que um ano tem 365 dias e um mês tem 30 dias)
            int idadeDias = anos * 365 + meses * 30 + dias;

            // Exibir o resultado
            String resultado = String.format("A idade em dias é: %d dias", idadeDias);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}
