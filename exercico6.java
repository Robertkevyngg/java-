import javax.swing.JOptionPane;

public class exercico6 {
    public static void main(String[] args) {
        // Obter a base do retângulo
        String inputBase = JOptionPane.showInputDialog("Informe a base do retângulo:");
        
        // Obter a altura do retângulo
        String inputAltura = JOptionPane.showInputDialog("Informe a altura do retângulo:");

        try {
            // Converter as entradas para valores numéricos
            double base = Double.parseDouble(inputBase);
            double altura = Double.parseDouble(inputAltura);

            // Calcular a área do retângulo
            double area = base * altura;

            // Exibir o resultado
            String resultado = String.format("A área do retângulo é: %.2f", area);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}
